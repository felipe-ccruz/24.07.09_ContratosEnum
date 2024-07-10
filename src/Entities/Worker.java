package Entities;

import java.util.ArrayList;
import Enum.WorkerLevel;

public class Worker {
    private String name;
    private WorkerLevel level;
    private double baseSalary;
    private ArrayList<HourContract> contracts = new ArrayList<>();
    public Worker(String name, WorkerLevel level, double baseSalary) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
    }

    // METODOS
    public void addContracts(HourContract contract){
        contracts.add(contract);
    }

    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
        double liquidCash = getBaseSalary();
        for (HourContract hc : contracts){
            if(hc.getDate().getYear() == year && hc.getDate().getMonthValue() == month){
                liquidCash += hc.totalValue();
            }
        }

        return liquidCash;
    }

    // GETTER & SETTER
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public WorkerLevel getLevel() {
        return level;
    }
    public void setLevel(WorkerLevel level) {
        this.level = level;
    }
    public double getBaseSalary() {
        return baseSalary;
    }
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    public ArrayList<HourContract> getHourContracts(){
        return contracts;
    }
}
