
import java.util.Scanner;
package pl.edu.ur.POLab3;

public class Main {

    public static double potegaR(int x, int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 != 0) {
            return x * Math.pow(potegaR(x, (n - 1) / 2), 2);
        } else {
            return Math.pow(potegaR(x, n / 2), 2);
        }
    }

    public static double potegaI(int x, int n) {
        int w = 1;
        while (n > 0) {
            if (n % 2 == 1) {
                w *= x;
            }
            x *= x;
            n /= 2;
        }
        return w;
    }

    public static void main(String[] args) {
        int zadania;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wybierz numer zadania: 1-(1.4), 2-(1.7), 3-(3.3), 4-(3.4), :");
        zadania=scanner.nextInt();

        switch (zadania) {

            case 1:
                int a=15;
                int wynik;
                int wynik2;
                int wynik3;
                wynik=a<<1;  //wynik przesuniecia w lewo o 1 miejsce liczby a(przesuniecie bitowe)
                wynik2=a>>1;  //wynik przesuniecia w prawo o 1 miejsce liczby a(przesuniecie bitowe)
                wynik3=a>>>1; //wynik przesuniecia w prawo o 1 miejsce liczby a(przesuniecie bitowe bez znaku)
                System.out.println("Wynik przesuniecia w lewo o 1 miejsce liczby a(przesuniecie bitowe): ");
                System.out.println(wynik);
                System.out.println("Wynik przesuniecia w prawo o 1 miejsce liczby a(przesuniecie bitowe): ");
                System.out.println(wynik2);
                System.out.println("Wynik przesuniecia w prawo o 1 miejsce liczby a(przesuniecie bitowe bez znaku): ");
                System.out.println(wynik3);


                break;
            case 2:
                int c;
                int d;
                int xor;
                int not;
                Scanner scanner2 = new Scanner(System.in);
                System.out.println("Podaj wartosc c i wartosc d (0 albo 1) ");
                c=scanner2.nextInt();
                d=scanner2.nextInt();
                xor=c^d;
                not=~c;
                System.out.println("Wynik xor to: ");
                System.out.println(xor);
                System.out.println("Wynik not dla podanej wartosci parametru c to: ");
                System.out.println(not);


                break;
           
            case 3:
                System.out.println("Podaj sposob wykonania algorytmu szybkiego potegowania: 1-rekurencyjnie, 2-iteracyjnie");
                Scanner zad = new Scanner(System.in);
                int sposob = zad.nextInt();
                switch (sposob) {
                    case 1:
                        System.out.println("Podaj podstawe: ");
                        int liczba1 = zad.nextInt();
                        System.out.println("Podaj wykladnik potegi: ");
                        int liczba2 = zad.nextInt();
                        double wynik8 = potegaR(liczba1, liczba2);
                        System.out.println("wynik = " + wynik8);
                        break;
                    case 2:
                        System.out.println("Podaj podstawe: ");
                        int liczba3 = zad.nextInt();
                        System.out.println("Podaj wykladnik potegi: ");
                        int liczba4 = zad.nextInt();
                        System.out.println();
                        System.out.println(liczba3 + " do potegi " + liczba4 + " wynosi " + potegaI(liczba3, liczba4));
                        break;
                    default:
                        System.out.println("Podano niewlasciwy numer");
                        break;

                }
                break;
            case 4:
                int e;
                int wynikfib;
                Scanner scanner4 = new Scanner(System.in);
                System.out.println("Podaj wartosc parametru e: ");
                e=scanner4.nextInt();
                if(e==0) {
                    System.out.println("Wartosc ciagu Fibonacciego dla podanej wartosci parametru e wynosi: 0");
                }
                if(e==1) {
                    System.out.println("Wartosc ciagu Fibonacciego dla podanej wartosci parametru e wynosi: 1");
                }
                if(e>1) {
                    wynikfib=(e-1)+(e-2);
                    System.out.println("Wartosc ciagu Fibonnaciego dla podanej wartosci parametru e wynosi: ");
                    System.out.println(wynikfib);
                }
                break;

         
        }

    }

}
}