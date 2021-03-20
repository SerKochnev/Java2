package lesson_01_homework;

public class Human implements Movable {
    private String name;
    private double distance;
    private double jumpHeight;
    private boolean onTrack;

    public Human(String name, double distance, double jumpHeight) {
        this.name = name;
        this.distance = distance;
        this.jumpHeight = jumpHeight;
        this.onTrack = true;
    }

    public double getDistance() {
        return distance;
    }

    public double getJumpHeight() {
        return jumpHeight;
    }

    public boolean isOnTrack() {
        return onTrack;
    }

    @Override
    public void jump(Wall barrier) {
        if (this.getJumpHeight() <= barrier.getHeight()) onTrack = false;
    }

    @Override
    public void run(RunningTrack barrier) {
        if (this.getDistance() <= barrier.getDistance()) onTrack = false;
    }


    @Override
    public String getName() {
        return name;
    }
}
