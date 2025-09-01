import com.example.profiles.*;

public class TryIt {
    public static void main(String[] args) {
        ProfileService svc = new ProfileService();
        UserProfile p = svc.createMinimal("u1", "a@b.com");
        System.out.println("Email: " + p.getEmail());
        System.out.println("Name before: " + p.getDisplayName());
        UserProfile p2 = svc.withDisplayName(p, "Very Long Name That Might Be Trimmed Because It Exceeds The Maximum Length Set In Service Lorem Ipsum Dolor Sit Amet");
        System.out.println("Name after:  " + p2.getDisplayName());
        System.out.println("Original unchanged? " + (p.getDisplayName() == null));
    }
}
