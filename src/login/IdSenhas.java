package login;

import java.util.HashMap;

public class IdSenhas {

	HashMap<String, String> LoginInfo = new HashMap<String, String>();
	
	public IdSenhas() {
		LoginInfo.put("Tiago", "Cachorro quente");
		LoginInfo.put("Aristoteles", "PATHOFEXILE");
		LoginInfo.put("Grazielle", "teteiaevick");
		LoginInfo.put("Davi", "roblox");
	}
	
	protected HashMap<String, String> getLoginInfo() {
		return LoginInfo;
	}
	
}
