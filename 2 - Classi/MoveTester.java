import java.awt.Rectangle;

public class MoveTester
{
  
  public static void main(String[] args)
  {
    
    // creo un oggetto di tipo Rectangle e utilizza un costruttore per settare i lati tutti a 10
    Rectangle scatola = new Rectangle(10, 10, 10, 10);
    // la classe Rectangle ha diversi metodi tra cui il metodo translate :
    // Trasla questo rettangolo dalla distanza indicata, a destra lungo l'asse delle coordinate X e verso il basso lungo l'asse delle coordinate Y.
    scatola.translate(15,25);
    
    System.out.print("x = ");
    // il metodo getX Restituisce la coordinata x corrente dell'origine dei componenti.
    System.out.println(scatola.getX());

    System.out.print("y = ");
    // il metodo getY Restituisce la coordinata y corrente dell'origine dei componenti.
    System.out.println(scatola.getY());
    // Imposta il rettangolo di delimitazione di questo rettangolo su x, y, larghezza e altezza specificate.
    scatola.setBounds(5,5,5,5);
    
    System.out.println("X = " + scatola.getX());
    
    System.out.println("Y = " + scatola.getY());
    // il metodo getWidth() Restituisce la lunghezza del rettangolo di delimitazione in doppia precisione.
    System.out.println("Lunghezza = " + scatola.getWidth());
    // il metodo getHeight() Restituisce l'altezza del rettangolo di delimitazione in doppia precisione.
    System.out.println("Altezza = " + scatola.getHeight());
    /* indica che il programma è stato eseguito con successo, quindi senza errori */
    System.exit(0);
    
  }
  
}
