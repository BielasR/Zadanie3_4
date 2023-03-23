import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
    int s = 1;
    int i = 2;
    Scanner liczba = new Scanner(System.in);
    
    System.out.println("Podaj liczbę");
    int l = liczba.nextInt();

    if(l < 0)
    {
      System.out.println("Błąd");
    }
    while(i <= l)
      {
        s = s * i;
        i = i +1;
      }
    System.out.println("Wynik silni = " + s);
  }
}