import java.util.ArrayList;
import java.util.HashMap;
//Main method for start program
public class Main {


    public static void main(String[] args) {
        ArrayList<Lights> lights = new ArrayList<>();
        lights.add(new Lights(LightType.frontlight));
        lights.add(new Lights(LightType.backlight));
        Harvester harvester = new Harvester(new Engine(),new GrainTank(),lights, new BordComputer(),new Cabin(),new CutterBar());
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
