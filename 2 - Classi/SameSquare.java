import java.awt.Rectangle;

public class SameSquare
{
  
  public static void main(String[] args)
  {
    
    Rectangle box1 = new Rectangle(10, 10, 10, 10);
    
    Rectangle box2 = new Rectangle(5, 5, 5, 5);
    /*A questo punto è possibile accedere al medesimo oggetto di tipo Rectangle usando indifferentemente la variabile box1 oppure la variabile box2, come si può vedere nella*/    
    box1 = box2;
    
    System.out.println(box2.getX());

    System.out.println(box2.getY());

    System.out.println(box2.getHeight());
    
    System.out.println(box2.getWidth());
    
    box1.setBounds(1,2,3,4);
    
    System.out.println(box2.getX());

    System.out.println(box2.getY());

    System.out.println(box2.getHeight());
    
    System.out.println(box2.getWidth());
    
  }
  
}    
/*
la variabile box fa riferimento all’oggetto di tipo Rec t ang l e costruito dall’operatore new. Tecnicamente parlando, 
l’operatore new ha restituito un riferimento al nuovo oggetto: proprio tale riferimento viene memorizzato nella variabile box.
Occorre assolutamente ricordare che la variabile box non contiene l’oggetto, ma fa solamente riferimento a esso. 
Si possono anche avere due variabili oggetto che fanno riferimento al medesimo oggetto.
*/
