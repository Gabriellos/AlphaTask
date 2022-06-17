package com.alpha.task.model;

public class GiphyGetParameters {
    private static String api_key = "W1EG9H97MhCuas32RSs3A0c5rpcE8ehV";
    private static String limit = "25";
    private static String rating = "g";


    private String q;

    public GiphyGetParameters(String q) {
        this.q = q;
    }

    public static String getApi_key() {
        return api_key;
    }

    public static void setApi_key(String api_key) {
        GiphyGetParameters.api_key = api_key;
    }

    public static String getLimit() {
        return limit;
    }

    public static void setLimit(String limit) {
        GiphyGetParameters.limit = limit;
    }

    public static String getRating() {
        return rating;
    }

    public static void setRating(String rating) {
        GiphyGetParameters.rating = rating;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

}
