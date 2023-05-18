
package calısanlarprogramı;


public class Yonetici extends Calısan {
    private int sorumlu_kisi_sayisi;

    public Yonetici(String ad, String Soyad, int id, int sorumlu_kisi_sayisi) {
        super(ad, Soyad, id);
        this.sorumlu_kisi_sayisi= sorumlu_kisi_sayisi;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Yöneticinin Sorumlu Olduğu Kişi Sayısı : " + sorumlu_kisi_sayisi);
        
    }
    
    public void zamYap(int zamMiktari){
        System.out.println(getAd() + "Çalışanlara " + zamMiktari + "kadar zam yapıyor...");
        
    }
    
    
    
}
