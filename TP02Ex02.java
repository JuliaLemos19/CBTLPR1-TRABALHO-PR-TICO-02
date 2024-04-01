import java.util.Scanner;

/**
Autores: Julia Lemos e �rica Barbosa
ADS 371 2024
2. Entrar via teclado com dez valores positivos. Consistir a digita��o e enviar mensagem de
erro, se necess�rio. Ap�s a digita��o, exibir:
a. O maior valor;
b. A soma dos valores;
c. A m�dia aritm�tica dos valores.
*/


class TP02Ex02 {
   public static void main (String[] args){
 Scanner input = new Scanner(System.in); 
 

        System.out.println("Por favor, insira dez valores positivos:");

        
        double maiorValor = Double.MIN_VALUE;
        double soma = 0;
        int quantidadeValores = 0;

       
    while (quantidadeValores < 10) {
            System.out.print("Valor " + (quantidadeValores + 1) + ": ");
            double valor = input.nextDouble();

            
            if (valor > 0) {
                 if (valor > maiorValor) {
                    maiorValor = valor;
                }
                soma += valor;
                quantidadeValores++;
            } else {
                System.out.println("Erro: O valor deve ser positivo. Tente novamente.");
            }
        }

        
        double media = soma / 10;

        
        System.out.println("Maior valor: " + maiorValor);
        System.out.println("Soma dos valores: " + soma);
        System.out.println("M�dia aritm�tica: " + media);

        input.close();
    }
}