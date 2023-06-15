import java.util.Scanner;

public class Main {
    public static void tong(int a, int b){
        int tong=0;
            tong= a+b;
        System.out.println("tong la :"+tong);
    }
    public static void hieu(int a,int b){
        int hieu=0;
        hieu = a-b;
        System.out.println("hieu là : "+hieu);
    }
    public static void tich(int a,int b){
        int tich=0;
        tich=a*b;
        System.out.println("tích la : "+tich);
    }
    public static void thuong(int a, int b){
        float thuong=0;
        thuong= a/b;
        System.out.println("thương là : "+thuong);
    }
    public static void main(String[] args) {
       int n,m;
       Scanner scanner = new Scanner(System.in);
        System.out.println("nhap n");
        n= scanner.nextInt();
        System.out.println("nhap m");
        m= scanner.nextInt();
        tong(n,m);
        hieu(n,m);
        tich(n,m);
        thuong(n,m);
        
    }
}