import java.util.Scanner;
public class MatrizMxN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.err.println("Digite o numero de linhas da matriz ");
        int l = scanner.nextInt();
        System.err.println("Digite o numero de colunas da matriz ");
        int c = scanner.nextInt();

        int[][] m = new int [l][c]; // instanciando uma matriz 3x3
        recebeMatriz(m, scanner);
        scanner.close();
        System.err.println("Matriz recebida: ");
        imprimeMatriz(m);

    }

    public static void recebeMatriz(int[][] m, Scanner scanner){
        System.err.println("Digite os valores da matriz: ");
        for (int i=0; i<m.length; i++){//m.length pega o num de linhas da matriz
            for(int j=0; j<m[0].length; j++){ //m[0].length pega o num de colunas da matriz
                m[i][j]= scanner.nextInt();
            }
        }
        
    }
    public static void imprimeMatriz(int[][] m){
        for (int i=0; i<m.length; i++){
            for(int j=0; j<m[0].length; j++){
                System.err.print(m[i][j] + " ");
            }
            System.err.println();
        }
    }
}
