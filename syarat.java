package mengundi;
import java.util.Scanner;

public class syarat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int umur;
        String note = "tidak mengerti"; 
        
        System.out.print("Berapakah umur anda : ");
        umur = input.nextInt();
        
        if (umur >= 18) {
            System.out.print("Adakah anda sudah berdaftar (ya/tidak) : ");
            String status = input.next();
            
            if (status.equals("ya")) {
                note = "Anda layak Mengundi"; 
            } else if (status.equals("tidak")) {
                note = "Anda perlu mendaftar dahulu sebelum mengundi"; 
            } 
        } else {
            note = " Anda tidak layak mengundi"; 
        }
        
        System.out.println("" + note);
    }
}
