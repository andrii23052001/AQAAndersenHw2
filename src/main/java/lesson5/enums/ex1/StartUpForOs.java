package lesson5.enums.ex1;

public class StartUpForOs {
    public static void main(String[] args) {
        startPlatform(Platforms.WRONG_PLATFORM);
startPlatformsSwitchCase(Platforms.IOS);
    }
    public static void startPlatform(Platforms platforms){
        if (platforms.equals(Platforms.ANDROID)){
            System.out.println("We start on Android OS");
        } else if (platforms.equals(Platforms.IOS)) {
            System.out.println("We start on IOS OS");
        } else if (platforms.equals(Platforms.WINDOWS)) {
            System.out.println("We start on WINDOWS OS");
        }else {
            System.out.println("This is "+ Platforms.WRONG_PLATFORM);
        }
    }
    public static void startPlatformsSwitchCase(Platforms platforms){
        switch (platforms){
            case IOS -> System.out.println("We start on IOS OS");
            case ANDROID -> System.out.println("We start on Android OS");
            case WINDOWS -> System.out.println("We start on WINDOWS OS");
            default -> System.out.println("Wrong");
        }
    }
}
