public class WheatField {

//filling field with wheat
    Wheat[][]field;


    private final int fieldSize;

    public int getFieldSize() {
        return fieldSize;
    }

    public WheatField(int fieldSize) {
        this.fieldSize = fieldSize;
        field = new Wheat[fieldSize][fieldSize];
        for(int i=0;i<getFieldSize();i++)
        {
            for(int ii=0;ii<getFieldSize();ii++)
            {
                field[i][ii]= new Wheat();
            }
        }

    }
}
