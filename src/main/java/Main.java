import Patient.Patient;
import Personel.*;
import Procedure.Procedure;

import java.util.ArrayList;
import java.lang.String;

public class Main {
    public static void main(String[] args){
        ArrayList<Procedure> procedures = new ArrayList();

        Staff staff1 = buildStaff1();
        Staff staff2 = buildStaff2();
        Staff staff3 = buildStaff3();
        Patient patient1 = new Patient(1, "Maciek", 0, false);
        Patient patient2 = new Patient(2, "Edek", 0, false);
        Patient patient3 = new Patient(3, "Przemek", 0, false);
        Procedure procedure = new Procedure(patient1,"Borowanie", "Borowanie i wypelnianie","L6", staff1);
        Procedure procedure2 = new Procedure(patient2,"Kanalowka", "Leczenie kanalowe i wypelnianie","R6", staff3);
        Procedure procedure3 = new Procedure(patient3,"Wyrywanie", "Wyrywanie chorego zeba","L2", staff1);
        Procedure procedure4 = new Procedure(patient2,"Kamien", "Usuwanie Kamienia","L2", staff2);
        Procedure procedure5 = new Procedure(patient3,"Wyrywanie", "Wyrywanie chorego zeba","L2", staff3);
        Procedure procedure6 = new Procedure(patient1,"Wybielanie", "Wybielanie zeba","L2", staff1);
        Procedure procedure7 = new Procedure(patient1,"Wyrywanie", "Wyrywanie chorego zeba","L2", staff1);
        Procedure procedure8 = new Procedure(patient1,"Borowanie", "Borowanie i wypelnianie","L2", staff1);

        procedures.add(procedure);
        procedures.add(procedure2);
        procedures.add(procedure3);
        procedures.add(procedure4);
        procedures.add(procedure5);
        procedures.add(procedure6);
        procedures.add(procedure7);
        procedures.add(procedure8);
        System.out.println(getListOfPerformedProcedures(procedures,"Jozio"));
        System.out.println(getListOfPatients(procedures, "Lusia"));

    }


    private static ArrayList<String> getListOfPatients(ArrayList<Procedure> procedures, String staffName) {
        ArrayList<String> listOfPatients = new ArrayList<>();
        for (Procedure i: procedures) {
            if (i.getStaff().getDentists().get(0).getName().equals(staffName) || i.getStaff().getHygienists().get(0).getName().equals(staffName)
                    || i.getStaff().getTechnicians().get(0).getName().equals(staffName)) {
                listOfPatients.add(i.getPatient().getName());
            }
        }
        return listOfPatients;
    }
    private static ArrayList<String> getListOfPerformedProcedures(ArrayList<Procedure> procedures, String dentistName) {
        ArrayList<String> listOfProcedures = new ArrayList<>();
        for (Procedure i : procedures) {
            if (i.getStaff().getDentists().get(0).getName().equals(dentistName)) {
                listOfProcedures.add(i.getType());
            }
        }
        return listOfProcedures;
    }

    private static Staff buildStaff3() {
        StaffBuilder staffBuilder = new StaffBuilder();
        return staffBuilder
                .dentist(new Dentist("Lusia", "Dentist"))
                .hygienist(new Hygienist("Wiesia", "Hygienist"))
                .technician(new Technician("Waldek", "X-RayTechnician"))
                .build();
    }

    private static Staff buildStaff2() {
        StaffBuilder staffBuilder = new StaffBuilder();
        return staffBuilder
                .dentist(new Dentist("Jozio", "Dentist"))
                .hygienist(new Hygienist("Krysia", "Hygienist"))
                .technician(new Technician("Krzysiek", "X-RayTechnician"))
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
