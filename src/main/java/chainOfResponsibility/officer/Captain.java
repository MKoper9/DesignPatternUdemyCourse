package chainOfResponsibility.officer;

import chainOfResponsibility.message.Message;

public class Captain extends Officer {
    private static final int CODE = 50;
    public static final String NAME = "Captain Szatkowski";

    @Override
    public void processMessage(Message message) {

        if(message.getOfficerRank().equals(OfficerRank.CAPTAIN)
                &&message.getCode()==CODE)
        {
            System.out.println(NAME+" get message: "+message.getContent());
        }else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}
