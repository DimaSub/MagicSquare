public class MagicSquare {

    private int[][] _magicSquare;

    public MagicSquare(int[][] square){
        _magicSquare = new int[square.length][square.length];
        for (int row=0; row<square.length; row++){
            for (int col=0; col<square.length; col++){
                _magicSquare[row][col] = square[row][col];
            }
        }
    }
    public boolean isMagic(){
        int testSum = this.rowChk(0);
        for (int row = 0; row < _magicSquare.length; row++){
            if (this.rowChk(row)!=testSum) return false;
        }
        for (int col = 0; col < _magicSquare.length; col++){
            if (this.colChk(col)!=testSum) return false;
        }

        if (this.diagonalLeftChk()!=testSum) return false;

        if (this.diagonalRightChk()!=testSum) return false;

        return true;
    }

    public int rowChk(int row){
        int rowSum = 0;
        for (int col = 0; col < _magicSquare.length; col++){
            rowSum += _magicSquare[row][col];
        }
        return rowSum;
    }

    public int colChk(int col){
        int colSum = 0;
        for (int row = 0; row < _magicSquare.length; row++){
            colSum += _magicSquare[row][col];
        }
        return colSum;
    }

    public int diagonalLeftChk(){
        int diagLeftSum = 0;
        for (int row = 0; row < _magicSquare.length; row++){
            diagLeftSum += _magicSquare[row][row];
        }
        return diagLeftSum;
    }

    public int diagonalRightChk(){
        int diagRightSum = 0;
        for (int col = _magicSquare.length-1, row=0; col >= 0; col--, row++){
            diagRightSum += _magicSquare[row][col];
        }
        return diagRightSum;
    }

    public String toString(){
        String str = new String();
        for (int row = 0; row < _magicSquare.length; row++){
            for (int col = 0; col < _magicSquare.length; col++){
                str += _magicSquare[row][col]+"\t";
            }
        }
        return str;
    }
}
