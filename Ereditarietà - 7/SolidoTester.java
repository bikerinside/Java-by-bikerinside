import java.util.Scanner;

public class SolidoTester
{

    public static void main(String[] args)
    {

        System.out.print("Inserisci il lato del cubo : ");

        Scanner input = new Scanner(System.in);

        double lato = input.nextDouble();

        Cubo mio_cubo = new Cubo(lato);

        System.out.println("Volume   del cubo con l = " + mio_cubo.GetLato() + " = " + mio_cubo.GetVolume());

        System.out.println("AreaLato del cubo con l = " + mio_cubo.GetLato() + " = " + mio_cubo.GetAreaLato());

        System.out.println("AreaBase del cubo con l = " + mio_cubo.GetLato() + " = " + mio_cubo.GetAreaBase());

        System.exit(0);

    }

}