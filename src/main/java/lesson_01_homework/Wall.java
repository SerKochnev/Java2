package lesson_01_homework;

public class Wall implements Barrier {
    private double height;

    @Override
    public void doIt(Movable movable) {
        movable.jump(this);
    }

    public Wall(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
