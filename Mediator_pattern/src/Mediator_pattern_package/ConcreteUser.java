package Mediator_pattern_package;

public class ConcreteUser extends User{

	public ConcreteUser(IChatRoom room, String id, String name) {
		super(room, id, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void send(String msg, String userId) {
		System.out.println(this.getName() + " :: Sending Message : " + msg);
        getMediator().sendMessage(msg, userId);
	}

	@Override
	public void receive(String msg) {
		 System.out.println(this.getName() + " :: Received Message : " + msg);
	}
	

}
