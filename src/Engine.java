public class Engine {
    private int horsePower;
    private boolean isOn;

    public Engine(int horsePower, boolean isOn) {
        this.horsePower = horsePower;
        this.isOn = isOn;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }
}

