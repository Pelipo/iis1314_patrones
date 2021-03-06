

package iis1314.designPatterns.singleton;

public class Singleton {

	private int identifier;
	private static Singleton sing=null;
	
	private Singleton (){
	 
		identifier=0;
	}
	
	public static Singleton getInstance(){
		if (sing==null){
			sing= new Singleton();
		}
		return sing;
	}
	
	
	public int getIdentifier() {
		
		return identifier++;
	}

}


