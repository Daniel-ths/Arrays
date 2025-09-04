/*
  Nome: Daniel Vieitas de Souza de Miranda
  Matrícula: 04183667
*/

public class VetoresExemplo {
    public static void main(String[] args) {
        // 1. Criar um vetor com 10 idades e exibir as maiores que 18
        int[] idades = {15, 22, 18, 30, 12, 25, 19, 40, 10, 21};

        System.out.println("Idades maiores que 18:");
        for (int idade : idades) {
            if (idade > 18) {
                System.out.println(idade);
            }
        }

        // 2. Criar um vetor com 4 notas e exibir a média aritmética
        double[] notas = {7.5, 8.0, 6.5, 9.0};
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;
        System.out.println("\nMédia aritmética das notas: " + media);
    }
}
