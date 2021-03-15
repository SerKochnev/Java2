package lesson_01_homework;

public class Main {
    public static void main(String[] args) {
        Movable[] runners = {
                new Cat(400, 4),
                new Human(230, 2),
                new Robot(350, 2.5),};
        Barrier[] barriers = {
                new RunningTrack(200), new Wall(1.5),
                new RunningTrack(250), new Wall(2),
                new RunningTrack(300), new Wall(3)};

        new Race().start(runners, barriers);
    }
}
