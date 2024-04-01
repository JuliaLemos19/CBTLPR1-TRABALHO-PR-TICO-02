import java.util.Scanner;

/**
Autores: Julia Lemos e Érica Barbosa
ADS 371 2024
3. Entrar via teclado com “N” valores quaisquer. O valor “N” (que representa a quantidade de
números) será digitado, deverá ser positivo, porém menor que vinte. Caso a quantidade não
satisfaça a restrição, enviar mensagem de erro e solicitar o valor novamente. Após a
digitação dos “N” valores, exibir:
a. O maior valor;
b. O menor valor;
c. A soma dos valores;
d. A média aritmética dos valores;
e. A porcentagem de valores que são positivos;
f. A porcentagem de valores negativos;
*/

 class TP02Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char continuar;

        do {
            System.out.print("Digite a quantidade de números. Por favor positivo e menor que 20: ");
            int quantidade = input.nextInt();


            while (quantidade <= 0 || quantidade >= 20) {
                System.out.println("Erro: A quantidade deve ser positiva e menor que 20.");
                System.out.print("Digite a quantidade novamente: ");
                quantidade = input.nextInt();
            }

            
            int maior = Integer.MIN_VALUE;
            int menor = Integer.MAX_VALUE;
            int soma = 0;
            int positivos = 0;
            int negativos = 0;

            System.out.println("Digite os " + quantidade + " números:");

            for (int i = 0; i < quantidade; i++) {
              
            System.out.print("Valor " + (i + 1) + ": ");
                int numero = input.nextInt();
                soma += numero;

               
                if (numero > maior) {
                    maior = numero;
                }

                
                if (numero < menor) {
                    menor = numero;
                }

                
                if (numero > 0) {
                    positivos++;
                } else if (numero < 0) {
                    negativos++;
                }
            }

            
            double media = (double) soma / quantidade;

            
            double porcentagemPositivos = (double) positivos / quantidade * 100;
            double porcentagemNegativos = (double) negativos / quantidade * 100;

            System.out.println("Maior valor: " + maior);
            System.out.println("Menor valor: " + menor);
            System.out.println("Soma dos valores: " + soma);
            System.out.println("Média aritmética: " + media);
            System.out.println("Valores positivos: " + porcentagemPositivos + "%");
            System.out.println("Valores negativos: " + porcentagemNegativos + "%");

            
            System.out.print("Deseja continuar? (S/N): ");
            continuar = input.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

   
        input.close();
    }
}
