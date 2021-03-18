package lesson_01_homework;

public class Team {
    private String name;
    private Movable[] team;

    public Team(String name, Movable o1, Movable o2, Movable o3, Movable o4) {
        this.name = name;
        this.team = new Movable[]{o1, o2, o3, o4};
    }

    public Movable[] getTeam() {
        return team;
    }

    public void showResults() {
        System.out.println("\"" + name + "\" results:");
        for (Movable runner : team) {
            System.out.println(runner.isOnTrack() ? runner.getName() + " passed course" : runner.getName() + " didn't make it...");
        }
    }
}

