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
    private WheatField wheatField;

    public Harvester(Engine engine, GrainTank grainTank, ArrayList<Lights>lights,
                     BordComputer bordComputer, Cabin cabin, CutterBar cutterBar, ArrayList<Wheels>wheels) {

        //Associations
        this.engine = engine;
        this.grainTank = grainTank;
        this.lights = lights;
        this.bordComputer = bordComputer;
        this.cabin = cabin;
        this.cutterBar = cutterBar;
        this.wheels = wheels;




    }
    void scan(){
        bordComputer.flyingDrone();
    }
}
