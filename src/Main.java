import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        WheatField wheatField = new WheatField();
        System.out.println(wheatField.field[0][0].numberOfGrain);
        System.out.println(wheatField.field[0][1].numberOfGrain);
        System.out.println(wheatField.field[0][2].numberOfGrain);
        System.out.println(wheatField.field[0][3].numberOfGrain);
        System.out.println(wheatField.field[0][4].numberOfGrain);


        Drone d = new Drone();
        d.scan(wheatField);
    }
}
