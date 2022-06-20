import java.util.Arrays;
import  java.lang.String;
import  java.util.Random;
public class Zadanie {
	  public static void main(String[] args) {
	        Random rand = new Random();
	        int[][] b = new int[4][4];
	        Random rand2 = new Random();
	        for (int i = 0; i < 4; i++)
	            for (int j = 0; j < 4; j++)
	                b[i][j] = rand.nextInt(199) - 99;
	        for (int i = 0; i < 4; i++) {
	            for (int j = 0; j < 4; j++)
	                System.out.print(b[i][j] + "  ");
	            System.out.println();
	        }
	        System.out.println();
	        int j;
	        double sum = 0;
	        for (j = 0; j < 4; j++) {
	            for (int i = 0; i < 4; i++) {
	                sum = sum + b[i][j];
	            }
	            sum = sum / b.length;
	            System.out.println("Среднее арифметическое " + (j + 1) + " столбца: " + sum);
	            sum = 0;
	        }
	        int i;
	        int MAX = 0;
	        for (i = 0; i < 4; i++) {
	            for (int k = 0; k < 4; k++) { //b[i][k]
	                MAX = b[i][k];
	                if (k < 3) {
	                    if (b[i][k + 1] > MAX) {
	                        MAX = b[i][k + 1];
	                    }
	                } else {
	                    if (b[i][k] > MAX) {
	                        MAX = b[i][k];
	                    }
	                }
	            }
	            System.out.print(MAX+" ");
	            
	        }
	    }
	}

