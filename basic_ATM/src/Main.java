
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        //basic_level_ATM_Project
        
        /*
        while döngüsü yardımıyla bir tane atm programı yapmaya çalışacağız.
        işlemler
        1.işlem :BAKİYE ÖĞRENME
        2.işlem :PARA ÇEKME
        3.işlem :PARA YATIRMA
        4.işlem :ÇIKIŞ(q)
        */
        Scanner scn = new Scanner(System.in);
        double bakiye = 0;
        String islemler = "1)BAKİYE SORGULAMA\n"
                + "2)PARA ÇEKME\n"
                + "3)PARA YATIRMA\n"
                +"4)menüyü tekrar görmek\n"
                + "q) veya Q) çıkış";
        System.out.println("****************************************************");
        System.out.println("işlemler = \n" +islemler);
        System.out.println("****************************************************");

        while(true){
            System.out.println("yapmak istediğiniz işlemi seçiniz :");
            String islem = scn.nextLine();
            
            if(islem.equals("1")){
                System.out.println("Seçmiş olduğunuz işlem BAKİYE SORGULAMADIR.");
                System.out.println("Mevcut bakiyeniz = "+bakiye +" tl'dir");
            }
            else if(islem.equals("2")){
                System.out.println("Çekmek istediğiniz tutarı giriniz...");
                double eksi = scn.nextDouble();
                scn.nextLine();
                double result = bakiye-eksi;
                if(result==0){
                    System.out.println("TÜM PARANIZI ÇEKMENİZ BANKA İLE OLAN SÖZLEŞMENİZE AYKIRIDIR.");
                    
                }else if(result<0){
                    System.out.println("bankada bulunan paranızdan fazla miktar çekmek istiyorsunuz lütfen vezne ile görüşünüz....");
                }else if(eksi>=1500){
                    System.out.println("Günlük para çekme limitiniz 1500 Türk lirasıdır.");
                    System.out.println("Sistemden çıkılıyor");
                    for(int j = 0;j<=58;j++){
                        System.out.println("*");
                    }
                    System.out.println("Kartınız geri veriliyor lütfen tekrar giriş yapınız...");
                }else{
                    bakiye-=eksi;
                    System.out.println("İşleminiz gerçekleştirildi Lütfen bakiyenizi kontrol ediniz");
                }

            }
            else if(islem.equals("3")){
                System.out.println("yatırmak istediğiniz tutaurı giriniz : ");
                double tutar = scn.nextDouble();
                scn.nextLine();
                bakiye+=tutar;
                System.out.println("paranız yatırılıyor");
                for(int i = 0;i<=100;i++){
                    System.out.println("*");
                    
                }
                System.out.println("**********************************************");
                System.out.println("Bakiyenizi sorgulamadan atm'den ayrılmayınız lütfen");
            }else if(islem.equals("4")){
                System.out.println(islemler);
            }else if(islem.equals("q") || islem.equals("Q")){
                System.out.println("Sistemden çıkış yapılıyor.....");
                for(int t = 10;t>=0;t--){
                    System.out.println("çıkış için geri sayım yapılıyor... " +t);
                }
                System.out.println("Çıkış işlemi gerçekleşti kartınızı almayı unutmayınız.");
                System.out.println("@prince Sağlıklı günler diler.........");
                break;
            }else{
                System.out.println("YANLIŞ YADA HATALI BİR TUŞLAMA YAPTINIZ....!!!");
            }
        
        }
    }
    
}
