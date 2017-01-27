/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
import javax.swing.JOptionPane;
public class tugasiff 
{
    public static void main(String[] args) {
        int a = 1;
        int c = 20;
        String ulang;
        do {
            String menu = JOptionPane.showInputDialog(null, "Masukkan pilihan anda: \n 1. Menghitung deret 1,3,5,7,9,11\n 2. Menampilkan deret urutan terbalik\n 3. Keluar");
            int option = Integer.parseInt(menu);
            if (option == 1) {
                do {
                    System.out.print(a + ",");
                    a = a + 2;
                } while (a <= 11);
            } else if (option == 2) {
                do {
                    System.out.print(c + ",");
                    c = c - 2;
                } while (c >= 1);
            } else if (option == 3) {
                JOptionPane.showMessageDialog(null, "Terima Kasih atas kunjungan anda");
                System.exit(0);
            }
            ulang = JOptionPane.showInputDialog(null, "Apakah anda ingin mengulang\n 1. ya\n 2. tidak");
        } while ("1".equals(ulang));
        JOptionPane.showMessageDialog(null, "Terima kasih atas kunjungannya....!!!! :) :)");
    }
    
}
