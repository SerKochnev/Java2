package lesson_01_homework;

public class Main {
    public static void main(String[] args) {
        Team team = new Team("JavaRulez",
                new Cat("SuperCat", 400, 4),
                new Human("Superman", 230, 2),
                new Robot("Bender", 350, 2.5),
                new Human("Fry", 150, 1.5));

        Course course = new Course(
                new RunningTrack(200), new Wall(1.5),
                new RunningTrack(250), new Wall(2),
                new RunningTrack(300), new Wall(3));

        course.runCourse(team);
        team.showResults();
    }
}
