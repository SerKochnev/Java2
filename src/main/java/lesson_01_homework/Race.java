package lesson_01_homework;

public class Race {
    void start(Movable[] participants, Barrier[] barriers) {

        for (Movable runner : participants) {
            for (Barrier barrier : barriers) {
                if (barrier instanceof Wall) {
                    if (runner.jump((Wall) barrier)) {
                        System.out.println(runner.getClass().getName() + " successfully jumped over the wall");
                    } else {
                        System.out.println(runner.getClass().getName() + "leave the race");
                        break;
                    }
                } else {
                    if (runner.run((RunningTrack) barrier)) {
                        System.out.println(runner.getClass() + " successfully ran the distance");
                    } else {
                        System.out.println(runner.getClass() + " leave the race");
                        break;
                    }
                }
            }
        }
    }
}
