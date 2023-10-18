import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Altere o algoritmo anterior, caso ainda não tenha feito, para que ele impeça o usuário de informar valores negativos, ou, valores acima de 20. Quando isso acontecer o usuário deve ser informado do erro, e perguntado se deseja ou não continuar.
    int lado;
    String confirm=("x");
    Scanner entrada = new Scanner(System.in);
    do{
    System.out.print("Informe o valor do lado do quadrado: ");
    lado=entrada.nextInt();
    if(lado>0&&lado<=20){
    for(int i=lado; i>0; i--){
      for(int j=((lado-i)+1); j>0; j--){
        System.out.print("* ");
      }
      System.out.print("\n");
    }
    }
    else{
      System.out.println("Valor para o lado inválido. Limite de 1 a 20.");
      System.out.println("Deseja continuar?(S/N)");
      confirm=entrada.nextLine();
      confirm=entrada.nextLine();
    }
    }while(confirm.equalsIgnoreCase("s"));
    System.out.println("Fim do programa.");
  }
}