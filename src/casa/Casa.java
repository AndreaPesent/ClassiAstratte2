package casa;

public abstract class Casa
{
    private double Superficie;
    private int NumeroStanze;
    public Casa (double Superficie, int NumeroStanze)
    {
        this.Superficie=Superficie;
        this.NumeroStanze=NumeroStanze;
    }
    public void setSuperficie(double Superficie)
    {
        this.Superficie=Superficie;
    }
    public void setNumeroStanze(int NumeroStanze)
    {
        this.NumeroStanze=NumeroStanze;
    }
    public double getSuperficie()
    {
        return Superficie;
    }
    public int getNumeroStanze()
    {
        return NumeroStanze;
    }
    public abstract double Costo();
}