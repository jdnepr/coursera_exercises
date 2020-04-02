package Mediator_pattern_package;
import java.util.HashMap;
import java.util.Map;
//Mediator
public class ChatRoom implements IChatRoom{
	
	private Map<String, User> usersMap = new HashMap<>();
	
	public void sendMessage(String msg, String userId) {
		User u = usersMap.get(userId);
        u.receive(msg);
	};
	
	public void addUser(User user) {
		this.usersMap.put(user.getId(), user);
	};

}
