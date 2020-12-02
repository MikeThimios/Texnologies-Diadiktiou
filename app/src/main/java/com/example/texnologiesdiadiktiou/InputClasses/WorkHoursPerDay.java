package com.example.texnologiesdiadiktiou.InputClasses;

public class WorkHoursPerDay extends SpecialtyPerHours{

    private Enum WorkingHour;
    private SpecialtyPerHours specialtyPerHours[] = new SpecialtyPerHours[WorkingHour.values().length];

    public WorkHoursPerDay(Enum hoursPerDay) {
        WorkingHour = hoursPerDay;
    }

    public Enum getWorkingHour() {
        return WorkingHour;
    }

    public void setWorkingHour(Enum workingHour) {
        WorkingHour = workingHour;
    }

    public SpecialtyPerHours[] getSpecialtyPerHours() {
        return specialtyPerHours;
    }

    public void setSpecialtyPerHours(SpecialtyPerHours[] specialtyPerHours) {
        this.specialtyPerHours = specialtyPerHours;
    }
}
