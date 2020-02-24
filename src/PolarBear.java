public class PolarBear extends Bear{
    int POLAR_BEAR_SPEED;

    public PolarBear() {
    }

    @Override
    public String toString() {
        return "PolarBear{" +
                "POLAR_BEAR_SPEED=" + POLAR_BEAR_SPEED +
                '}';
    }

    public int getSpeed() {
        return POLAR_BEAR_SPEED;
    }
}
