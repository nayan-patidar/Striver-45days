import java.util.Scanner;

class setmatrixzero {

    static void better(int arr[][]) {

        int m = arr.length;
        int n = arr[0].length;

        boolean firstRow = false;
        boolean firstCol = false;

        // Check first row
        for (int j = 0; j < n; j++) {
            if (arr[0][j] == 0) {
                firstRow = true;
                break;
            }
        }

        // Check first column
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                firstCol = true;
                break;
            }
        }

        // Mark rows and cols
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                if (arr[i][j] == 0) {
                    arr[i][0] = 0;
                    arr[0][j] = 0;
                }
            }
        }

        // Set zeroes based on markers
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {

                if (arr[i][0] == 0 || arr[0][j] == 0) {
                    arr[i][j] = 0;
                }
            }
        }

        // Handle first row
        if (firstRow) {
            for (int j = 0; j < n; j++) {
                arr[0][j] = 0;
            }
        }

        // Handle first column
        if (firstCol) {
            for (int i = 0; i < m; i++) {
                arr[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr[][] = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        better(arr);

        // Print result
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}