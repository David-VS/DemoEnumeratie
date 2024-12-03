package statuscodes;

public enum StatusCode {
    SUCCES(200),
    BAD_CREDENTIALS(403),
    SERVER_ERROR(500),
    NOT_FOUND(404);

    private int error;

    StatusCode(int error) {
        this.error = error;
    }

    public int getError() {
        return error;
    }
}
