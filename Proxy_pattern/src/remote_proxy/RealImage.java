package remote_proxy;

public class RealImage implements Image{
	String FileName;

	public RealImage(String FileName) {
		// TODO Auto-generated constructor stub
		this.FileName = FileName;
		loadFromDisk(FileName);
	}
	
	public void display() {
		System.out.println("Displaying " + FileName);
	}
	public void loadFromDisk(String FileName) {
		System.out.println("Loading " + FileName);
	}

}
