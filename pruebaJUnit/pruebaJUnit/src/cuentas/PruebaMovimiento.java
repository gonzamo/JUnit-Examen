package cuentas;

import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.core.Is;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PruebaMovimiento {

	Movimiento m;
	
	@BeforeEach
	void setUp() throws Exception {
		m = new Movimiento();
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
