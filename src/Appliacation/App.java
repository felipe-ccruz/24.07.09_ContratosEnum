package Appliacation;

import Entities.Departament;
import Entities.HourContract;
import Entities.Worker;
import Enum.WorkerLevel;

public class App {
    public static void main(String[] args) throws Exception {
        Departament desing = new Departament("Desing");

        Worker w1 = new Worker("Felipe", WorkerLevel.PLENO, desing, 2788.10);

        HourContract hc1 = new HourContract(2024, 7, 27, 100, 32);
        HourContract hc2 = new HourContract(2024, 2, 27, 70, 22);
        HourContract hc3 = new HourContract(2024, 7, 27, 120, 12);
        w1.addContracts(hc1); 
        w1.addContracts(hc2); 
        w1.addContracts(hc3); 

        int numContracts = 0;
        for(HourContract hc : w1.getContracts()){
            numContracts++;
        }

        System.out.println("\nDEPARTAMENT: " + w1.getDepartament().getName());
        System.out.println("NAME: " + w1.getName());
        System.out.println("LEVEL: " + w1.getLevel());
        System.out.println("BASE SALARY: " + w1.getBaseSalary());
        System.out.println("NUM CONTRACTS: " + numContracts);

        System.out.println("\n" + hc1.toString() + "\n");
        System.out.println("\n" + hc2.toString() + "\n");
        System.out.println("\n" + hc3.toString() + "\n");

        System.out.println("\nR$ " +  w1.income(2024, 7) + "\n");
    }
}
