public class StudentRunner {
    public static void main(String[]args) {


        Student student1 = new Student("Wilson", 68, 135);
        Student student2 = new Student("Prajwol", 76, 180);


        student1.introduce();
        student1.studentStats();



        student2.introduce();
        student2.studentStats();
    }
}