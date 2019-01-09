public class WheatField {

    Wheat[][]field;
    private final int fieldSize;

    public int getFieldSize() {
        return fieldSize;
    }

    //filling field with wheat
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
