
public class MediaFactory implements IFactory { 
	
	public IMediaFile createMedia(String type) { 
	
		IMediaFile tipo;
		
		if (type.equals("mp3")){
			tipo= new MP3();
		}else if (type.equals("wav")){
			tipo= new Wav();
		} else if (type.equals("ogg")){
			tipo = new Ogg();
		} else {
			tipo=null; 
		}
		return tipo;
	} 
}

