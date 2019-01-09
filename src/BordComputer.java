import java.util.Comparator;
import java.util.Scanner;
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
                if(wheatField.field[p1.getX()][p1.getY()].getNumberOfGrain() == wheatField.field[p2.getX()][p2.getY()].getNumberOfGrain()){
                    if (p1.getX() == p2.getX()){
                        return p1.getY() - p2.getY();
                    }
                    else return p1.getX() -p2.getX();
                }
                else return wheatField.field[p2.getX()][p2.getY()].getNumberOfGrain() - wheatField.field[p1.getX()][p1.getY()].getNumberOfGrain();
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
        System.out.println(treeMap);/*
        for (Position treeKey : treeMap.keySet()){
            System.out.println("Position :" + treeKey.getX() + "/"+treeKey.getY() +" mit der Anzahl " + treeMap.get(treeKey));
        }*/
        goToEnd();
    }

    void PrintWheatOnPosition(int x, int y){
        System.out.println("Number of grain on this Position:" + treeMap.get(new Position(x,y)));
    }
    void PrintWheatOnPosition(Position p1){
        System.out.println("Number of grain on this Position:" + treeMap.get(p1));
    }

    void goToEnd (){
        /*PrintWheatOnPosition(100,100);
        PrintWheatOnPosition(new Position(200, 200));*/

        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Input X: ");
            int x = sc.nextInt();
            System.out.println("Input Y: ");
            int y = sc.nextInt();
            PrintWheatOnPosition(new Position(x,y));
        }
    }
}
