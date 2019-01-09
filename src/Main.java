import java.util.ArrayList;
import java.util.HashMap;
//Main method for start program
public class Main {


    public static void main(String[] args) {
        ArrayList<Lights> lights = new ArrayList<>();
        lights.add(new Lights(LightType.frontlight));
        lights.add(new Lights(LightType.backlight));
        ArrayList<Wheels> wheels = new ArrayList<>();
        wheels.add(new Wheels());
        wheels.add(new Wheels());
        wheels.add(new Wheels());
        wheels.add(new Wheels());
        WheatField wheatField = new WheatField();
        System.out.println(wheatField.field[0][0].numberOfGrain);
        System.out.println(wheatField.field[0][1].numberOfGrain);
        System.out.println(wheatField.field[0][2].numberOfGrain);
        System.out.println(wheatField.field[0][3].numberOfGrain);
        System.out.println(wheatField.field[0][4].numberOfGrain);
        Harvester harvester = new Harvester(new Engine(),new GrainTank(),lights, new BordComputer(wheatField),new Cabin(),new CutterBar(), wheels);
        harvester.scan();
    }
}
