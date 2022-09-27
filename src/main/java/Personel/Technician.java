package Personel;

public class Technician extends Personnel {

    protected String specialization;

    public Technician(String name, String specialization) {
        super(name);
        this.specialization = "X-RayTechnician";
    }
}
