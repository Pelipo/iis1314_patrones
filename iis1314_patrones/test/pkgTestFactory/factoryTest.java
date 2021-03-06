package pkgTestFactory;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import iis1314.designPatterns.factoryMethod.IMediaFile;
import iis1314.designPatterns.factoryMethod.MP3;
import iis1314.designPatterns.factoryMethod.Ogg;
import iis1314.designPatterns.factoryMethod.Wav;



public class factoryTest {

	private MP3 m;
	private Ogg o;
	private Wav w;

	
	@Before
	public void inicializarTest(){
		m= new MP3();
		o= new Ogg();
		w= new Wav();
	}
	
	@After
	public void finalizarTest(){
		m=null;
		o=null;
		w=null;
	}
	
	
	@Test
	public void testCrearMp3(){
		
		assertNotNull(m);
		
	}
	
	@Test
	public void testCrearOgg(){
		
		assertNotNull(o);
		
	}
	
	@Test
	public void testCrearWav(){
		
		assertNotNull(w);
		
	}
	
	@Test
	public void testPlayMp3(){
		
		assertEquals(m.play(), "Play Mp3");
		
	}
	
	@Test
	public void testPlayOgg(){
		
		assertEquals(o.play(), "Play Ogg");
		
	}
	
	@Test
	public void testPlayWav(){
		
		assertEquals(w.play(), "Play Wav");
		
	}

}
