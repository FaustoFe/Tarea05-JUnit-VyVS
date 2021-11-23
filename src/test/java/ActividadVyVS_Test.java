import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ActividadVyVS_Test {
    private ActividadVyVS actVyVS = new ActividadVyVS();

    @Test
    public void contarCaracteresTest(){
        int result = actVyVS.contarCaracteres("Actividad 5 de verificación y validación de software",'v');
        assertEquals(3, result);
    }

    @Test
    public void fizzBuzzTest(){
        String result = actVyVS.fizzBuzz(15);
        assertEquals("FizzBuzz", result);
    }

    @Test
    public void fizzTest(){
        String result = actVyVS.fizzBuzz(21);
        assertEquals("Fizz", result);
    }

    @Test
    public void buzzTest(){
        String result = actVyVS.fizzBuzz(20);
        assertEquals("Buzz", result);
    }

    @Test
    public void fizzBuzzNofizzbuzzTest(){
        String result = actVyVS.fizzBuzz(19);
        assertEquals("19", result);
    }

    @Test
    public void anioBisiestoTest(){
        boolean result = actVyVS.anioBisiesto(2022);
        assertTrue(result);
    }

    @Test
    public void anioNoBisiestoTest(){
        boolean result = actVyVS.anioBisiesto(2022);
        assertFalse(result);
    }
}
