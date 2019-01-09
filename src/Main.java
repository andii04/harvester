import java.util.ArrayList;
import java.util.HashMap;
//Main method for start program
public class Main {


    public static void main(String[] args) {
        WheatField wheatField = new WheatField(1000);
        Harvester harvester = new Harvester(wheatField);
        harvester.scan();
    }
}
