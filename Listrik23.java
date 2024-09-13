import java.util.Scanner;

public class Listrik23 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int tarifPerkwh = 1500;
        int batasPenggunaan = 500;

        System.out.println("Masukkan penggunaan listrik");
        double penggunaanKwh = input.nextDouble();
        
        double totalTagihan = penggunaanKwh * tarifPerkwh;
        boolean melebihiBatas = penggunaanKwh > batasPenggunaan;
        
        System.out.println("Total tagihan listrik: " + totalTagihan);
        System.out.println("Apakah penggunaan listrik melebihi 500 kwh?" + melebihiBatas);
        

    }
}