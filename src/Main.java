//Main method for start program
public class Main {


    public static void main(String[] args) {
        WheatField wheatField = new WheatField(3000); //Generate Field
        //Generate Harvester
        Harvester harvester = new Harvester(wheatField, "Claas", 500, 200000, 30000);
        // DO the action with drone
        harvester.scan();

    }
}
