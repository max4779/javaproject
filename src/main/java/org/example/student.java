package org.example;

public class student {
    private String first;
    private static String second;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public student(String first, String second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "student : "+first+" "+second;
    }
}
