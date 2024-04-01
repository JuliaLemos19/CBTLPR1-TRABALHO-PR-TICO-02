import java.util.Scanner;

/**
Autores: Julia Lemos e �rica Barbosa
ADS 371 2024
11. Entrar com uma matriz de ordem MxM, onde a ordem tamb�m ser� escolhida pelo usu�rio,
sendo que no m�ximo ser� de ordem 10 e quadr�tica. Ap�s a digita��o dos elementos,
calcular e exibir determinante da matriz.
*/

public class TP02Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a ordem da matriz, um valor positivo at� 10: ");
        int ordem = input.nextInt();
       
        if (ordem <= 0 || ordem > 10) {
            System.out.println("A ordem da matriz n�o � v�lida. Por favor, insira um valor entre 1 e 10.");
            return;
        }
        
        double[][] matriz = new double[ordem][ordem];
        
        System.out.println("Digite os elementos da matriz:");
        for (int i = 0; i < ordem; i++) {
            for (int j = 0; j < ordem; j++) {
                System.out.print("Digite o elemento para a posi��o [" + (i+1) + "][" + (j+1) + "]: ");
                matriz[i][j] = input.nextDouble();
            }
        }
        
        double determinante = calcularDeterminante(matriz);
        
        System.out.println("\nDeterminante da matriz: " + determinante);
        
        input.close();
    }
    
      public static double calcularDeterminante(double[][] matriz) {
        int ordem = matriz.length;
        
        if (ordem == 1) {
            return matriz[0][0];
        } else if (ordem == 2) {
            return (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
        } else {
            double determinante = 0;
            for (int j = 0; j < ordem; j++) {
                double[][] subMatriz = obterSubMatriz(matriz, 0, j);
                determinante += matriz[0][j] * Math.pow(-1, j) * calcularDeterminante(subMatriz);
            }
            return determinante;
        }
    }
    
    public static double[][] obterSubMatriz(double[][] matriz, int linhaExcluida, int colunaExcluida) {
        int ordem = matriz.length;
        double[][] subMatriz = new double[ordem - 1][ordem - 1];
        int linhaDestino = 0;
        for (int i = 0; i < ordem; i++) {
            if (i == linhaExcluida) {
                continue;
            }
            int colunaDestino = 0;
            for (int j = 0; j < ordem; j++) {
                if (j == colunaExcluida) {
                    continue;
                }
                subMatriz[linhaDestino][colunaDestino] = matriz[i][j];
                colunaDestino++;
            }
            linhaDestino++;
        }
        return subMatriz;
    }
}
