package DataModels.PieceDataModels;

public class TPiece extends Piece {

    public TPiece(){
        setStructure();
    }

    public void rotate(){
        if (rotationEnum != 3)
            rotationEnum++;
        else
            rotationEnum = 0;

        setStructure();
    }

    public int getType(){
        return 7;
    }

    public void setStructure(){
        if(rotationEnum == 0){
            structure = new boolean[][] {{true, false, false, false},
                    {true, true, false, false},
                    {true, false, false, false},
                    {false, false, false, false}};
        }
        else if(rotationEnum == 1){
            structure = new boolean[][] {{false, true, false, false},
                    {false, true, false, false},
                    {true, true, true, false},
                    {false, false, false, false}};
        }
        else if(rotationEnum == 2){
            structure = new boolean[][] {{false, false, true, false},
                    {true, true, true, false},
                    {false, false, true, false},
                    {false, false, false, false}};
        }
        else if(rotationEnum == 3){
            structure = new boolean[][] {{true, true, true, false},
                    {false, true, false, false},
                    {false, true, false, false},
                    {false, false, false, false}};
        }
    }
}
