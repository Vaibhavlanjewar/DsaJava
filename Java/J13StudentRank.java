class Student {
    int rollno;
    int marks;
    String name;
    public Student(int rollno,int marks,String name){
        this.marks=marks;
        this.rollno=rollno;
        this.name=name;
    }
}

public class J13StudentRank {
    public static void main(String args[]) {
        Student s1 = new Student(1,97,"Vaibhav");
      

        Student s2 = new Student(2,96,"vnbl");
      

        Student s3 = new Student(3,90,"ram");
        

        Student[] stud = new Student[3];
        stud[0] = s1;
        stud[1] = s2;
        stud[2] = s3;

        // Print all students' names and marks
        // for (int i = 0; i < stud.length; i++) {
        //     System.out.println(stud[i].name + " : " + stud[i].marks);
        // }

        // enhanced for loop
        for(Student st:stud){
             System.out.println(st);
        }
    }
}
