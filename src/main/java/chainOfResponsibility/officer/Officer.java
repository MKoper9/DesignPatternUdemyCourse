package chainOfResponsibility.officer;

import chainOfResponsibility.message.Message;

public class Officer {

    private boolean seregant;
    private  boolean capitain;
    private boolean general;

    public void recieveMessage(Message message)
    {
        if(seregant){
            System.out.println("Seregand recieved a message: "+message.getContent());
        }else if(capitain)
        {
            System.out.println("Captain recieved a message: "+message.getContent());
        }else if(general)
        {
            System.out.println("General recieved a message: "+message.getContent());
        }else
        {
            System.out.println("Nobody recieved");
        }}

    public void setSergent(boolean seregant) {
        this.seregant = seregant;
    }

    public void setCapitain(boolean capitain) {
        this.capitain = capitain;
    }

    public void setGeneral(boolean general) {
        this.general = general;
    }
}
