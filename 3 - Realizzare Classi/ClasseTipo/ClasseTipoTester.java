public class ClasseTipoTester
{

    public static void main (String[] args)
    {

        ClasseTipo miocontatore = new ClasseTipo(0);

        System.out.println(miocontatore.getContatore());

        miocontatore.click();
        miocontatore.click();
        miocontatore.click();

        System.out.println(miocontatore.getContatore());

        miocontatore.setContatore(0);

        System.out.println(miocontatore.getContatore());

        System.exit(0);

    }

}
/*
La classe ClasseTipoTester √® realizzata per testare le funzionalit√† della classe ClasseTipo
che ha il compito di realizzare un oggetto di tipo miocontatore, infatti andando a testare i metodi della classe.
L'output aspettato deve essere :
0
3
0
*/
