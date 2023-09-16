package homeWork3;

public class MyCheckSizeArrayException extends RuntimeException {
    public MyCheckSizeArrayException() {
        super("Количество данных не соответствует заданному значению");
    }
}
