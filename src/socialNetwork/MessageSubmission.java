package socialNetwork;


public class MessageSubmission extends Post{
	
	private String textMessage;
	
	

	public MessageSubmission(String username, String textMessage) {
		super(username);
		this.textMessage = textMessage;
	}

	public String getTextMessage() {
		return textMessage;
	}

	public void setTextMessage(String textMessage) {
		this.textMessage = textMessage;
	}

	@Override
	public String toString() {
		return "MessageSubmission [textMessage=" + textMessage + "]";
	}
	
	

}
