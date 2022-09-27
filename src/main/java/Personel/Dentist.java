package Personel;

public class Dentist extends Personel{

    protected String specialization;

    public Dentist(String name, String specialization) {
        super(name);
        this.specialization = "Dentist";
    }

}
