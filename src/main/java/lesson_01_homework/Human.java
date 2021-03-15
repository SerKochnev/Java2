package lesson_01_homework;

public class Human implements Movable {
    private int distance;
    private int jumpHeight;

    public Human(int distance, int jumpHeight) {
        this.distance = distance;
        this.jumpHeight = jumpHeight;
    }

    public int getDistance() {
        return distance;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    @Override
    public boolean jump(Wall barrier) {
        return this.getJumpHeight() >= barrier.getHeight();
    }

    @Override
    public boolean run(RunningTrack barrier) {
        return this.getDistance() >= barrier.getDistance();
    }
}
