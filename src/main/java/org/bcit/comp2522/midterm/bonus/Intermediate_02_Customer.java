package org.bcit.comp2522.midterm.bonus;

public class Intermediate_02_Customer implements Intermediate_02_Payable {
    private String fName;
    private String lName;
    private int money;

    public Intermediate_02_Customer(String fName, String lName, int money) {
    }

    public String customerStats() {
        return null;
    }

    @Override
    public String makePayment(int amount) {
        Intermediate_02_Ticket ticket = new Intermediate_02_Ticket();
        return ticket.getStats();
    }
}
