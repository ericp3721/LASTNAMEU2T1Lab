public class Student {
    private String name;
    private double height;
    private int weight;

    public Student(String n, double h, int w) {
        name = n;
        height = h;
        weight = w;
    }

    public void introduce() {
        if (height >= 70) {
            System.out.println("Hi, my name is " + name + " and I am tall.");
        } else {
            System.out.println("Hi, my name is " + name + " and I am not tall");
        }
    }

    public void studentStats() {
        System.out.println("Student: " + name);
        System.out.println("height: " + height + " inches");
        System.out.println("weight: " + weight + " pounds");
    }
}