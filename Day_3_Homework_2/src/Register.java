public class Register {
    public void register(UserManager manager, User user) {
        manager.add(user);
    }

    public void register(UserManager manager, Student student) {
        manager.add(student);
    }

    public void register(UserManager manager, Instructor instructor) {
        manager.add(instructor);
    }
}
