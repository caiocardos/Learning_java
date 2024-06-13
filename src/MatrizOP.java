import java.util.Scanner;
public class MatrizOP {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a dimensao das matrizes quadradas");
        int dim = scanner.nextInt();
        int[][] matrizA = new int[dim][dim];
        int[][] matrizB = new int[dim][dim];
        int[][] matrizC = new int[dim][dim];
        System.out.println("Digite os elementos da matriz A");
        recebeM(matrizA, scanner);
        System.out.println("Digite os elementos da matriz B");
        recebeM(matrizB, scanner);
        scanner.close();
        System.out.println("Matriz A recebida:");
        printM(matrizA);
        System.out.println("Matriz B recebida:");
        printM(matrizB);
        System.out.println("Matriz A + Matriz B:");
        sumM(matrizA, matrizB, matrizC);
        printM(matrizC);
        System.out.println("Matriz A - Matriz B:");
        subM(matrizA, matrizB, matrizC);
        printM(matrizC);
        System.out.println("Matriz A transposta:");
        transposteM(matrizA);
        System.out.println("Matriz A x Matriz B:");
        mulM(matrizA, matrizB, matrizC);
        printM(matrizC);       
    }
    
    public static void recebeM(int[][] matriz, Scanner scanner){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                matriz[i][j] = scanner.nextInt();    
            }
        }
    }
    public static void printM(int[][] matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j]+" ");    
            }
            System.out.println();
        }
    }

    public static void sumM(int[][] matrizA, int[][] matrizB, int[][] matrizC){
        for(int i=0; i<matrizA.length; i++){
            for(int j=0; j<matrizA[0].length; j++){
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }

    }

    public static void subM(int[][] matrizA, int[][] matrizB, int[][] matrizC){
        for(int i=0; i<matrizA.length; i++){
            for(int j=0; j<matrizA[0].length; j++){
                matrizC[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }
    }

    public static void mulM(int[][] matrizA, int[][] matrizB, int[][] matrizC){
        for(int i=0; i<matrizA.length; i++){
            for(int j=0; j<matrizA[0].length; j++){
                matrizC[i][j] = 0;
                for(int k=0; k < matrizA.length; k++){
                    matrizC[i][j] += matrizA[i][k] * matrizB[k][j];
                }
            }
        }
    }

    public static void transposteM(int[][] matriz){
        for(int i=0; i<matriz.length; i++){
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[j][i]+" ");    
            }
            System.out.println();
        }
    }
}
