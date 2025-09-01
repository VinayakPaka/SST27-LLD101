package com.example.profiles;

/**
 * Mutable and confusing. Multiple constructors + setters.
 */

public final class UserProfile {
    private final String id;
    private final String email;
    private final String phone;
    private final String displayName;
    private final String address;
    private final boolean marketingOptIn;
    private final String twitter;
    private final String github;

    private UserProfile(Builder b) {
        this.id = b.id;
        this.email = b.email;
        this.phone = b.phone;
        this.displayName = b.displayName;
        this.address = b.address;
        this.marketingOptIn = b.marketingOptIn;
        this.twitter = b.twitter;
        this.github = b.github;
    }

    public String getId() { 
        return id; 
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getAddress() {
        return address;
    }

    public boolean isMarketingOptIn() {
        return marketingOptIn;
    }

    public String getTwitter() {
        return twitter;
    }

    public String getGithub() {
        return github;
    }

    public Builder toBuilder() {
        Builder b = new Builder(this.id, this.email);
        b.phone = this.phone;
        b.displayName = this.displayName;
        b.address = this.address;
        b.marketingOptIn = this.marketingOptIn;
        b.twitter = this.twitter;
        b.github = this.github;
        return b;
    }

    public static final class Builder {
        private String id;
        private String email;
        private String phone;
        private String displayName;
        private String address;
        private boolean marketingOptIn;
        private String twitter;
        private String github;

        public Builder(String id, String email) {
            this.id = id;
            this.email = email;
        }

        public Builder phone(String phone) {
            this.phone = phone;
            return this; 
        }

        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder marketingOptIn(boolean marketingOptIn) {
            this.marketingOptIn = marketingOptIn;
            return this;
        }

        public Builder twitter(String twitter) {
            this.twitter = twitter; 
            return this;
        }

        public Builder github(String github) {
            this.github = github;
            return this;
        }

        public UserProfile build() {
            Validation.requireNonBlank(id, "id");
            Validation.requireEmail(email);
            return new UserProfile(this);
        }
    }
}
