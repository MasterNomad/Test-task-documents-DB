package model;

public class MarriageCertificate {
    final private String date;
    final private String organization;
    final private Pasport husband;
    final private Pasport wife;

    public MarriageCertificate(String date, String organization, Pasport husband, Pasport wife) {
        this.date = date;
        this.organization = organization;
        this.husband = husband;
        this.wife = wife;
    }
}
