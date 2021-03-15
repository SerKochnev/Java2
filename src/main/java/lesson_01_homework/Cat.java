package lesson_01_homework;

public class Cat implements Movable{
    private double distance;
    private double jumpHeight;

    public Cat(double distance, double jumpHeight) {
        this.distance = distance;
        this.jumpHeight = jumpHeight;
    }

    public double getDistance() {
        return distance;
    }

    public double getJumpHeight() {
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
