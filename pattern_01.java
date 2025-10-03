public class pattern_01 {

    // 4 row and 4 colunmn * pattern question.
    public static void main(String[] args) {
        int row = 4, col = 4;
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
