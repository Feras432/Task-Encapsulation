public class Student {
    private String name;
    private int age;
    private double gpa;

    public String getGpaStatus() {

        if (gpa >= 3) {
            return "Excellent";
        } else if (gpa >= 2 && gpa < 3) {
            return "Good";

        } else if (gpa < 2) {
            return "Needs Improvement";
        } else
            return "No Input";
    }

    public void setGpa(double gpa) {
        if (gpa > 4.0 || gpa < 0.0) {
            gpa = 0.0;
        } else {
            this.gpa = gpa;

        }

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}