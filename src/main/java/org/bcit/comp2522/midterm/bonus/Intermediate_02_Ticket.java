package org.bcit.comp2522.midterm.bonus;

public class Intermediate_02_Ticket {
    private Intermediate_02_Movie movie;
    private Intermediate_02_Theatre theatre;
    private Intermediate_02_Seat seat;
    private int price;
    private int showTime;

    private String stats;

    public Intermediate_02_Ticket() {
        Intermediate_02_Seat s = this.getSeat();
        Intermediate_02_Theatre t = this.getTheatre();
        Intermediate_02_Movie m = this.getMovie();
        this.stats = ticketDetails(s, t, m);
    }

    public String ticketDetails(Intermediate_02_Seat s, Intermediate_02_Theatre t, Intermediate_02_Movie m) {
        return s.getPosition() + t.getStats() + m.movieDetails();
    }
    public String getStats() {
        return stats;
    }

    public Intermediate_02_Seat getSeat() {
        return null;
    }

    public Intermediate_02_Theatre getTheatre() {
        return null;
    }

    public Intermediate_02_Movie getMovie() {
        return null;
    }
}
