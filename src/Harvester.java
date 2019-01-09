import java.lang.reflect.Array;
import java.util.ArrayList;

public class Harvester extends Vehicle {

    private Engine engine;
    private GrainTank grainTank;
    private ArrayList<Lights> lights;
    private BordComputer bordComputer;
    private Cabin cabin;
    private CutterBar cutterBar;
    private ArrayList<Wheels>wheels;

    public Harvester(WheatField wheatField) {

        //Associations
        lights = new ArrayList<>();
        lights.add(new Lights(LightType.frontlight));
        lights.add(new Lights(LightType.backlight));
        wheels= new ArrayList<>();
        wheels.add(new Wheels());
        wheels.add(new Wheels());
        wheels.add(new Wheels());
        wheels.add(new Wheels());
        engine = new Engine();
        grainTank = new GrainTank();
        bordComputer = new BordComputer(wheatField);
        cabin = new Cabin();
        cutterBar = new CutterBar();


    }
    void scan(){
        bordComputer.flyingDrone();
    }
}
