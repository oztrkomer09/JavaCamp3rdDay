public class Main {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.setId(1);
        student1.setEmail("farukozt09@gmail.com");
        student1.setFirstName("Ömer Faruk");
        student1.setLastName("Öztürk");
        student1.setCourseName("Java Yazılım Geliştirici Kampı");

        Instructor instructor1 = new Instructor();
        instructor1.setId(2);
        instructor1.setEmail("Engin@gmail.com");
        instructor1.setFirstName("Engin");
        instructor1.setLastName("Demiroğ");
        instructor1.setCodeLanguage("Java");

        Register register = new Register();
        register.register(new StudentManager() , student1);
        register.register(new InstructorManager(), instructor1);

    }

}
