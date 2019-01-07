import java.util.HashMap;

public class Drone implements IDrone{

    HashMap<Position, Integer> hmap = new HashMap<>();
    public void scan(WheatField wheatField)
    {
        for(int i =0; i<10000;i++){
            for(int j =0; j<10000;j++){
                hmap.put(new Position(i,j),(int) wheatField.field[i][j].numberOfGrain);

            }
            }
    }
    }


