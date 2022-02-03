package cuentas;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class PruebaCuentas {
	
	Cuenta c;

	@BeforeEach
	void setUp() throws Exception {
		c = new Cuenta(null, null);
	}

	@Test
	public void testIngresar() throws IngresoNegativoException {
		c.ingresar("Saldo", 1000);
		assertEquals(1000,c.getSaldo());
	}
	
	@Test
	public void testRetirar() throws IngresoNegativoException, SaldoInsuficienteException {
	c.retirar("Compra", 100);
	assertEquals(900,c.getSaldo());
	
	c.retirar("Compra2", -10);
	assertEquals(-10,c.getSaldo());
	
	c.retirar("Compra3", 1000000);
	assertNotEquals(1000000,c.getSaldo());
	}
	
}
