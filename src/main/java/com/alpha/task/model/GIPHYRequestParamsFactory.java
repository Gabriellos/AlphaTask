package com.alpha.task.model;

public class GIPHYRequestParamsFactory {
    public static GiphyGetParameters getParameters(String searchPhrase) {
        return new GiphyGetParameters(searchPhrase);
    }
}
