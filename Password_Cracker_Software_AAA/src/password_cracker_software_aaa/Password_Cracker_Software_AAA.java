package password_cracker_software_aaa;

import java.util.Random;


public class Password_Cracker_Software_AAA {

     public static void main(String[] args) {
        Random rand_tahmin = new Random();
        char a = (char)(rand_tahmin.nextInt(26) + 65);
        char b = (char)(rand_tahmin.nextInt(26) + 65);
        char c = (char)(rand_tahmin.nextInt(26) + 65);
        char d = (char)(rand_tahmin.nextInt(26) + 65);
        Passworld_Creater.Set_sifre(a, b, c, d);
        Guessing tahmin_0 = new Guessing();
        tahmin_0.sifre_bul();
        Thread[] threads = new Thread[10];
        for (int i = 0; i < 10; ++i) {
            threads[i] = new Thread(new Passworld_Cracker_Task());
            threads[i].start();
        }        
    }
    
}
