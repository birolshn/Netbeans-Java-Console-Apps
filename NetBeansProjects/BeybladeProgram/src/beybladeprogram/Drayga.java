
package beybladeprogram;


public class Drayga extends Beyblade {
    private String kutsalCanavar;

    public Drayga(String beybladeci, int donusHizi, int saldırıGucu, String kutsalCanavar) {
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
        System.out.println(getBeybladeci() + " ın Saldırısı : Kaplan Pençesi"); 
    }
    
    
    
}
