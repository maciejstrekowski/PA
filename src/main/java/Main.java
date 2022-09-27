import Patient.Patient;
import Personel.*;
import Procedure.Procedure;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        ArrayList<Procedure> procedures = new ArrayList<>();

        Staff staff1 = buildStaff1();
        Staff staff2 = buildStaff2();
        Staff staff3 = buildStaff3();
        Procedure procedure = new Procedure(new Patient(1, "Maciek", 0),"Borowanie", "Borowanie i wypelnianie","L6", staff1);
        Procedure procedure2 = new Procedure(new Patient(1, "Maciek", 0),"Borowanie", "Borowanie i wypelnianie","L6", staff1);
        Procedure procedure3 = new Procedure(new Patient(1, "Maciek", 0),"Borowanie", "Borowanie i wypelnianie","L6", staff1);
        procedures.add(procedure);
        procedures.add(procedure2);
        procedures.add(procedure3);
        System.out.println(getListDfProcedures("Jozio",procedures));
    }


    public static ArrayList<Object> getListDfProcedures(String dentist, ArrayList<Procedure> procedures) {
        ArrayList proceduresList = new ArrayList<>();
        for (Procedure i : procedures) {
            if (i.getStaff().getDentists().equals(dentist)) {
                proceduresList.add(i);
            }
        }
        return proceduresList;
    }
    private static Staff buildStaff3() {
        StaffBuilder staffBuilder = new StaffBuilder();
        return staffBuilder
                .dentist(new Dentist("Lusia", "Dentist"))
                .build();
    }

    private static Staff buildStaff2() {
        StaffBuilder staffBuilder = new StaffBuilder();
        return staffBuilder
                .dentist(new Dentist("Jozio", "Dentist"))
                .hygienist(new Hygienist("Krysia", "Hygienist"))
                .build();
    }

    private static Staff buildStaff1() {
        StaffBuilder staffBuilder = new StaffBuilder();
        return staffBuilder
                .dentist(new Dentist("Jozio", "Dentist"))
                .hygienist(new Hygienist("Krysia", "Hygienist"))
                .technician(new Technician("Waldek", "X-RayTechnician"))
                .build();
    }
}
