package com.example.config;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Properties;

/**
 * FAULTY "Singleton": public constructor, getInstance() returns a NEW instance
 * each time,
 * not thread-safe, reload allowed anytime, mutable global state,
 * reflection+serialization-friendly.
 */

public class AppSettings implements Serializable {
    private static volatile AppSettings instance;
    private static final Object lock = new Object();
    private final Properties props = new Properties();
    
    private AppSettings() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to get the single instance");
        }
    }
    
    public static AppSettings getInstance() {
        if (instance == null) {
            synchronized (lock) {
                if (instance == null) {
                    instance = new AppSettings();
                }
            }
        }
        return instance;
    }
    
    private Object readResolve() throws ObjectStreamException {
        return getInstance();
    }

    public void loadFromFile(Path file) {
        try (InputStream in = Files.newInputStream(file)) {
            props.load(in);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    public String get(String key) {
        return props.getProperty(key);
    }
}
