package Patient;

public class Patient {
    private int id;
    private String name;

    private int noOfVisits;

    boolean isLoyal = false;

    public Patient(int id, String name, int noOfVisits) {
        this.id = id;
        this.name = name;
        this.noOfVisits = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeLoyal() {
        if (noOfVisits >= 3) {
            isLoyal = true;
        }
    }
}
