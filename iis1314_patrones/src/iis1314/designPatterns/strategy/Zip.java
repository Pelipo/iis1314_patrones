package iis1314.designPatterns.strategy;
public class Zip implements ICompressor{

	@Override
	public String compress(String data) {
		// TODO Auto-generated method stub
		return "ZIP data: " + data;
	}

}
