package com.reallydan.newbadgelist;

public class Item {
    private String name;
    private String profession;
    private boolean isNew = true;

    //Constructor
    public Item(String name, String profession) {
        this.name = name;
        this.profession = profession;
    }

    //Getters
    public String getName() {
        return name;
    }

    public String getProfession() {
        return profession;
    }

    public boolean isNew() {
        return isNew;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }
}
