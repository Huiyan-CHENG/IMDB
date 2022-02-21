package edu.bristol;

public class IMDBRating
{
    private float currentAverage = 0;
    private int ratingCount = 0;

    public float addNewRating(int newRating)
    {
        int previousTotal = (int) (currentAverage * ratingCount);
        if (newRating < 0 || newRating > 10) {
            System.out.println("rate should between 0~10, fail");
            return currentAverage;
        }
        int newTotal = previousTotal + newRating;
        ratingCount++;
        currentAverage = newTotal / ratingCount;
        return currentAverage;
    }
}
