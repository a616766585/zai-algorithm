package cn.muzaijian.zai.algorithm.sparsearray;

public class Main {
    public static void main(String[] args) {
        int chessArray[][] = new int[10][10];

        chessArray[1][1] = 1;
        chessArray[2][2] = 5;
        chessArray[3][3] = 6;
        chessArray[3][4] = 7;

        showArray(chessArray);
        System.out.println();
        int[][] sparseArray = toSparseArray(chessArray);
        showArray(sparseArray);
        System.out.println();
        int[][] chessArray2 = toChessArray(sparseArray);
        showArray(chessArray2);
    }

    /**
     * 转换为稀疏数组
     */
    public static int[][] toSparseArray(int[][] chessArray) {
        int sum = chessArraySum(chessArray);

        int[][] sparseArray = new int[sum + 1][3];

        sparseArray[0][0] = chessArray.length;
        sparseArray[0][1] = chessArray[0].length;
        sparseArray[0][2] = sum;

        int index = 1;
        for (int i = 0; i < chessArray.length; i++) {
            for (int j = 0; j < chessArray[0].length; j++) {
                if (chessArray[i][j] > 0) {
                    sparseArray[index][0] = i;
                    sparseArray[index][1] = j;
                    sparseArray[index][2] = chessArray[i][j];
                    index++;
                }
            }
        }

        return sparseArray;
    }

    /**
     * 转换为棋盘数组
     */
    public static int[][] toChessArray(int[][] sparseArray) {
        int[][] chessArray = new int[sparseArray[0][0]][sparseArray[0][1]];

        for (int i = 1; i < sparseArray.length; i++) {
            chessArray[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }

        return chessArray;
    }

    /**
     * 统计棋盘数组有效数据个数
     */
    public static int chessArraySum(int[][] chessArray) {
        int sum = 0;
        for (int i = 0; i < chessArray.length; i++) {
            for (int j = 0; j < chessArray[0].length; j++) {
                if (chessArray[i][j] > 0) {
                    sum++;
                }
            }
        }
        return sum;
    }

    /**
     * 显示数组
     */
    public static void showArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
