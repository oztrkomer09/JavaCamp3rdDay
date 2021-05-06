public class InstructorManager extends UserManager {
    @Override
    public void add(Instructor instructor){
        System.out.println("---*--- Kodlama.io Ana Sayfası ---*---");
        System.out.println("Instructor account added.");
        System.out.println("------------------------------------");
        System.out.println("İsim: " + instructor.getFirstName());
        System.out.println("Soy isim: " + instructor.getLastName());
        System.out.println("Eğitmen ID: " + instructor.getId());
        System.out.println("e-Mail: " + instructor.getEmail());
        System.out.println("Kullanılan yazılım dili: " + instructor.getCodeLanguage());
    }
}
