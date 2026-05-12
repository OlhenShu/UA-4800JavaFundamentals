package com.softserve.academy.module4.homework;

enum HTTPErrors {
    BAD_REQUEST(400, "Bad Request code error: "),
    UNAUTHORIZED(401, "Unauthorized code error:  "),
    FORBIDDEN(403, "Forbidden code error: "),
    NOT_FOUND(404, "Not Found  code error: "),
    METHOD_NOT_ALLOWED(405, "Method Not Allowed  code error: "),
    ;
    private final int codeError;
    private final String nameOfError;


    HTTPErrors(int codeError, String nameOfError) {
        this.codeError = codeError;
        this.nameOfError = nameOfError;
    }

    public int getCodeError() {
        return this.codeError;
    }

    public String getNameOfError() {
        return this.nameOfError;
    }
}
