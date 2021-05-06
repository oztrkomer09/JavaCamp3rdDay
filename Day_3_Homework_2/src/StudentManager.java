public class StudentManager extends UserManager{
    @Override
    public void add(Student student){
        System.out.println("---*--- Kodlama.io Ana Sayfası ---*---");
        System.out.println("Student Account added");
        System.out.println("------------------------------------");
        System.out.println("İsim: " + student.getFirstName());
        System.out.println("Soy isim: " + student.getLastName());
        System.out.println("Öğrenci ID: " + student.getId());
        System.out.println("e-Mail: " + student.getEmail());
        System.out.println("Kaydolunan kurs ismi: " + student.getCourseName());

    }
}
