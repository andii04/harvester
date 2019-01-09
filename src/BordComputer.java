import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class BordComputer {
    WheatField wheatField;
    TreeMap<Position, Short> treeMap;

    public BordComputer(WheatField wheatField){
        this.wheatField = wheatField;
    }
    void flyingDrone(){
        Drone d = new Drone();
        d.scan(wheatField);

        treeMap = new TreeMap<Position, Short>(new Comparator<Position>()
        {
            public int compare(Position p1, Position p2)
            {
                return p1
            }
        });
    }
    void sortField(){/*
        Collections.sort(treeMap, new Comparator<Person>() {
            @Override
            public int compare(Person first, Person second) {
                return first.getFirstName().compareTo(second.getFirstName());
            }
        });*/
    }
}
