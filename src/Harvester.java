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
        wheels.add(new Wheels((byte)30,WheelPosition.VR));
        wheels.add(new Wheels((byte)30,WheelPosition.VL));
        wheels.add(new Wheels((byte)30,WheelPosition.HL));
        wheels.add(new Wheels((byte)30,WheelPosition.HR));
        engine = new Engine(500, true);
        grainTank = new GrainTank(50000);
        bordComputer = new BordComputer(wheatField);
        cabin = new Cabin();
        cutterBar = new CutterBar();


    }
    void scan(){
        bordComputer.flyingDrone();
    }
}
