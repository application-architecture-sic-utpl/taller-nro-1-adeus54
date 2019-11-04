package ec.edu.utpl.sic.arqapl;

import ec.edu.utpl.sic.arqapl.metrics.Jaccard;
import ec.edu.utpl.sic.arqapl.metrics.Similaritable;

public class TweetSimilarity {
    private Similaritable algorithm;

    public TweetSimilarity(Similaritable algorithm) {
        this.algorithm = algorithm;
    }

    public double similarity(String tweet1, String tweet2) {
        return algorithm.similarity(tweet1, tweet2);
    }
}
