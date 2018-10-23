package model;

public class Pasport {

    final private String name;
    final private String surname;
    final private String secondName;
    final private int series;
    final private int number;
    final private String date;

    public Pasport(String name, String surname, String secondName, int series, int number, String date) {
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.series = series;
        this.number = number;
        this.date = date;
    }
}
