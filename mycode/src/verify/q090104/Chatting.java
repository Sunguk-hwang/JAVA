package verify.q090104;

public class Chatting {
	void startChat(String chatId) {
		String nick = chatId;
		// nick = 
		
		class Chat{
			public void start() {
				while(true) {
					String input = "Hi";
					String message = "[" + nick + "]" + input;
					sendMessage(message);
				}
			}
			
			void sendMessage(String message) {
				
			}
		}
		
		Chat chat = new Chat();
		chat.start();
	}
}
