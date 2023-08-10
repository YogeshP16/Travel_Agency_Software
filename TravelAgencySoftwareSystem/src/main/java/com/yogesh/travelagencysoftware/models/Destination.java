package com.yogesh.travelagencysoftware.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Destination {
    private Long id;
    private String name;
    private List<Activity> Activities;

    public void printDetails() {
        System.out.println("Destination Name : " + this.getName());
        System.out.println();
        for(Activity activity : this.getActivities()) {
            activity.printDetails();
        }
    }
}
