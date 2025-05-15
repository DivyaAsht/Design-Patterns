import java.util.ArrayList;

interface ChatMediator {
    void addUser(User user);
    void sendMessage(String message, User user);
}