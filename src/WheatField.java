public class WheatField {

//filling field with wheat
    Wheat[][]field = new Wheat[10000][10000];
    public WheatField() {

        for(int i=0;i<10000;i++)
        {
            for(int ii=0;ii<10000;ii++)
            {
                field[i][ii]= new Wheat();
            }
        }

    }
}
