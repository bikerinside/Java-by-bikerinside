/*
La classe Data permette di creare un'oggetto di tipo data
in totale sicurezza gestendo anni bisestili e i mesi che hanno 28, 30 e 31 giorni.
*/

public class Data
{
    // membro giorno
    private int giorno;
    // membro mese
    private int mese;
    // membro anno
    private int anno;

    public Data (int giorno, int mese, int anno)
    {

      this(giorno,mese,anno,1);

    }

    // metodo per impostare l'anno
    public void setAnno(int anno)
    {

      if(anno >= 1900 && anno <= 3900)
      {

        this.anno = anno;

      }

      else
      // altrimenti viene visualizzato un messaggio di errore
      System.out.println("Errore inserimento anno!");

    }
    // metodo per impostare il mese, il valore deve essempre compreso tra 1 e 12
    public void setMese(int mese)
    {

      if(mese >= 1 && mese <= 12)
      {

        this.mese = mese;

      }

      else
      // altrimenti viene visualizzato un messaggio di errore
      System.out.println("Errore inserimento mese!");

    }

    public void setGiorno (int giorno)
    {
        // se l'anno è bisestile e il mese inserito è Febbraio
        if ( anno%400 == 0 || ( anno%4 == 00 && !(anno%100==0) ) && mese == 2)
        {
          // e il giorno inserito ha come valore tra 1 e 29
          if(giorno >= 1 && giorno <= 29)
          {
            // allora viene settato il giorno immesso
            this.giorno = giorno;

          }
          
          else
          // altrimenti viene visualizzato un messaggio di errore
          System.out.println("Errore 1 nell'inserimento del giorno");

        }
        // se il valore mese inserito è uguale Gennaio, Marzo, Maggio, Luglio, Agosto, Ottobre e Dicembre
        else if( mese != 2 && mese != 4 && mese != 6 && mese != 9 && mese != 11 )
        {
          // e il valore giorno è compreso tra 1 e 31
          if(giorno >= 1 && giorno <= 31)
          {
            // allora viene settato il giorno
            this.giorno = giorno;

          }

          else
          // altrimenti viene visualizzato un messaggio di errore
          System.out.println("Errore 2 nell'inserimento del giorno");

        }
        // se il mese inserito è Febbraio e
        else if(mese == 2)
        {
          // il giorno inserito ha come valore tra 1 e 28
          if (giorno >= 01 && giorno <= 28)
          {
            // allora viene settato il giorno
            this.giorno = giorno;

          }

          else
          // altrimenti viene visualizzato un messaggio di errore
          System.out.println("Errore 3 nell'inserimento del giorno");

        }
        // Se invece il mese settato è Aprile, Giugno, Settembre e Novembre
        else
        {
          // e il giorno inserito ha come valore tra 1 e 30
          if ( giorno >= 1 && giorno <= 30 )
          {
            // allora viene settato il giorno
            this.giorno = giorno;

          }

          else
          // altrimenti viene visualizzato un messaggio di errore
          System.out.println("Errore 4 nell'inserimento del giorno");

        }

    }

    public int getGiorno() { return giorno; }

    public int getMese() { return mese; }

    public int getAnno() { return anno; }

}
