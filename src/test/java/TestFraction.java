import ex2.Fraction;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestFraction {

    private int zaehler;
    private int nenner;


    @BeforeAll
    public static void initializeMathEngineNullException() {
        try {
            Fraction fraction = new Fraction(1, 0);
            fail("Kein Error geworfen trotz 0");
        } catch (IllegalArgumentException e) {
            assertEquals("Nenner darf nicht null sein.", e.getMessage());
        }

    }


    @Test
    public void testKehrwert() {
        Fraction fraction = new Fraction(2, 3);
        Fraction f1 = new Fraction(0, 1);
        fraction.Kehrwert(2, 3);
        assertEquals(3, fraction.getZaehler());
        assertEquals(2, fraction.getNenner());
    }

    @Test
    public void Nenner0TestKehrwert() {
        try {
            Fraction f1 = new Fraction(0, 1);
            f1.Kehrwert(0, 1);

        } catch (IllegalArgumentException e) {
            assertEquals("Ausdruck undefiniert", e.getMessage());
        }
    }


    @Test
    public void Testmultiplikation() {
        Fraction f1 = new Fraction(3, 5);
        Fraction f2 = new Fraction(1, 8);
        f1.multiplikation(f2);
        assertEquals(3, f1.getZaehler());
        assertEquals(40, f1.getNenner());

    }

    @Test
    public void TestAddition(){
        Fraction f1 = new Fraction(3, 5);
        Fraction f2 = new Fraction(5, 8);
        f1.addition(f2);
        assertEquals(49, f1.getZaehler());
        assertEquals(40,f1.getNenner());
    }


    @Test
    public void TestKuerzen(){
        Fraction f1 = new Fraction(22, 36);
        Fraction f2 = new Fraction(5, 10);

        f1.kuerzen();
        assertEquals(11,f1.getZaehler());
        assertEquals(18, f1.getNenner());
    }




}
