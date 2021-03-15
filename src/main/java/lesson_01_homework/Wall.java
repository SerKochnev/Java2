package lesson_01_homework;

public class Wall implements Barrier {
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
