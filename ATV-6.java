import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int idadetemp;
    int idadefemeas = 0;
    int idademachos = 0;
    int resposta = 0;
    int quantmachos = 0;
    int quantfemeas = 0;
    String erro=("x");
    Scanner entrada = new Scanner(System.in);
    while(resposta!=3){
    do{
    System.out.println("Qual o seu sexo? Digite 1 para Masculino, 2 para Feminino ou 3 para mostrar resultados.");
    resposta=entrada.nextInt();
      if(resposta==1){
      System.out.print("Informe o valor da sua idade: ");
      idadetemp=entrada.nextInt();
      idademachos=idademachos+idadetemp;
        quantmachos++;
    }
    else if(resposta==2){
      System.out.print("Informe o valor da sua idade: ");
      idadetemp=entrada.nextInt();
      idadefemeas=idadefemeas+idadetemp;
      quantfemeas++;
    }
    else if(resposta==3){
      if(quantmachos>0){
      System.out.println("Valor da idade média dos homens: "+(idademachos/quantmachos));
      }
      else{
        System.out.println("Valor da idade média dos homens: 0");
      }
      if(quantfemeas>0){
      System.out.println("Valor da idade média das mulheres: "+(idadefemeas/quantfemeas));
      }
      else{
        System.out.println("Valor da idade média das mulheres: 0");
      }
    }
    else{
      System.out.println("Valor inválido. Deseja continuar?(S/N)");
      erro=entrada.nextLine();
      erro=entrada.nextLine();
    }
    }while(erro.equalsIgnoreCase("s"));
    }
  }
}