import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    //attributi Prodotto
   public String name;   
   public String description;
   public BigDecimal price;
   public BigDecimal iva = new BigDecimal("0.22").setScale(2, RoundingMode.HALF_UP); // valore di default per l'iva
   public int code;
   public boolean isAvailable = false; 
   
// costruttore
    public Prodotto(String name, String description, BigDecimal iva) {
    Random rand = new Random();
    this.code = rand.nextInt(99999);
    this.name = name;
    this.description = description;
    this.iva = iva.setScale(2, RoundingMode.HALF_UP);
    this.isAvailable = false;
    generateNewBasePrice();
    }

    // capacità prodotto
    public void  available() {
        this.isAvailable = true;
        System.out.println("Il prodotto è disponibile");
    }

    //metodo per generare prezzo base casuale
    public void generateNewBasePrice() {
        Random rand = new Random();
        this.price = new BigDecimal(rand.nextInt(100) + 1).setScale(2, RoundingMode.HALF_UP);
    }
        //metodo per calcolare prezzo finale
    public BigDecimal generateFinalPrice() {
        if(price != null && iva != null) {
            return price.add(price.multiply(iva)).setScale(2, RoundingMode.DOWN);
        }   
    return null;
}

    public String getName() {
        if (name != null) {
            // Format code as 5-digit zero-padded string
            return code + "-" + name;
        }
        return "Prodotto senza nome";
    }
}
        // Prodotto p2 = new Prodotto("Mouse", "Mouse per PC", new BigDecimal(22));
