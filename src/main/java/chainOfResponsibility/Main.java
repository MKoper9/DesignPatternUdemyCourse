package chainOfResponsibility;

import chainOfResponsibility.message.Message;
import chainOfResponsibility.officer.Officer;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("Attack!");
        Officer officer = new Officer();
//        officer.setCapitain(true);
//        officer.setSergent(true);
        officer.recieveMessage(message);

    }
}
