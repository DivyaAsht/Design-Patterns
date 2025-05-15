public class Main {
    public static void main(String[] args) {
        ChatMediator med = new MedImpl();
        User user1 = new UserImpl(med, "Tom");
        User user2 = new UserImpl(med, "Ron");
        User user3 = new UserImpl(med, "Nina");

        med.addUser(user1);
        med.addUser(user2);
        med.addUser(user3);

        user1.send("Hello! How are you?");
    }
}