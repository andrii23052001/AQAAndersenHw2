package lesson4.inheritance;

public class MainForTeamMember {
    public static void main(String[] args) {
        TeamMember teamMember = new TeamMember("Ivan",33,"Doctor");
        teamMember.doWork();
        Developer developer=new Developer("Sasha",20,"IT",1);
        developer.develop();
        developer.doWork();
    }
}
