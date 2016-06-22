package challenge;

public class SuchErgebnis
{
    private int zeile;
    private int start;
    private int ende;
    private String inhalt;
    
    public SuchErgebnis(int zeile, int start, int ende, String inhalt)
    {
        this.zeile=zeile;
        this.start = start;
        this.ende = ende;
        this.inhalt = inhalt;
    }

    public int getStart()
    {
        return start;
    }

    public void setStart(int start)
    {
        this.start=start;
    }

    public int getEnde()
    {
        return ende;
    }

    public void setEnde(int ende)
    {
        this.ende=ende;
    }

    public String getInhalt()
    {
        return inhalt;
    }

    public void setInhalt(String inhalt)
    {
        this.inhalt=inhalt;
    }

    public int getZeile()
    {
        return zeile;
    }

    public void setZeile(int zeile)
    {
        this.zeile=zeile;
    }    
}
