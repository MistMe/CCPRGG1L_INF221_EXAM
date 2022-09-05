public class Student {

    String surname;
    String firstname;
    String middlein;
    String dateofbirth;
    int studentno;
    String studentemail;
    boolean iamawesome;

    public void sayMyStudentNumber() {
        System.out.println("My Student Number:" + studentno);
    }

    public void sayMyEmailAddress() {
        System.out.println("My Email Address:" + studentemail);
    }

    public void AmIAwesome() {
        System.out.println("I am Awesome:" + iamawesome);
    }

}
