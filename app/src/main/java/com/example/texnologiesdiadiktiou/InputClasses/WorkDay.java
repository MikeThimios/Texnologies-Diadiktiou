package com.example.texnologiesdiadiktiou.InputClasses;

public class WorkDay extends WorkHoursPerDay{

    private Enum dayOpen;
    private WorkHoursPerDay hoursPerDay[] = new WorkHoursPerDay[dayOpen.values().length];

    public WorkDay(Enum daysOpen) {
        this.dayOpen = daysOpen;
    }

    public Enum getDayOpen() {
        return dayOpen;
    }

    public void setDayOpen(Enum dayOpen) {
        this.dayOpen = dayOpen;
    }

    public WorkHoursPerDay[] getHoursPerDay() {
        return hoursPerDay;
    }

    public void setHoursPerDay(WorkHoursPerDay[] hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
    }
}
