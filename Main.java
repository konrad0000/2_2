import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int h;
    String znak;
    System.out.print("Podaj znak tworzący choinke");
    znak=scanner.next();
    System.out.println("Podaj wysokość choinki");
    h = scanner.nextInt();
    for(int a=0;a<4;a++){
    for (int i=h; i>0; i--){
      System.out.println(); 
      for (int j=i; j>0; j--)
        System.out.print(" ");
      for (int k = (h - i)+1; k>0; k--)
        System.out.print(znak);
    }
    }
    }
}
