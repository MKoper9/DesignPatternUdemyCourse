package visitor;

import visitor.activity.Activity;
import visitor.activity.Squash;
import visitor.activity.Treadmil;
import visitor.activity.Weights;
import visitor.visitor.VisitorImpl;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Treadmil treadmil = new Treadmil(200);
        Squash squash = new Squash(45);
        Weights weights = new Weights(50,10);


        VisitorImpl visitor = new VisitorImpl();

        treadmil.accept(visitor);
        squash.accept(visitor);
        weights.accept(visitor);

        System.out.println("______________________");

        List<Activity>activityList= Arrays.asList(treadmil,squash,weights);
        activityList.forEach(activity -> activity.accept(visitor));
    }
}
