package Entities;

import java.time.LocalDateTime;

public class HourContract {
    private LocalDateTime date;
    private double valuePerHour;
    private int hours;
    public HourContract(LocalDateTime date, double valuePerHour, int hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }




    
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public double getValuePerHour() {
        return valuePerHour;
    }
    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }
    public int getHours() {
        return hours;
    }
    public void setHours(int hours) {
        this.hours = hours;
    }
}
