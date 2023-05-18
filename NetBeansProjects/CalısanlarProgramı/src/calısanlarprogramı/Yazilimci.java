
package calısanlarprogramı;


public class Yazilimci extends Calısan {
    private String diller;
    
    
    public Yazilimci(String ad, String Soyad, int id, String diller) {
        super(ad, Soyad, id);
        this.diller= diller;
    }
    
    public void formatAt(String isletim_sistemi){
        System.out.println(getAd() + " "+ isletim_sistemi + "ni yüklüyor...");
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Yazılımcının Bildiği Diller : " + diller);
    }
    
    
    
}
