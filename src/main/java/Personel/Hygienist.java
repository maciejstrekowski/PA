package Personel;

public class Hygienist extends Personel{

    protected String specialization;

    public Hygienist(String name, String specialization) {
        super(name);
        this.specialization = "Hygienist";
    }
}
