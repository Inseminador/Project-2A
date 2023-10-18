class Main {
  public static void main(String[] args) {
    //Os números primos existentes entre os 100 primeiros números naturais não nulos.
    System.out.println("2");
    System.out.println("3");
    System.out.println("5");
    for(int num = 2; num<100; num++){
      if(num%2!=0&&num%3!=0&&num%5!=0){
        System.out.println(num);
      }
    }
  }
}