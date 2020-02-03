package chainOfResponsibility.officer;

import chainOfResponsibility.message.Message;

public class General extends Officer {
    private static final int CODE = 100;
    public static final String NAME = "General Lewandowski";
    @Override
    public void processMessage(Message message) {
        if(message.getOfficerRank().equals(OfficerRank.GENERAL)
                &&message.getCode()==CODE)
        {
            System.out.println(NAME+" get message: "+message.getContent());
        }else {
            System.out.println("Bad CODE or bad reciepient");
        }
    }
}
