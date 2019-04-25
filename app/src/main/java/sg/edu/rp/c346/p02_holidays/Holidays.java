package sg.edu.rp.c346.p02_holidays;

public class Holidays {
    private String event;
    private String date;

    public Holidays(String event, String date) {
        this.event = event;
        this.date = date;
    }

    public String getEvent() {
        return event;
    }

    public String getDate() {
        return date;
    }
}