// La classe Cubo è una sottoclasse della superclasse solido
public class Cubo extends Solido
{
    // costruttore con un solo argomento poiché il Cubo ha tutti i lati uguali
    public Cubo(double lato)
    {
        // setta l'altezza richiamando il metodo SetA della superclasse Solido
        SetA(lato);
        // setta la base richiamando il metodo SetB della superclasse Solido
        SetB(lato);
        // setta la profondità richiamando il metodo SetP della superclasse Solido
        SetP(lato);

    }
    // attributo VolumeCubo dove viene memorizzato il volume del cubo
    private double VolumeCubo;
    // attributo AreaBase dove viene memorizzato l'area della base
    private double AreaBase;
    // attributo AreaLAto dove viene memorizzato l'area lato
    private double AreaLato;
    
    // Il metodo privato SetVolumeCubo calcola il volume del cubo e lo memorizza nell'attributo VolumeCubo
    private void SetVolumeCubo() { this.VolumeCubo = GetA() * GetB() * GetP(); }

    // Il metodo privato SetAreBase calcola l'area della base del e lo memorizza nell'attributo AreaBase
    private void SetAreaBase() { this.AreaBase = GetA() * GetP(); }

    // Il metodo privato SetAreaLato calcola l'area del lato e lo memorizza nell'attributo AreaLato
    private void SetAreaLato() { this.AreaLato = 4 * (GetA() * GetP()); }

    // Il metodo GetAreaBase invoca il metodo SetAreaBase e restituisce il valore dell'area della base
    public double GetAreaBase()
    {

        SetAreaBase();

        return AreaBase;
    }
    // Il metodo GetVolume invoca il metodo SetVolumeCubo e restituisce il volume del cubo
    public double GetVolume()
    {

        SetVolumeCubo();

        return VolumeCubo;

    }

    // Il metodo GetAreaLato invoca il metodo SetAreLato e restituisce il valore dell'area del lato.
    public double GetAreaLato()
    {

        SetAreaLato();

        return AreaLato;

    }
    // Il metodo GetLato restituisce il valore del lato del cubo
    public double GetLato()
    {

        return GetA();

    }

}