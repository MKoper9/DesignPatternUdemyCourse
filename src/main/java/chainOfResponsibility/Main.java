package chainOfResponsibility;

import chainOfResponsibility.message.Message;
import chainOfResponsibility.officer.*;

public class Main {
    public static void main(String[] args) {
        Message message = new Message("Attack!", 100, OfficerRank.GENERAL);

        Officer seregant = new Seregant();
        Officer captain = new Captain();
        Officer general = new General();
        seregant.setSuperiorOfficer(captain);
        captain.setSuperiorOfficer(general);

        seregant.processMessage(message);


    }
}
