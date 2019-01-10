//implements interface and his methods
public class Drone implements IDrone{

    //Scan Field and declare Position to Wheat
    public void scan(WheatField wheatField)
    {
        for(int i =0; i<wheatField.getFieldSize(); i++)
        {
            for(int j =0; j<wheatField.getFieldSize(); j++)
            {
                wheatField.field[i][j].setPosition(new Position(i,j));
            }
        }
    }
}


