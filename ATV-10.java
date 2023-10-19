import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Escreva um algoritmo que imprima os n primeiros números da sequência de Fibonacci. Ref.: https://pt.wikipedia.org/wiki/Sequ%C3%AAncia_de_Fibonacci, esta referência já tem uma implementação do algoritmo em C, não sugiro copiar, pois o objetivo é aprender a fazer!
    //F(n + 2) = F(n + 1) + F(n) , com n ≥ 1 e F(1) = F(2) = 1
        int n;
        System.out.println("Quantos primeiros números da sequência de Fibonacci?");
        Scanner entrada = new Scanner(System.in);
        n = entrada.nextInt();

        int[] fib = new int[n];
        fib[0] = 1;
        fib[1] = 1;

        for (int i = 2; i < n; i++) {
          fib[i] = fib[i-1] + fib[i-2];
        }

        for (int i = 0; i < n; i++) {
          System.out.print(fib[i] + " ");
        }
      }
    }