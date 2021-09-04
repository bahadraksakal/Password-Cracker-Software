package password_cracker_software_aaa;

public class Passworld_Cracker_Task implements Runnable {
    
    public static int sayac;
    int task_no;
    public Passworld_Cracker_Task(){
     this.task_no=this.sayac;
     sayac++;
    }
    @Override
    public void run() {
        Guessing tahmin_temp = new Guessing();
        int sayac_temp = 0;
        do {
            ++sayac_temp;
        } while (!tahmin_temp.sifre_bul());
        System.out.println("   :  while bitti , toplam deneme sayisi: " + sayac_temp+" || "+task_no+" numaralı task");
    }
}
