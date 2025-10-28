class Prototype implements Cloneable {
    String modelName;
    int version;

    public Prototype(String modelName, int version) {
        this.modelName = modelName;
        this.version = version;
    }

    // Overriding clone() method
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Cloning not supported!");
        }
    }

    @Override
    public String toString() {
        return "Prototype{modelName='" + modelName + "', version=" + version + "}";
    }
}

public class ObjectCloning {
    public static void main(String[] args) {
        Prototype original = new Prototype("AI_Model", 1);
        Prototype copy = original.clone();

        System.out.println("Original: " + original);
        System.out.println("Cloned: " + copy);
    }
}
