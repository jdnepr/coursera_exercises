package Mediator_pattern_package;
//https://howtodoinjava.com/design-patterns/behavioral/mediator-pattern/
public class Main {

	public static void main(String[] args) {
		IChatRoom chatroom = new ChatRoom();
        
        User user1 = new ConcreteUser(chatroom,"1", "Alex");
        User user2 = new ConcreteUser(chatroom,"2", "Brian");
        User user3 = new ConcreteUser(chatroom,"3", "Charles");
        User user4 = new ConcreteUser(chatroom,"4", "David");
         
        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);
        chatroom.addUser(user4);
 
        user1.send("Hello brian", "2");
        user2.send("Hey buddy", "1");

	}

}
