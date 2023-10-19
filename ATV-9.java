import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Escreva um programa em Java que lhe permita calcular o fatorial de um número dado pelo usuário.
    int num;
    int fatorial;
    Scanner entrada = new Scanner(System.in);
    while(true){
      fatorial=1;
      System.out.print("Informe o número: ");
      num=entrada.nextInt();
      if(num>=0){
      for(int i=num; i>0; i--){
        fatorial=fatorial*i;
      }
      System.out.println("O fatorial de "+num+" é: "+fatorial);
      }
      else{
        System.out.println("O número não possui fatorial.");
      }
    }
  }
}