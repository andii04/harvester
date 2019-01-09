public class Wheels {
    public byte getWheelSize() {
        return wheelSize;
    }

    public WheelPosition getWheelPosition() {
        return wheelPosition;
    }

    private byte wheelSize;
    private WheelPosition wheelPosition;

    public Wheels(byte wheelSize, WheelPosition wheelPosition) {
        this.wheelSize = wheelSize;
        this.wheelPosition = wheelPosition;
    }

}
