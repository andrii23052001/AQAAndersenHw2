package lesson2.switch_case;

public class SwitchCaseEx {
    public static void main(String[] args) {
        String proffession = "qa";
        switch (proffession) {
            case ("Qa"):
                System.out.println("Hello Tester!!!");
                break;
            case ("Developer"):
                System.out.println("Hello Dev");
            case ("DevOps"):
                System.out.println("Hello DevOps");
                break;
            default:
                System.out.println("There is no such profession :(");
                break;
        }
    }
}
