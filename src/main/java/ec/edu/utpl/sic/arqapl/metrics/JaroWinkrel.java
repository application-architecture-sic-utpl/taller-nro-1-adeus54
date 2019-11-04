package ec.edu.utpl.sic.arqapl.metrics;

import org.apache.commons.text.similarity.JaroWinklerDistance;

public class JaroWinkrel implements Similaritable {

    @Override
    public double similarity(String text1, String text2) {
        var jarowin = new JaroWinklerDistance();
        var similarity = jarowin.apply(text1, text2);
        return similarity;
    }
}
