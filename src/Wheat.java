public class Wheat {

    private Position position;

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public short getNumberOfGrain() {
        return numberOfGrain;
    }

    public void setNumberOfGrain(short numberOfGrain) {
        this.numberOfGrain = numberOfGrain;
    }

    private short numberOfGrain;

    public Wheat() {
        setNumberOfGrain((short) (100 + (int)(Math.random() * ((500 - 100) + 1))));
    }


}
