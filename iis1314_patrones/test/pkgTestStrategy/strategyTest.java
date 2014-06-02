package pkgTestStrategy;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import iis1314.designPatterns.strategy.Rar;
import iis1314.designPatterns.strategy.Zip;
import iis1314.designPatterns.strategy.SevenZip;

public class strategyTest {

	private Zip z;
	private Rar r;
	private SevenZip s;
	
	@Before
	public void inicializarTest(){
		z= new Zip();
		r= new Rar();
		s= new SevenZip();
	}
	
	@After
	public void finalizarTest(){
		z=null;
		r=null;
		s=null;
	}
	
	@Test
	public void testCrearZip(){
		
		assertNotNull(z);
		
	}
	
	@Test
	public void testCrearRar(){
		
		assertNotNull(r);
		
	}
	
	@Test
	public void testCrearSevenZip(){
		
		assertNotNull(s);
		
	}
	
	@Test
	public void testComprimirZip(){
		String data="string to compress";
		
		assertEquals(z.compress(data), "ZIP data: string to compress");
		
	}
	
	@Test
	public void testComprimirRar(){
		String data="string to compress";
		
		assertEquals(r.compress(data), "RAR data: string to compress");
		
	}
	
	@Test
	public void testComprimir7ZIP(){
		String data="string to compress";
		
		assertEquals(s.compress(data), "7ZIP data: string to compress");
		
	}
}
