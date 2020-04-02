package remote_proxy;

public class ProxyImage implements Image {
	String FileName;
	RealImage RealImage;

	public ProxyImage(String FileName) {
		// TODO Auto-generated constructor stub
		this.FileName = FileName;
	}
	
	public void display() {
		if(RealImage == null){ // initialize Real Image on demand 
	         RealImage = new RealImage(FileName);
	      }
	      RealImage.display();
	}
}
