package lesson_01_homework;

public interface Movable extends Nameable{
    void jump(Wall barrier);

    void run(RunningTrack barrier);
}
