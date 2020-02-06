package visitorHomework.transporting;

import visitorHomework.visitor.TransportVsitor;

public interface Transportable {

    public void accept(TransportVsitor transportVsitor);
}
