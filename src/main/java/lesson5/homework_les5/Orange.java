package lesson5.homework_les5;

public class Orange extends Fruit {

    public Orange() {
        super(1.5f);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Orange{");
        sb.append("weight=").append(weight);
        sb.append('}');
        return sb.toString();
    }
}
