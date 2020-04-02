package protection_proxy;

public class RealInternet implements Internet{

	public void connectTo(String connection) throws Exception{
		System.out.println("Connecting to " + connection);
	}

}
