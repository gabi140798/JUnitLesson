package pl.kurs.zadanie1;

public class ArrayIsNullException extends RuntimeException{

    public ArrayIsNullException() {
    }

    public ArrayIsNullException(String message) {
        super(message);
    }
}
