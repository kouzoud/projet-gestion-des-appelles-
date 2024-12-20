import metier.Metier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMetier  {
    @Test
    void testMetier() {
        Metier metier = new Metier();
        double c=200000;
        int n=240;
        double t=4.5;
        double m=metier.mertie(c,t,n);
        assertEquals(m,-200000);
    }


}
