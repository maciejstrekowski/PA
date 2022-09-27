package Personel;

public class Hygienist extends Personnel {

    protected String specialization;

    public Hygienist(String name, String specialization) {
        super(name);
        this.specialization = "Hygienist";
    }
}
