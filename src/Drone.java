import java.util.HashMap;

//implements interface and his methods
public class Drone implements IDrone{


    public HashMap<Position, Short> scan(WheatField wheatField)
    {
        HashMap<Position, Short> hmap = new HashMap<>();
        for(int i =0; i<100;i++)
        {
            for(int j =0; j<100;j++)
            {
                hmap.put(new Position(i,j),wheatField.field[i][j].numberOfGrain);
            }
        }
        System.out.println(hmap);
        return hmap;
    }
}


