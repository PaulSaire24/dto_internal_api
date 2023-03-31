package com.bbva.rbvd.dto.connectionapi.util;

public enum Errors {
    ERROR_DATABASE_EMPTY_RESULT("RBVD00000111", false, "NO SE ENCONTRÓ NINGÚN RESULTADO EN LA BD"),
    ERROR_CONNECTION_GIFOLE("RBVD01020013", false, "CONSUMO DEL SERVICIO DE GIFOLE SIN EXITO");

    private final String adviceCode;
    private final boolean rollback;
    private final String message;

    Errors(String adviceCode, boolean rollback, String message) {
        this.adviceCode = adviceCode;
        this.rollback = rollback;
        this.message = message;
    }

    public String getAdviceCode() { return adviceCode; }
    public boolean isRollback() { return rollback; }
    public String getMessage() { return message; }
}
