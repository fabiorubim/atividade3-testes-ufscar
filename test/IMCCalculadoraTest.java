import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import br.com.calculadora.imc.IMCCalculadora;
import br.com.calculadora.imc.IMCStatus;
import br.com.calculadora.imc.Pessoa;

class IMCCalculadoraTest {

	@Test
    public void testCalcularAbaixoDoPeso() {
        IMCCalculadora calculadora = new IMCCalculadora();
        Pessoa pessoa = new Pessoa("Ana", 50, 1.70);
        IMCStatus resultado = calculadora.calcular(pessoa);
        
        Assertions.assertEquals(17.30, resultado.getImc(), 0.01);
        Assertions.assertEquals("abaixo do peso", resultado.getClassificacao());
    }
    
    @Test
    public void testCalcularPesoNormal() {
        IMCCalculadora calculadora = new IMCCalculadora();
        Pessoa pessoa = new Pessoa("Fabio", 80, 1.80);
        IMCStatus resultado = calculadora.calcular(pessoa);
        
        Assertions.assertEquals(24.69, resultado.getImc(), 0.01);
        Assertions.assertEquals("normal", resultado.getClassificacao());
    }
    
    @Test
    public void testCalcularAcimaDoPeso() {
        IMCCalculadora calculadora = new IMCCalculadora();
        Pessoa pessoa = new Pessoa("Felipe", 90, 1.75);
        IMCStatus resultado = calculadora.calcular(pessoa);
        
        Assertions.assertEquals(29.38, resultado.getImc(), 0.01);
        Assertions.assertEquals("acima do peso", resultado.getClassificacao());
    }
    
    @Test
    public void testCalcularObeso() {
        IMCCalculadora calculadora = new IMCCalculadora();
        Pessoa pessoa = new Pessoa("Claudiao", 100, 1.70);
        IMCStatus resultado = calculadora.calcular(pessoa);
        
        Assertions.assertEquals(34.60, resultado.getImc(), 0.01);
        Assertions.assertEquals("obeso", resultado.getClassificacao());
    }
    
    @Test
    public void testCalcularExcecao() {
        IMCCalculadora calculadora = new IMCCalculadora();
        Pessoa pessoa = new Pessoa("Roberto", 0, 1.80);
        
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculadora.calcular(pessoa);
        });
    }

}
