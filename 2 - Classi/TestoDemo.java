public class TestoDemo
{
  
  public static void main(String[] args)
  {
    
    String parola = "Sarno";
    
    System.out.println("Lunghezza parola = " + parola.length());
    
    parola = parola.replace("o", "0");
    
    System.out.println(parola);
    
  }
  
}

/*

Nel programma Java TestoDemo, andiamo ad invocare rispettivamente i metodi :

- length() che conta i caratteri della stringa memorizzata in parola.

- replace() con due parametri ovvero il metodo trova tutte le "o" e le sostituisce con "0"

*/
