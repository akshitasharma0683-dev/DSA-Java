class Student{
    int roll;
    String name;
    double marks;

Student (int roll, String name, double marks){
    this.roll=roll;
    this.name=name;
    this.marks=marks;
}
}

public class example{
public static void main(String[] args) {
    
    Student s1 = new Student(101, "akshita",77.88);

    System.out.println(s1.marks);
    System.err.println(s1.name);
    System.out.println(s1.roll);
}
}