import java.util.Scanner;

public class Training {
    public static void main (String args[]){

    int[][] exampleSqaure = {
            {0,0,0},
            {0,0,0},
            {4,9,2}
    };

    MagicSquare a = new MagicSquare(exampleSqaure);

    System.out.print(a.isMagic());

    }
}
