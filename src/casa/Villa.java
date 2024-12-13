package casa;

public class Villa extends Casa
{
    private boolean Piscina;
    public Villa(double Superficie, int NumeroStanze, boolean Piscina)
    {
        super(Superficie, NumeroStanze);
        this.Piscina=Piscina;
    }
    public void setPiscina(boolean Piscina)
    {
        this.Piscina=Piscina;
    }
    public boolean getPiscina()
    {
        return Piscina;
    }
    public double Costo()
    {
        double costo=0;
        if (Piscina && super.getNumeroStanze()>=10)
        {
            costo=(super.getSuperficie()*2000)+20000+10000;
        }
        if (Piscina && super.getNumeroStanze()<10)
        {
            costo=(super.getSuperficie()*2000);
        }
        else
        {
            costo=(super.getSuperficie()*2000);
        }
        return costo;
    }
}
