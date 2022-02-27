import java.util.Scanner;

public class Stringhe
{

    public static void main(String[] args)
    {

        Scanner legge_da_tastiera = new Scanner(System.in);

        System.out.print("Inserisco il tuo nome : ");

        String nome = legge_da_tastiera.next();

        System.out.print("Inserisci il cognome : ");

        nome = legge_da_tastiera.next();

        System.out.println(nome);

        System.exit(0);

    }
    
}