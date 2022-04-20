package PRO2
public class Pro2 {
    public static void main(String[] args) {
        Course course = new Course("ONEPIECE CLASS");
        //ADDSTUDENT -> CLASS
        course.addStudent("LUFY");
        course.addStudent("ZORO");
        course.addStudent("SUNJI");
        course.addStudent("CHOPPER");

        //DROPSTUDENT -> CLASS
        course.dropStudent("");
        

        //course.clear();
       
        String[] students = course.getStudents();
        System.out.printf("Course : %s\n", course.getCourseName());

        for (String student : students) 
        {
            System.out.printf("%s \n", student);
        }
        
        System.out.printf("Number of students in %s : %d students\n", course.getCourseName(), course.getNumberOfStudents());

  
    }
}
