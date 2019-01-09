import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;

public class BordComputer {
    private WheatField wheatField;
    TreeMap<Position, Short> treeMap;

    public BordComputer(WheatField wheatField){
        this.wheatField = wheatField;
    }

    void flyingDrone(){

        Drone d = new Drone();
        d.scan(wheatField); //Wheatfield gets Position(x,y) because of scan
        //add scanned field to Hash
        addFieldToMap();


    }
    void addFieldToMap(){
        treeMap = new TreeMap<>(new Comparator<Position>() {
            @Override //Override Compare Func
            public int compare(Position p1, Position p2) {
                if(wheatField.field[p1.x][p1.y].getNumberOfGrain() == wheatField.field[p2.x][p2.y].getNumberOfGrain()){
                    if (p1.x == p2.x){
                        return p1.y - p2.y;
                    }
                    else return p1.x -p2.x;
                }
                else return wheatField.field[p2.x][p2.y].getNumberOfGrain() - wheatField.field[p1.x][p1.y].getNumberOfGrain();
            }
        });
        for(short i = 0; i<wheatField.getFieldSize(); i++){
            for(short j = 0; j<wheatField.getFieldSize(); j++){
                treeMap.put(wheatField.field[i][j].getPosition(), wheatField.field[i][j].getNumberOfGrain());
            }
        }
        outPut();
    }
    void outPut(){
        for (Position treeKey : treeMap.keySet()){
            System.out.println("Position :" + treeKey.x + "/"+treeKey.y +" mit der Höhe " + treeMap.get(treeKey));
        }
    }
}
