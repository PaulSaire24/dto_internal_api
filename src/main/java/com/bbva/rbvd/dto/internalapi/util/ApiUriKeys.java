package com.bbva.rbvd.dto.internalapi.util;

public enum ApiUriKeys {
    GIFOLE("createGifoleInsuranceRequest", 1, "https://aus-arqaso.work.pe.nextgen.igrupobbva:8050/gifole/v0/insurances-requests");

    private final String consoleKey;
    private final Integer invokeType;
    private final String uri;

    ApiUriKeys(String consoleKey, Integer invokeType, String uri) {
        this.consoleKey = consoleKey;
        this.invokeType = invokeType;
        this.uri = uri;
    }

    public String getConsoleKey() { return consoleKey; }
    public Integer getInvokeType() { return invokeType; }
    public String getUri() { return uri; }
}
