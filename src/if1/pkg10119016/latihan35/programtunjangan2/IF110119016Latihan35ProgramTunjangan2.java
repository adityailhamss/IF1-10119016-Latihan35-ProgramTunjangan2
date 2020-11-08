/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119016.latihan35.programtunjangan2;

/**
 *
 * @author aditi
 * NAMA              : Aditya Ilham Subagja
 * KELAS             : IF1
 * NIM               : 10119016
 * Deskripsi Program : Program ini berisi program untuk menampilkan program
 * tunjangan berbasis objek
 */
public class IF110119016Latihan35ProgramTunjangan2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Tunjangan gaji = new Tunjangan();
        gaji.inputData();
        gaji.cekStatus();
        gaji.tampilFormat();
    }
    
}
