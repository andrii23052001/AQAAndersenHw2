package lesson4.inheritance;

public class Developer extends TeamMember{
public int y;
public void develop(){
    System.out.println("I develop!!!");
}

    public Developer(String name, int age, String profession, int y) {
        super(name, age, profession);
        this.y = y;
    }

    public void doWork(){
        System.out.println("I do my work (Developer)");
    }
}
