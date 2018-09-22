/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117064.latihan6.kambingstatic;

/**
 *
 * @author WAHID HERLAMBANG
 * NAMA     : Wahid Herlambang Suroso
 * KELAS    : PBO2
 * NIM      : 10117064
 * Deskripsi Program : Program ini berisi program untuk menampilkan 
 * penggabungan dua kelas antara mamalia dengan tidak mamalia
 */


public class PBO210117064Latihan6KambingStatic {
    /**
     * @param args the command line arguments
     */
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
        // TODO code application logic here
        Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + "Memiliki kambing sebanyak" + 
                Mamalia.jumlahKambing );
    }
    
}
