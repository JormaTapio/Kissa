package JKatrinT_Ryhma.Kissa;

import java.util.Date;

import org.junit.Test;

import junit.framework.TestCase;

public class lippuTest extends TestCase {

	@Test
	public void testTicket() {
	
	Date paiva = new Date();
	paiva.setHours(13);
	paiva.setMinutes(00);
	paiva.setMonth(01);
	paiva.setYear(2000);
	paiva.setDate(10);
	Paasylippu celineDion = new Paasylippu(100, paiva);
	
	System.out.println(celineDion.getHinta());
	
	Profiili lapsiProfiili = new Profiili (0.5);
	Lipunmyynti ticket = new Lipunmyynti(lapsiProfiili, celineDion);
	
	System.out.println(ticket.laskeHinta());
	
	assertEquals(ticket.laskeHinta(), 50.0, 0.01);
	
	assertEquals(celineDion.getHinta(), 100, 0);
}


}
