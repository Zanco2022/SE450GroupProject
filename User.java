
public class User {

    private String username;
    private String password;
    private String userID;
    private Workout currWorkout;

    private String feedback;

    public User(String username, String password, String userID) {
        this.username = username;
        this.password = password;
        this.userID = userID;

    }

    public Workout getCurrWorkout() {
        return this.currWorkout;
    }

    public String getFeedback() { return this.feedback; }

    public void setWorkout(Workout workout) {
        this.currWorkout = workout;
    }



}
