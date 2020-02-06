package mementoHomework.app;

import java.util.ArrayList;
import java.util.List;

public class OperatingSystemCaretaker {

    public List<OperatingSystemMemento>list = new ArrayList<>();

    public void addMemento (OperatingSystemMemento operatingSystemMemento){
        list.add(operatingSystemMemento);
        System.out.println("Add: "+operatingSystemMemento.toString() +" to list");
    }

    public OperatingSystemMemento getMemento(int number){
        return list.get(number-1);
    }
}
