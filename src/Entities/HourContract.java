package Entities;

import java.time.LocalDate;

public class HourContract {
    private LocalDate date;
    private double valuePerHour;
    private int hours;
    public HourContract(int year,int month,int dayOfMonth, double valuePerHour, int hours) {
        LocalDate dt = LocalDate.of(year, month, dayOfMonth);
        this.date = dt;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public double totalValue(){
        double tempValue = getValuePerHour() * getHours();
        return tempValue;
    }

    @Override
    public String toString() {
        return "HourContract [date=" + date + ", valuePerHour=" + valuePerHour + ", hours=" + hours + "]";
    }

    // GETTER & SETTER 
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
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
