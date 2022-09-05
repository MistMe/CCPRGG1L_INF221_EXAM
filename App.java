public class App {
    public static void main(String[] args) throws Exception {
       
        Student Student = new Student();
        Student.surname = "Torrenueva";
        Student.firstname = "Lyod Rhussel";
        Student.middlein = "L.";
        Student.dateofbirth = "02/27/2004";
        Student.studentno = 2022102132;
        Student.studentemail = "torrenuevall@students.national-u.edu.ph";
        Student.iamawesome = true;

        Student.sayMyStudentNumber();
        Student.sayMyEmailAddress();
        Student.AmIAwesome();




    }
}
