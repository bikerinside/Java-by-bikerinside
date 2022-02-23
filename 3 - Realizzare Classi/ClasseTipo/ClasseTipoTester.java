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