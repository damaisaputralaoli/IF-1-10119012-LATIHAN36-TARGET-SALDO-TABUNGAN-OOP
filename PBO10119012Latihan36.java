
package pbo10119012latihan36;
import java.util.Locale;

/**
 *
 * @author damai
 * NAMA  : DAMAI SAPUTRA LAOLI
 * KELAS : IF-1
 * NIM   : 10119012
 */
public class PBO10119012Latihan36 {

    
    public static void main(String[] args) {
        TargetSaldoTabungan saldo = new TargetSaldoTabungan();

        //proses input
        double saldoAwal = saldo.getSaldo_awal();
        double bungaBulanan = saldo.getBunga();
        double saldoTarget = saldo.getSaldo_target();

        // proses perhitungan
        double i = 0;
        do {
            i += 1;
            saldoAwal += Math.floor(saldoAwal * bungaBulanan);
            System.out.printf(Locale.ITALY, "Saldo di bulan ke-%1$.0f Rp. %2$,.0f%n" , i , saldoAwal);
        } while (saldoAwal<saldoTarget);
    }
}

