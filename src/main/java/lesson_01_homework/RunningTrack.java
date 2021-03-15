package lesson_01_homework;

public class RunningTrack implements Barrier {
    private int distance;

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }
}
