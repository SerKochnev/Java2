package lesson_02_homework;

public class MyArraySizeException extends RuntimeException{

    public MyArraySizeException() {
        super();
    }

    public MyArraySizeException(String message) {
        super(message);
    }
}
