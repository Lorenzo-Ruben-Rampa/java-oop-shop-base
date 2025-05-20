import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
       Prodotto p1 = new Prodotto("Joystick", "Joystick per PC", 
       new BigDecimal(0.22));

        System.out.println("Nome: " + p1.getName());
        System.out.println("Descrizione: " + p1.description);
        System.out.println("Prezzo: " + p1.generateFinalPrice());
        System.out.println("Iva: " + p1.iva);

        Prodotto p2 = new Prodotto("Mouse", "Mouse per PC",
        new BigDecimal(0.22));

        System.out.println("Nome: " + p2.getName());
        System.out.println("Descrizione: " + p2.description);
        System.out.println("Prezzo: " + p2.generateFinalPrice());
        System.out.println("Iva: " + p2.iva);
    }

}

