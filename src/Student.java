public class Student {
    static String collegeName = "University of Westminster";
    private String studentName;
    public Student(String studentName){
        this.studentName = studentName;
    }
    public void display(){
        System.out.println("College Name: " + collegeName);
        System.out.println("Student Name: " + studentName);
    }
    public static void main(String[] args){
        Student s1 = new Student("Kriththigan");
        s1.display();
    }
}
