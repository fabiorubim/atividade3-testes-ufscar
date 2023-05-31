import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AleatorioTest {
	
	@Test
    public void testInicioNegativo() {
        Aleatorio aleatorio = new Aleatorio();
        int inicio = -7;
        int fim =12;
        int resultado = aleatorio.gerarNumeroAleatorio(inicio, fim);
        assertEquals(-1, resultado);
    }
    
    @Test
    public void testFimNegativo() {
        Aleatorio aleatorio = new Aleatorio();
        int inicio = 4;
        int fim = -2;
        int resultado = aleatorio.gerarNumeroAleatorio(inicio, fim);
        assertEquals(-1, resultado);
    }
    
    @Test
    public void testInicioIgualAoFim() {
        Aleatorio aleatorio = new Aleatorio();
        int inicio = 8;
        int fim = 8;
        int resultado = aleatorio.gerarNumeroAleatorio(inicio, fim);
        assertEquals(-1, resultado);
    }
    
    @Test
    public void testIntervaloValido() {
        Aleatorio aleatorio = new Aleatorio();
        int inicio = 200;
        int fim = 3000;
        int resultado = aleatorio.gerarNumeroAleatorio(inicio, fim);
        assertTrue(resultado >= inicio && resultado <= fim);
    }

}
