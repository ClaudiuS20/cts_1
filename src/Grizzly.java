public class Grizzly extends Bear{
    int GRIZLLY_SPEED;

    public Grizzly() {
    }

    @Override
    public String toString() {
        return "Grizzly{" +
                "GRIZLLY_SPEED=" + GRIZLLY_SPEED +
                '}';
    }

    public int getSpeed() {
        return GRIZLLY_SPEED;
    }
}
