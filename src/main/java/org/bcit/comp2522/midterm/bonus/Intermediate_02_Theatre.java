package org.bcit.comp2522.midterm.bonus;

import java.util.ArrayList;

public class Intermediate_02_Theatre {
    private Intermediate_02_Movie movie;
    private ArrayList<Intermediate_02_Seat> seats;
    private ArrayList<Intermediate_02_Customer> customers;

    public void playMovie() {
    }

    public int countCustomers() {
        return customers.size();
    }

    public Intermediate_02_Movie getMovie() {
        return movie;
    }

    public String printCustomerList() {
        return null;
    }

    public String getStats() {return null;
    }
}