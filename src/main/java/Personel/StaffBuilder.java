package Personel;

public class StaffBuilder {
    private Staff staff;

    public StaffBuilder() {
        this.staff = new Staff();
    }

    public Staff build() {
        if (staff.getDentists().size() < 1 && staff.getHygienists().size() < 1 && staff.getTechnicians().size() < 1) {
            throw new IllegalStateException("Not enough personnel to start an event");
        }
        return staff;
    }

    public StaffBuilder dentist(Dentist dentist) {
        staff.getDentists().add(dentist);
        return this;
    }

    public StaffBuilder hygienist(Hygienist hygienist) {
        staff.getHygienists().add(hygienist);
        return this;
    }

    public StaffBuilder technician(Technician technician) {
        staff.getTechnicians().add(technician);
        return this;
    }
}
