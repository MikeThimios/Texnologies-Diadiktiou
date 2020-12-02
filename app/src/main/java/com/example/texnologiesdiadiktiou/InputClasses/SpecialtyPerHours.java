package com.example.texnologiesdiadiktiou.InputClasses;

public class SpecialtyPerHours {

    private Enum specialtyPerHour;

    public SpecialtyPerHours(Enum specialtyPerHour) {
        this.specialtyPerHour = specialtyPerHour;
    }

    public Enum getSpecialtyPerHour() {
        return specialtyPerHour;
    }

    public void setSpecialtyPerHour(Enum specialtyPerHour) {
        this.specialtyPerHour = specialtyPerHour;
    }
}
