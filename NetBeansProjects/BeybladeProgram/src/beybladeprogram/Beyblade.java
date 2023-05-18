
package beybladeprogram;


public class Beyblade {
    
    private String beybladeci;
    private int donusHizi;
    private int saldırıGucu;

    public Beyblade(String beybladeci, int donusHizi, int saldırıGucu) {
        this.beybladeci = beybladeci;
        this.donusHizi = donusHizi;
        this.saldırıGucu = saldırıGucu;
    }

    public String getBeybladeci() {
        return beybladeci;
    }

    public void setBeybladeci(String beybladeci) {
        this.beybladeci = beybladeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldırıGucu() {
        return saldırıGucu;
    }

    public void setSaldırıGucu(int saldırıGucu) {
        this.saldırıGucu = saldırıGucu;
    }
    
    public void saldir(){
        System.out.println(getBeybladeci() + " " + saldırıGucu + "ve " +donusHizi + "ile saldırıyor...");
        
                
    }
    public void kutsalCanavarOrtayaCikar(){
        System.out.println("Bu beyblade'in kutsal canavarı bulunmuyor...");
    }
    
    public void bilgileriGoster(){
        System.out.println("Beybladeci ismi : "+ beybladeci);
        System.out.println("Saldırı Gücü : "+ saldırıGucu);
        System.out.println("Donuş hızı : "+ donusHizi);
    }
    
}
