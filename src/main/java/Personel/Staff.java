package Personel;

import java.util.ArrayList;
import java.util.List;

public class Staff {
    private List<Dentist> dentists;
    private List<Hygienist> hygienists;
    private List<Technician> technicians;

    public Staff() {
        this.dentists = new ArrayList<>();
        this.hygienists = new ArrayList<>();
        this.technicians = new ArrayList<>();
    }

    public void addDentist(Dentist dentist) {
        dentists.add(dentist);
    }

    public void addHygienist(Hygienist hygienist) {
        hygienists.add(hygienist);
    }

    public void addTechnician(Technician technician) {
        technicians.add(technician);
    }

    public List<Dentist> getDentists() {
        return dentists;
    }

    public List<Hygienist> getHygienists() {
        return hygienists;
    }

    public List<Technician> getTechnicians() {
        return technicians;
    }
}
