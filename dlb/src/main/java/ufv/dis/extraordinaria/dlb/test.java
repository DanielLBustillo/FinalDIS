package ufv.dis.extraordinaria.dlb;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class test {

	@Test
	void testTweet() {
		Tweet t = new Tweet("nombre", "mensaje"); 
		assertEquals("nombre", t.getNombre());
		assertNotEquals("mensajessss", t.getMensaje());
		assertNotNull(t); 
	}
	
	 @Test
	 void anadirTweet() {
		 Tweets t = new Tweets(); 
		 Tweet tw = new Tweet("nombre", "mensaje"); 
		 
		 t.addTweet(tw);
		 assertEquals(1,t.listSize()); 
		 
	 }

}
