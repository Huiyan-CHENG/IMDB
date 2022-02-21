package edu.bristol;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IMDBRatingTest
{
    @Test
    public void testAverageRating()
    {
        float averageRating;
        IMDBRating rater = new IMDBRating();

        averageRating = rater.addNewRating(2);
        assertTrue(averageRating == 2.0, "Adding 1st rating: average should be 2.0");

        averageRating = rater.addNewRating(4);
        assertTrue(averageRating == 3.0, "Adding 2nd rating: average should be 3.0");

        averageRating = rater.addNewRating(0);
        assertTrue(averageRating == 2.0, "Adding 3rd rating: average should be 2.0");

        averageRating = rater.addNewRating(-1);
        assertTrue(averageRating == 2.0, "Adding 4th rating: rate should lager than 0.0");

        averageRating = rater.addNewRating(11);
        assertTrue(averageRating == 2.0, "Adding 5th rating: rate should lower than 10.0");

    }
}
