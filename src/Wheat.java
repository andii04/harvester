public class Wheat {

    short numberOfGrain;

    public Wheat() {
        this.numberOfGrain = (short) (100 + (int)(Math.random() * ((500 - 100) + 1)));
    }
}
