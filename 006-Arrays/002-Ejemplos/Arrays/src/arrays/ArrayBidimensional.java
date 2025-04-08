package arrays;

public class ArrayBidimensional {

    public static void main(String[] args) {

        int[][] arr1 = new int[3][2];

        int[][] arr2 = {{1,2},{3,4},{5,6}};

        for(int i = 0; i < arr2.length ;i++){
            for(int j = 0; j < arr2[0].length; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        for (int[] ints : arr2) {
            for (int j = 0; j < arr2[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
