public class App {
    public static void main(String[] args) throws Exception {
        Student student1 = new Student();
        student1.setName("Feras");
        System.out.println("Student Name:" + student1.getName());
        student1.setAge(20);
        System.out.println("Student age:" + student1.getAge());
        student1.setGpa(1.9);
        System.out.println("Student GPA: " + student1.getGpaStatus());
        Student student2 = new Student();
        student2.setName("Hamad");
        System.out.println("Student Name:" + student2.getName());
        student2.setAge(21);
        System.out.println("Student age:" + student2.getAge());
        student2.setGpa(3);
        System.out.println("Student GPA: " + student2.getGpaStatus());

    }
}
