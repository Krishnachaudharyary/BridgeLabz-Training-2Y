import java.io.*;

// Class marked as Serializable (marker interface)
class UserData implements Serializable {
    private String username;
    private int age;

    public UserData(String username, int age) {
        this.username = username;
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserData{username='" + username + "', age=" + age + "}";
    }
}

public class BackupSerialization {
    public static void main(String[] args) {
        UserData user = new UserData("Krishna", 22);

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("backup.ser"))) {
            out.writeObject(user);
            System.out.println("✅ User data serialized for backup.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("backup.ser"))) {
            UserData restored = (UserData) in.readObject();
            System.out.println("💾 Restored from backup: " + restored);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
