
package calısanlarprogramı;


public class Calısan {
    private String ad;
    private String Soyad;
    private int id;

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String Soyad) {
        this.Soyad = Soyad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    

    public Calısan(String ad, String Soyad, int id) {
        this.ad = ad;
        this.Soyad = Soyad;
        this.id = id;
    }
    
    public void bilgileriGoster(){
        System.out.println("Çalışan Bilgileri....");
        System.out.println("Ad : " + ad);
        System.out.println("Soyad : " + Soyad);
        System.out.println("Id : " + id);
                
    }
    
    
}
