package matrix;

public class matrix {
    public static void main(String[] args) {
        System.out.println("Hello Motherfucker!");
        System.out.println("bloody fuckin' hell!!!");


        int rows = 3;
        int columns = 5;

        int[][] array = new int[rows][columns];

        for(int i = 0; i<rows; i++)
            for(int j = 0; j<columns; j++)
                array[i][j] = 1;

        for(int i = 0; i<rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
