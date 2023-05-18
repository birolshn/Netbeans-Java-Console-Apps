
package beybladeprogram;


public class Dragon extends Beyblade {
    private String kutsalCanavar;
    private String gizliYetenek;
    
    public Dragon(String beybladeci, int donusHizi, int saldırıGucu, String kutsalCanavar, String gizliYetenek) {
        super(beybladeci, donusHizi, saldırıGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliYetenek = gizliYetenek;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster(); 
        System.out.println("Kutsal canavar adı : " + kutsalCanavar);
        System.out.println("Gizli Yetenek : " + gizliYetenek);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çkarıyor...");
        System.out.println(getBeybladeci() + " ın Saldırısı : Hayalet Kasırgası");
    }
    
    
}
