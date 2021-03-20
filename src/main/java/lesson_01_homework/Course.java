package lesson_01_homework;

import java.util.Arrays;

public class Course {
    Barrier[] barriers;

    public Course(Barrier... barriers) {
        this.barriers = Arrays.copyOf(barriers, barriers.length);
    }

    public void runCourse(Team team) {
        for (Barrier barrier : barriers) {
            for (Movable runner : team.getTeam()) {
                barrier.doIt(runner);
            }
        }
    }


}
