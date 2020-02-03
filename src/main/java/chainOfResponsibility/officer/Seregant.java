package chainOfResponsibility.officer;

import chainOfResponsibility.message.Message;

public class Seregant extends Officer {

    private static final int CODE = 10;
    private static final String NAME = "Sgt. Kowalski";

    @Override
    public void processMessage(Message message) {
        if(message.getOfficerRank().equals(OfficerRank.SEREGANT)
        &&message.getCode()==CODE){
            System.out.println(NAME+" get message: "+message.getContent());
        }else {
            getSuperiorOfficer().processMessage(message);
        }
    }
}
