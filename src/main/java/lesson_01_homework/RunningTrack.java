package lesson_01_homework;

public class RunningTrack implements Barrier {
    private int distance;

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    @Override
    public void doIt(Movable movable) {
        movable.run(this);
    }

    public int getDistance() {
        return distance;
    }
}
