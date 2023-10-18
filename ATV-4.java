import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    /*
    Imprima a seguinte figura:
    ∗
    ∗ ∗
    ∗ ∗ ∗
    ∗ ∗ ∗ ∗
    ∗ ∗ ∗ ∗ ∗
    A altura deve ser determinada pelo usuário. (não ultrapasse 20 linhas)
    */
    int lado;
    Scanner entrada = new Scanner(System.in);
    System.out.print("Informe o valor do lado do quadrado: ");
    lado=entrada.nextInt();
    for(int i=lado; i>0; i--){
      for(int j=((lado-i)+1); j>0; j--){
        System.out.print("* ");
      }
      System.out.print("\n");
    }
  }
}