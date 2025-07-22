package entityclassassignment1;

public class Student {
	private int rollNumber;
    private String name;
    private int age;

    // Constructor
    public Student(int rollNumber, String name, int age) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
    }

    // Getters
    public int getRollNumber() {
        return rollNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // toString for easy display
    @Override
    public String toString() {
        return "Student [Roll Number=" + rollNumber + ", Name=" + name + ", Age=" + age + "]";
    }
}
