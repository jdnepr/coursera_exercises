package protection_proxy;

import java.util.ArrayList;

public class ProxyInternet implements Internet{
	
	private Internet internet = new RealInternet();
	String connection;
	static ArrayList<String> bannedSites = new ArrayList<String>();
	
	static {
		bannedSites.add("abc.com"); 
        bannedSites.add("def.com"); 
        bannedSites.add("ijk.com"); 
        bannedSites.add("lnm.com"); 
	}

	@Override
	public void connectTo(String connection) throws Exception {
		if(bannedSites.contains(connection.toLowerCase())) { 
            throw new Exception("Access to " + connection + " denied"); 
        } 
		
        internet.connectTo(connection); 
	}

}
