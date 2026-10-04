
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
        this.idNumber = num;
    }

    public void setName(String player)
    {
        this.name = player;
    }

    public void setPoints(int pts)
    {
        this.points = pts;
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
