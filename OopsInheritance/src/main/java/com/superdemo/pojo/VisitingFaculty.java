package com.superdemo.pojo;

public class VisitingFaculty extends Faculty {
    private int dailyWages;

    public VisitingFaculty(int dailyWages, String name, String subject) {
        super(name, subject);
        this.dailyWages = dailyWages;
    }

    public int getDailyWages() {
        return dailyWages;
    }

    public void setDailyWages(int dailyWages) {
        this.dailyWages = dailyWages;
    }
    
    
}
