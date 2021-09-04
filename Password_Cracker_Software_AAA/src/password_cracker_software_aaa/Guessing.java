/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password_cracker_software_aaa;

import java.util.Random;

public class Guessing {

    public boolean sifre_bul() {
        char d;
        char c;
        char b;
        Random rand_tahmin = new Random();
        char a = (char)(rand_tahmin.nextInt(26) + 65);
        String tahmin_edilen_sifre = "" + a + (b = (char)(rand_tahmin.nextInt(26) + 65)) + (c = (char)(rand_tahmin.nextInt(26) + 65)) + (d = (char)(rand_tahmin.nextInt(26) + 65));
        if (tahmin_edilen_sifre.compareTo(Passworld_Creater.Get_sifre()) == 0) {
            System.out.print("Sifre başarıyla çözüldü: " + tahmin_edilen_sifre);
            return true;
        }
        return false;
    }}

