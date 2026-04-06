package main.java;

enum MarkerCategory {

    CIRCLE("o"),
    X("x");

    private final String marker;

    MarkerCategory(String marker) {
        this.marker = marker;
    }

    public String getMarker() {
        return marker;
    }

}
