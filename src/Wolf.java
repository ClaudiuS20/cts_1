public class Wolf implements Runner{
    int WOLF_SPEED;

    public Wolf() {
    }

    @Override
    public String toString() {
        return "Wolf{" +
                "WOLF_SPEED=" + WOLF_SPEED +
                '}';
    }

    public int getSpeed() {
        return WOLF_SPEED;
    }
}
