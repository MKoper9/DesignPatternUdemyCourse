package chainOfResponsibilityHomework.shelfs;

import chainOfResponsibility.message.Message;

public abstract class Child {

    private Child tallerChild;
    public abstract void processRequest(MotherRequest message);

    public Child getTallerChild() {
        return tallerChild;
    }

    public void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }


}
