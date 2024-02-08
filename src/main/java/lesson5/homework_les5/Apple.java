package lesson5.homework_les5;

public class Apple extends Fruit {
    public Apple() {
        super(2f);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Apple{");
        sb.append("weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}
