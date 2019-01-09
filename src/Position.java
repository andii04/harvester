public class Position {

    public  Position(int x, int y){
        this.x = x;
        this.y =y;
    }
    private int x;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private int y;

    @Override
    public String toString(){
        return "Position : " + getX() + "/" + getY();

    }
}
