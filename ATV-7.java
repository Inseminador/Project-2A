import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    //Crie um algoritmo que calcule o IMC de uma pessoa, para isso, você deve coletar a altura e o peso do mesmo. Pesquise na internet como o cálculo é realizado, lembre-se de desprezar a diferença entre sexos. Para cada intervalo do IMC existe uma classificação, ela deve ser exibida por seu algoritmo, junto com uma mensagem informativa ao usuário. Boa referência: https://dms.ufpel.edu.br/casca/modulos/imc-calc#comp/imc-main
    float altura;
    float peso;
    float imc;
    Scanner entrada = new Scanner(System.in);
    while(true){
      System.out.println("Qual a sua altura?");
      altura=entrada.nextFloat();
      System.out.println("Qual o seu peso?");
      peso=entrada.nextFloat();
      imc=(peso/(altura*altura));
      System.out.printf("O seu imc é de: %.2f", imc);
      System.out.println("kg/m2.");
      if(imc<18.5){
        System.out.println("Baixo peso.");
      }
      else if(imc>=18.5&&imc<25){
        System.out.println("Eutrofia (peso adequado).");
      }
      else if(imc>=25&&imc<30){
        System.out.println("Sobrepeso.");
      }
      else if(imc>=30&&imc<35){
        System.out.println("Obesidade grau 1.");
      }
      else if(imc>=35&&imc<40){
        System.out.println("Obesidade grau 2.");
      }
      else if(imc>=40){
        System.out.println("Obesidade extrema.");
      }
    }
  }
}