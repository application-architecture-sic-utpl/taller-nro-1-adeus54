package ec.edu.utpl.sic.arqapl.tests;

import ec.edu.utpl.sic.arqapl.TweetSimilarity;
import static org.junit.Assert.*;
import ec.edu.utpl.sic.arqapl.metrics.*;
import org.junit.Test;

public class TweetSimilarityTest {

    String tweet1 = "Hola mundo";
    String tweet2 = "Hola mundo";

    public TweetSimilarityTest() {
    }

    @Test
    public void similarJaccard() {

        TweetSimilarity ts = new TweetSimilarity(new Jaccard());
        assertEquals(1.0, ts.similarity(tweet1, tweet2), 0.1);
    }
    @Test
    public void similarCosine() {

        TweetSimilarity ts = new TweetSimilarity(new Cosine());
        assertEquals(1.0, ts.similarity(tweet1, tweet2), 0.1);
    }
    @Test
    public void similarJaroWinkler() {

        TweetSimilarity ts = new TweetSimilarity(new JaroWinkrel());
        assertEquals(1.0, ts.similarity(tweet1, tweet2), 0.1);
    }
}
