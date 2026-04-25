package module4_Kateryna.homework_optional;

public enum HTTPError {
    BAD_REQUEST(400, "Bad Request"),
    FORBIDDEN(403, "Forbidden"),
    NOT_FOUND(404, "Not Found"),
    INTERNAL_SERVER_ERROR(500, "Internal Server Error"),
    BAD_GATEWAY(502, "Bad Gateway");

    private final int numberOfTheError;
    private final String nameOfTheError;

    HTTPError(int numberOfTheError, String nameOfTheError) {
        this.numberOfTheError = numberOfTheError;
        this.nameOfTheError = nameOfTheError;
    }

    public String getNameOfTheError() {
        return nameOfTheError;
    }

    public int getNumberOfTheError() {
        return numberOfTheError;
    }
}
