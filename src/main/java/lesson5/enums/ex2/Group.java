package lesson5.enums.ex2;

public enum Group {
    MERRALICCA("Metallica",4000),ACDC("Acdc",6000),QEEN("Qeen",40);
    private String name;

    public String getName() {
        return name;
    }

    private int costOfTicket;

    public int getCostOfTicket() {
        return costOfTicket;
    }

    Group(String name, int costOfTicket) {
        this.name = name;
        this.costOfTicket = costOfTicket;
    }
}
