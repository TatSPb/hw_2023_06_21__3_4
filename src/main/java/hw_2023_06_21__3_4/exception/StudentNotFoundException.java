package hw_2023_06_21__3_4.exception;

public class StudentNotFoundException extends RuntimeException {
    private final long id;

    public StudentNotFoundException(long id) {
        this.id = id;
    }

    @Override
    public String getMessage() {
        return "Студент с id = " + id + " не найден!";
    }
}
