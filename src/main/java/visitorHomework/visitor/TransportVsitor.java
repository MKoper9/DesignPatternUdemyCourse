package visitorHomework.visitor;

import visitorHomework.transporting.Animal;
import visitorHomework.transporting.Person;
import visitorHomework.transporting.Shipment;

public interface TransportVsitor {

    public void visit(Animal animal);
    public void visit(Person person);
    public void visit(Shipment shipment);
}
