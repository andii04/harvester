//interface
public interface IBordComputer {
    //Send Drone
    void flyingDrone();

    //Array to TreeMap
    void addFieldToMap();

    //Output of TreeMap
    void outPut();

    //Overloading:
    //Print Numbers with Position/ x,y
    void printWheatOnPosition(int x, int y);
    void printWheatOnPosition(Position p1);

    //While loop for input
    void goToEnd ();
}
