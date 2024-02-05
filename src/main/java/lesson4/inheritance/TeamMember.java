package lesson4.inheritance;

public class TeamMember {
    public String name;
    public int age;
    public String profession;

    @Override
    public String toString() {
        return "TeamMember{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", profession='" + profession + '\'';
    }

    public TeamMember(String name, int age, String profession) {
        this.name = name;
        this.age = age;
        this.profession = profession;
    }

    public void doWork(){
        System.out.println("I do my work(TeamMember)");
    }
}
