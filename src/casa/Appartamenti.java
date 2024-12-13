package casa;

public class Appartamenti extends Casa
{
    private int Codiceenergetico;
    public Appartamenti(double Superficie, int NumeroStanze, int CodiceEnergetico)
    {
        super(Superficie, NumeroStanze);
        this.Codiceenergetico=CodiceEnergetico;
    }
    public void setCodiceenergetico(int CodiceEnergetico)
    {
        this.Codiceenergetico=CodiceEnergetico;
    }
    public int getCodiceenergetico()
    {
        return Codiceenergetico;
    }
    public double Costo()
    {
        double costo=0;
        costo=(super.getSuperficie()*1500)+(super.getNumeroStanze()*Codiceenergetico) ;
        return costo;
    }
}
