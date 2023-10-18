import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Crie um algoritmo que imprima a tabuada de multiplicação de um número dado pelo usuário (e.g., se o usuário informar o número 10, deve-se exibir a multiplicação do 1 até o 10, no mesmo formato da tabuada).
    int num;
    Scanner entrada = new Scanner(System.in);
    System.out.print("Informe o número: ");
    num=entrada.nextInt();
    for(int i = 1; i<=10;i++){
      System.out.println(num*i);
    }
  }
}