package lesson_03_homework;



public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Petrov", 9222);
        phonebook.add("Petrov", 8888);
        phonebook.add("NePetrov", 8098);

        phonebook.get("Petrov");
    }
}
