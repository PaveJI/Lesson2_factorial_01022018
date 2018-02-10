package course_datlab;

import org.junit.Test;

import static org.junit.Assert.*;

public class Urok_2_FactorialTest {

    @Test
    public void fact0() {
        Urok_2_Factorial factorial0 = new Urok_2_Factorial();
        long actual0 = factorial0.fact(0);
        long expected0 = 1;
        assertEquals(actual0,expected0);
    }
    @Test
    public void fact1() {
        Urok_2_Factorial factorial1 = new Urok_2_Factorial();
        long actual1 = factorial1.fact(1);
        long expected1 = 1;
        assertEquals(actual1,expected1);
    }
    @Test
    public void fact10() {
        Urok_2_Factorial factorial10 = new Urok_2_Factorial();
        long actual10 = factorial10.fact(10);
        long expected10 = 3628800;
        assertEquals(actual10,expected10);
    }
    /*@Test
    public void fact_minus3() {
        Urok_2_Factorial factorial_minus3 = new Urok_2_Factorial();
        long actual_minus3 = factorial_minus3.fact(-3);
        long expected_minus3 = "?";
        assertEquals(actual_minus3,expected_minus3);
    }*/
}