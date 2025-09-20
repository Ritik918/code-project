package challenges;

 class OnlineCourse {
    String courseName;
    int enrollment;
    String[] enrolledStudent = new String[maxcapacity];
     
    static int maxcapacity = 6; //static variable
     
      //constructor
    OnlineCourse(String courseName){
        this.courseName = courseName;
        this.enrollment = 0; // by default
    }

    
    // static method to set maxcapacity
static void setMaxcapacity(int capacity){
    maxcapacity = capacity;
    System.out.println("Maximum course capacity set to" + maxcapacity);
}
// instance method to enroll a student
void enrolledStudent(String studentName){
    if(enrollment < maxcapacity){
        System.out.println(studentName + " has been enrolled in" + courseName);
       }
       else{
        System.out.println("cannot enrolled" + studentName + "Maximun capacity reached");
       }
    enrolledStudent[enrollment] = studentName;
    enrollment++;
}
// instance method to unenroll a student
void unenrollmentStudent(String studentName){
    if(enrollment > maxcapacity){
        System.out.println(studentName + "has been unenrolled" + courseName);
    }
    else{
        System.out.println(studentName +"is not enrolled in course" + courseName);
    }

    System.out.println("student removed");
    enrollment--;
}
public static void main(String[] args) {
    
    
    OnlineCourse java = new OnlineCourse("java progrsmming"); // create a course

    // enroll students
    java.enrolledStudent("ritik");
    java.enrolledStudent("rainy");
    java.enrolledStudent("raj");
    java.enrolledStudent("aman");
    java.enrolledStudent("ankit");
    java.enrolledStudent("raju");
    // unenrll student due to maximum capacity reached
    java.enrolledStudent("ram");
    java.enrolledStudent("rohan");
    java.enrolledStudent("raja");

    

}
    
}
