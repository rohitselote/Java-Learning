class Student {
    int roll;
    String name;

    Student(int roll,String name){
      this.roll=roll;
      this.name=name;
        
    }
    void printStudentDetails(){
        System.out.println("Name: "+ name);
        System.out.println("Roll no: "+ roll);
    }
    
}
public class arrayOfObject {
    public static void main(String[] args) {
        Student[] stu = new Student[3];
        stu[0]= new Student(101,"Stark");
        stu[1]=new Student(102,"Marcus");
        stu[2]=new Student(103,"Tyson");

    stu[0].printStudentDetails();
    }
}
