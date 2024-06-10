import java.util.Scanner;
public class Matriz{
    public static void main(String[] args) {
        int[][] m = new int [3][3]; // instanciando uma matriz 3x3
        recebeMatriz(m);
        System.err.println("Matriz recebida: ");
        imprimeMatriz(m);
    }

    public static void recebeMatriz(int[][] m){
        Scanner scanner = new Scanner(System.in);
        System.err.println("Digite os valores da matriz 3x3");
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                m[i][j]=scanner.nextInt();
            }
        }
        scanner.close();
    }
    public static void imprimeMatriz(int[][] m){
        for (int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.err.print(m[i][j] + " ");
            }
            System.err.println();
        }
    }
}