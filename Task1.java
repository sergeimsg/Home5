import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("������� ������ �������");
        int n = new Scanner(System.in).nextInt();
        System.out.println("������� ���������");
        int sum = new Scanner(System.in).nextInt();
        Random random = new Random();
        int[][][] array3 = new int[n][n][n];
        for (int i=0; i<n;i++){
            for (int j=0; j<n;j++){
                for (int x=0; x<n;x++){
                    array3[i][j][x] = random.nextInt(100); // ��������� ������ ���������� �������
                    //System.out.println(array3[i][j][x]);
                }

            }
        } System.out.println("���������� ������ " + Arrays.deepToString(array3));// ���������� ������
        for (int[][] arrayleft : array3) {
            for (int[] arraymiddle : arrayleft) {
                for (int num : arraymiddle) {
                    // int inlarge = 0;
                    num = num + sum;
                    System.out.println("����� ����� = " + num);
                }
            }
        }
    }
}

