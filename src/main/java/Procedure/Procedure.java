package Procedure;

import Patient.Patient;
import Personel.Staff;

import java.util.List;

public class Procedure  {
    private Patient patient;
    private String type;
    private String description;
    private String tooth;
    private Staff staff;

    public Procedure(Patient patient, String type, String description, String tooth, Staff staff) {
        this.patient = patient;
        this.type = type;
        this.description = description;
        this.tooth = tooth;
        this.staff = staff;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTooth() {
        return tooth;
    }

    public void setTooth(String tooth) {
        this.tooth = tooth;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }
    @Override
    public String toString() {
        return "["+patient.getName()+", "+type+", "+description+", "+tooth+", "+staff.getDentists().get(0).getName()+"]";
    }
}
