
package yurtdışıçıkışprogramı;


public class YurtDışıÇıkışProgramı {

    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Sabiha Gökçen Havalimanına Hoşgeldiniz...");
        
        String sartlar = "Yurtdışı Çıkış Kuralları...\n"
                        +"Herhangi bir siyasi yasağınızın bulunmaması gerekiyor...\n"
                        +"15 tl harç bedelinizi tam olarak yatırmanız gerekiyor...\n"
                        +"Gideceğiniz ülkeye vizenizin bulunması gerekiyor...\n";
        String message = "Yurtdışı şartlarından hepsini sağlamanız gerekiyor.";
        
        while(true){
            System.out.println("***********************************************");
            System.out.println(sartlar);
            System.out.println("************************************************");
           
            
            Yolcu yolcu = new Yolcu();
            
            System.out.println("Harç bedeli kontrol ediliyor...");
            
            Thread.sleep(3000);
            if(yolcu.yurtdisiHarci() == false){
                System.out.println(message);
                continue;
            }
            
            System.out.println("Siyasi yasak kontrol ediliyor...");
            Thread.sleep(3000);
            
            if(yolcu.siyasiYasakKontrol() == false){
                System.out.println(message);
                continue;
            }
            
            System.out.println("Vize durumu kontrol ediliyor...");
            Thread.sleep(3000);
            if(yolcu.vizeDurumuKontrol() == false){
                System.out.println(message);
                continue;
            }
            System.out.println("İşlemleriniz tamam! Yurtdışına çıkabilirsiniz...");
            break;
        }
    }
    
}
