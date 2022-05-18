import java.util.Arrays;
import java.util.Scanner;

public class Task2x5 {
    public static void main(String[] args) {
        System.out.println("введите размер массива");
        int n = new Scanner(System.in).nextInt();
        String[][] arratXW = new String[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + j) % 2 == 0) {
                    arratXW[i][j] = "W";
                } else {arratXW[i][j] = "B";}
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arratXW[i][j] + "  ");
            }
            System.out.println();

        }System.out.println(Arrays.deepToString(arratXW)); // если интересно вывести в виде массива
    }
}

