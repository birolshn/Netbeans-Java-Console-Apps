
package beybladeprogram;


public class Dranza extends Beyblade {
    private String kutsalCanavar;

    public Dranza(String beybladeci, int donusHizi, int saldırıGucu, String kutsalCanavar) {
        super(beybladeci, donusHizi, saldırıGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgileriGoster() {
        super.bilgileriGoster();
        
        System.out.println("Kutsal canavar adı : " + kutsalCanavar);
    }

    @Override
    public void kutsalCanavarOrtayaCikar() {
        System.out.println(getBeybladeci() + " " + kutsalCanavar + " ı ortaya çkarıyor...");
        System.out.println(getBeybladeci() + " ın Saldırısı : Alev Kılıcı");
    }
    
    
    
}
