
public class Workout  {

    private String workoutName;
    private int numReps;

    public Workout(String workoutName, int numReps) {
        this.workoutName = workoutName;
        this.numReps = numReps;
    }

    public void setCustomWorkout(String workoutName, int numReps) {

        this.workoutName = workoutName;
        this.numReps = numReps;

    }

}
