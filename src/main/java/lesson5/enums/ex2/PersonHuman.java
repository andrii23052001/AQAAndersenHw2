package lesson5.enums.ex2;

public class PersonHuman {
    private String name;
    public int money;

    public String getName() {
        return name;
    }

    public PersonHuman(String name, int money) {
        this.name = name;
        this.money = money;
    }
    public void whichGroupCanVisit(){
        if (money<Group.MERRALICCA.getCostOfTicket()){
            System.out.println("Stay at home");
        } else if (money<Group.ACDC.getCostOfTicket()&&money<Group.MERRALICCA.getCostOfTicket()) {
            System.out.println(getName()+"you can go to "+ Group.MERRALICCA.getName() + " " );

        }
    }
}
