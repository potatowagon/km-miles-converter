package io.github.potatowagon.km_miles_converter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ConversionServiceUnitTest {

    @Test
    public void kmToMiles_isCorrect() {
        double delta = 0.001;
        assertEquals(0.621371, ConversionService.kmToMiles(1), delta);
        assertEquals(14.571154, ConversionService.kmToMiles(23.45), delta);
    }

    @Test
    public void milesToKm_isCorrect() {
        double delta = 0.001;
        assertEquals(1.60934, ConversionService.milesToKm(1), delta);
        assertEquals(37.739117, ConversionService.milesToKm(23.45), delta);
    }
}