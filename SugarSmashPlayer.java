
package sugarsmashplayer;


public class SugarSmashPlayer
{
    private int idNumber;
    private String name;
    private int points;
    int earnPoints;

    public SugarSmashPlayer()
    {
        idNumber = 0;
        points = 0;
        name = "";
    }

    public void setIdNumber(int num)
    {
        this.idNumber = idNumber;
    }

    public void setName(String player)
    {
        this.name = name;
    }

    public void setPoints(int pts)
    {
        this.points = points;
    }

    public void earnPoints()
    {
        points = points + 100;
    }

    public int getIdNumber()
    {
        return idNumber;
    }

    public String getName()
    {
        return name;
    }

    public int getPoints()
    {
        return points;
    }
}
