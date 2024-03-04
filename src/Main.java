import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numN,numR, factN=1, factR=1, factS=1;    // verileri tanımlıyoruz.

        System.out.print("Kaç elemanlı bir kümeniz var? : ");            //numN'yi tanımlıyoruz.
        numN = input.nextInt();
        System.out.println("Kümenizin eleman sayısı = n = " + numN);


        System.out.print("Kümeniz kaç elemanlı gruplara ayrılsın istiyorsunuz? : ");          //numR tanımlıyoruz.
        numR = input.nextInt();
        System.out.println("Kümenin ayrılacağı grup sayısı = r = " + numN);


        for(int x=1; x<=numN; x++) {factN *=x;}     //N number factorial
        for(int y=1; y<=numR; y++) {factR *=y;}      //R number factorial
        for(int z=1; z<=(numN-numR); z++) {factS *=z;}  //n-r factorial
        System.out.println("n'nin r'li kombinasyonu C(n , r): " + factN/(factR*factS));  //C(n,r)
    }
}