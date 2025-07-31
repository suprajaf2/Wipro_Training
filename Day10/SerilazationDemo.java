package Day10;

import java.io.*;

class Student6 implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    public Student6(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student6() {
        // default constructor
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Optional: to display the object
    @Override
    public String toString() {
        return "Student6{name='" + name + "', age=" + age + "}";
    }
}

public class SerilazationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student6 s1 = new Student6();
        s1.setName("Supraja");
        s1.setAge(21);

        // Serialization
        FileOutputStream out = new FileOutputStream("C:\\Users\\M.SUPRAJA\\Downloads\\output.txt");
        ObjectOutputStream output = new ObjectOutputStream(out);
        output.writeObject(s1);
        output.close();
        out.close();
        System.out.println("Object serialized successfully.");

        // Deserialization
        FileInputStream in = new FileInputStream("C:\\Users\\M.SUPRAJA\\Downloads\\output.txt");
        ObjectInputStream input = new ObjectInputStream(in);
        Student6 s2 = (Student6) input.readObject();
        input.close();
        in.close();

        System.out.println("Object deserialized successfully.");
        System.out.println("Name: " + s2.getName());
        System.out.println("Age: " + s2.getAge());
    }
}
