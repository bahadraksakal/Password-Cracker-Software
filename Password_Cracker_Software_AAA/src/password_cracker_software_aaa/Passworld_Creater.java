/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package password_cracker_software_aaa;

/**
 *
 * @author bahad
 */
public class Passworld_Creater {
    private static String sifre;

    public static void Set_sifre(char a, char b, char c, char d) {
        sifre = "" + a + c + b + d;
        System.out.println("Başarıyla sifre olusturuldu: " + sifre);
    }

    public static String Get_sifre() {
        return sifre;
    }
}
