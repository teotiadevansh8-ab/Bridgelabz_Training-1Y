class Array_2 {
    public static void main(String... args) {
        int row = 3;
        int col = 3;
        int[][] arr = new int[row][col];
        int num = 1;

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr[i][j] = num++;
            }
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
