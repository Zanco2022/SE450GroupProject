
public class Trainer extends User{

    private String trainerID;

    public Trainer(String username, String password, String userID) {
        super(username, password, userID);
    }

    public String giveUserFeedback(String input) {
        return input;
    }


}
