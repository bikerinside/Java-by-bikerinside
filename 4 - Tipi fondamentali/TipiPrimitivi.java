public class TipiPrimitivi
{
  
  public static void main(String[] args)
  {
    /* in Java esistono 8 tipi di dati fondamentali */
    // 4 byte ovvero 32 bit  il Tipo intero con intervallo -2147483648 (integer.M I N_VALUE )...2147483647 (integer.MAX_VALUE ) (circa 2 miliardi)
    int numero_intero = 7;
    // 1 byte descrive un singolo byte, con intervallo —128...127
    byte singolo_byte = 10;
    // Tipo intero “corto”, con intervallo -32768...32767
    short intero_corto = 32767;
     // Tipo intero “lungo” , con intervallo -9223372036854775808...9223372036854775807
    long intero_lungo = 9223372036854775807;
    // Tipo in virgola mobile a doppia precisione, con intervallo circa ±10^308 e circa 15 cifre decimali significative
    double numero_virola_grande = 1.797693134862315;
    // Tipo in virgola mobile a singola precisione, con intervallo circa ±10^38 e circa 7 cifre decimali significative
    float numero_virgola_piccolo = 3.4028234;
    // Tipo che rappresenta caratteri codificati secondo lo schema Unicode
    char lettera = 'V';
    // Tipo per i due valori logicitrue e false
    boolean robot = false;
    // ricordiamo che in Java non esiste unsigned, tutti i tipi primitivi son signed.
