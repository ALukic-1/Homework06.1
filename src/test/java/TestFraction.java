import ex2.Fraction;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestFraction {

    private int zaehler;
    private int nenner;

/*
    @BeforeAll
    public static void initializeMathEngineNullException(){
        try {
            Fraction fraction = new Fraction(1,0);
            fail("Kein Error geworfen trotz 0");
        } catch (IllegalArgumentException e){
            assertEquals("Nenner darf nicht 0 sein.", e.getMessage());
        }


    } //Problem: Teilen durch 0 wird nicht abgefangen

*/
    @Test
    public void testKehrwert(){
        Fraction fraction = new Fraction(2,3);
        fraction.Kehrwert();
        assertEquals(3,fraction.getZaehler());
        assertEquals(2,fraction.getNenner());
    }
    //Problem:

/*
    @Test
    public void multiplikation(){
        Fraction f1 = new Fraction(2,5);
        Fraction f2 = new Fraction(1,8);
        f1.multiplikation(f2);
        assertEquals(2, f1.getZaehler());
        assertEquals(40,f2.getNenner());
    }


*/

}
