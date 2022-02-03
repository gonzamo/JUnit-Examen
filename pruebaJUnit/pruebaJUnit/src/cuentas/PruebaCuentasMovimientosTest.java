package cuentas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PruebaCuentasMovimientosTest {

	Cuenta c;
	Movimiento m;
	
	@BeforeEach
	void setUp() throws Exception {
		c = new Cuenta(null, null);
		m = new Movimiento();
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
	//assertEquals(-10,c.getSaldo());
	
	c.retirar("Compra3", 1000000);
	//assertEquals(1000000,c.getSaldo());
	}
	
	@Test
	public void pruebaConcepto() {
		m.setConcepto("Dual");
		assertEquals ("Dual",(m.getConcepto()));
	}
	
	@Test
	public void pruebaImporte() {
		m.setImporte(1000);
		assertEquals (1000,(m.getImporte()));
	}
	

}
