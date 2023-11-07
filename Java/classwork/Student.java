// public class Student {
//   String firstName;
//   String lastName;
//   int age;
  
//   public static void main(String args[]) {
//       Student myStudent = new Student();
      
//       myStudent.firstName = "Pavi";
//       myStudent.lastName = "tharani";
//       myStudent.age = 22;
      
//       System.out.println(myStudent.age);
//       System.out.println(myStudent.firstName + myStudent.lastName);
    
//   }
// }

// public class Student {

//    //Private fields
//    private String name;
//    private String nationalID;
//    private String county;
//    private String gender;  

//    Student(){

//    }
   
//    public static void main(String args[]){
//     Student myStudent = new Student();
//    }

//    //Constructor method
//    public Student(String name, String nationalID, String county, String gender)
//    {
//      this.name = name;
//      this.nationalID = nationalID;
//      this.county = county;
//      this.gender = gender;

//    }

//    //Accessor for name
//    public String name()
//    {
//      return name;
//    }

//    //Accessor for nationalID
//    public String nationalID()
//    {
//      return nationalID;
//    }

//    //Accessor for county
//    public String county()
//    {
//      return county;
//    }

//     //Accessor for gender
//    public String gender()
//    {
//      return gender;
//    }

//  }


//  public class Student {
//   String name;
//   int age;
  
//  }

// public class Student{
// String studentName;
// int studentAge;
// //constructor
// Student(String name, int age){
// studentName = name;
// studentAge = age;
// }
// void display(){
// System.out.println(studentName+ " "+studentAge);
// }
// public static void main(String args[])
// {
// Student myObj = new Student("Manan" , 19);
// myObj.display();
// }
// }

public class Student {
    private int id;
    private String name;
   
    public static void main(String[] args){
      
    }

    public Student(Student student) {
        this.id = student.id;
        this.name = student.name;
       
    }
}



