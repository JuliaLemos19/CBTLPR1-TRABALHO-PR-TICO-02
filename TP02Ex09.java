import java.util.Scanner;

/**
Autores: Julia Lemos e �rica Barbosa
ADS 371 2024
9. Entrar com uma matriz de ordem MxN, onde a ordem tamb�m ser� escolhida pelo usu�rio,
sendo que no m�ximo 10x10. A matriz n�o precisa ser quadr�tica. Ap�s a digita��o dos
elementos, calcular e exibir a matriz transposta.
*/

public class TP02Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o n�mero de linhas da matriz (no m�ximo 10): ");
        int linhas = input.nextInt();
        System.out.print("Digite o n�mero de colunas da matriz (no m�ximo 10): ");
        int colunas = input.nextInt();

            
         while(linhas > 10 || colunas > 10 || linhas <= 0 || colunas <= 0){
  
         System.out.println("A ordem da matriz n�o � v�lida. Por favor, insira valores entre 1 e 10.");              
        System.out.print("Digite o n�mero de linhas da matriz (at� 10): ");
       
        linhas = input.nextInt();
        
        System.out.print("Digite o n�mero de colunas da matriz (at� 10): ");
         
        colunas = input.nextInt();
            
      }
        


        
        double[][] matriz = new double[linhas][colunas];

       
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Digite o elemento para a posi��o [" + (i + 1) + "][" + (j + 1) + "]: ");
                matriz[i][j] = input.nextDouble();
            }
        }

        
        System.out.println("\nMatriz Original:");
        exibirMatriz(matriz);
        
        System.out.println("\nMatriz Transposta:");
        exibirMatriz(transporMatriz(matriz));

        input.close();
    }

    
    public static double[][] transporMatriz(double[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        double[][] transposta = new double[colunas][linhas];

        for (int i = 0; i < colunas; i++) {
            for (int j = 0; j < linhas; j++) {
                transposta[i][j] = matriz[j][i];
            }
        }

        return transposta;
    }

    
    public static void exibirMatriz(double[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
