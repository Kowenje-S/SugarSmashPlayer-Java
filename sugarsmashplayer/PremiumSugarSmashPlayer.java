package sugarsmashplayer;

public class PremiumSugarSmashPlayer extends SugarSmashPlayer
{
    private int boosters;

    public PremiumSugarSmashPlayer()
    {
        boosters = 3;
    }

    @Override
    public void earnPoints()
    {
        if (boosters > 0)
        {
            setPoints(getPoints() + 500);
            boosters--;
        }
        else
        {
            System.out.println("Out of boosters!");
            setPoints(getPoints() + 100);
        }
    }

    public void buyBoosters()
    {
        boosters += 3;
    }
}