import org.junit.Test;

public class ActividadVyVS {

    /*
        Calcula el número de veces que se repite un carácter en un String
    */
    public int contarCaracteres(String st, char ch) {
        int posicion, contador = 0;
        posicion = st.indexOf(ch);
        while (posicion != -1) {
            contador++;
            posicion = st.indexOf(ch, posicion + 1);
        }
        return contador;
    }

    /*
        Retorna 'Fizz' si el input es multiplo de 3 y 'Buzz' si es multiplo de 5.
        Si el input es multiplo de ambos, retorna 'FizzBuzz'.
        Si el input no es multiplo de ninguno, retorna el input.
    */
    public String fizzBuzz(int i) {
        String result = "";
        if (i % 3 == 0) {
            result += "Fizz";
        }
        if (i % 5 == 0) {
            result += "Buzz";
        }
        if (result.equals("")) {
            result = i+"";
        }
        return result;
    }

    /*
        Determina si el año es bisiesto
    */
    public boolean anioBisiesto(int anio){
        if (((anio % 4 == 0) && (anio % 100!= 0)) || (anio % 400 == 0))
            return true;
        else
            return false;
    }
}
