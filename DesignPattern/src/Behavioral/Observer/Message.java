package Behavioral.Observer;

/**
 * Created by Sadman on 3/2/2020.
 */
public class Message {

    final String messageContent;

    public Message (String m) {
        this.messageContent = m;
    }

    public String getMessageContent() {
        return messageContent;
    }
}
