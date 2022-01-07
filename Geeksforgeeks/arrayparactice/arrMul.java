package arrayparactice;

public class arrMul {
    public static void mutliplicationarray(int arr[][], int brry[][]) {
        int sum = 0;
        int crry[][] = new int[2][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brry.length; j++) {
                for (int k = 0; k < 2; k++) {
                    sum = arr[i][j] * brry[j][i];
                    crry[i][j] = sum;
                    sum = 0;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brry.length; j++) {
                System.out.print(crry[i][j] + " ");
            }
            System.out.println("");
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2 }, { 3, 4 } };
        int brry[][] = { { 5, 6 }, { 7, 8 } };
        mutliplicationarray(arr, brry);
    }
}
