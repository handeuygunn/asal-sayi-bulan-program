import java.util.Scanner;

public class Main {
    static void f(int n){
        int sayi = 0;
        for (int j = 1; j<=n; j++){
            if (n % j == 0){
                sayi++;
            }
        }
        if (sayi == 2){
            System.out.println(n+ " sayisi asaldir");
        }else {
            System.out.println(n+ " sayisi asal degildir.");
        }
        return;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayi giriniz:");
        int n = input.nextInt();
        f(n);
    }
}
