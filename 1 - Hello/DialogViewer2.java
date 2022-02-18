import javax.swing.JOptionPane;

public class DialogViewer2
{

    public static void main(String[] args)
    {

      String name = JOptionPane.showInputDialog("What is your name ?");

      System.out.println("Hello, " + name);

      System.exit(0);

    }

}

/*

Il codice Java seguente visualizza una finestra di dialogo e un box per inserire del testo,
inserito il testp viene visualizzato il messaggio Hello, nome_inserito

*/
