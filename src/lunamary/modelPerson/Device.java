package lunamary.modelPerson;

public class Device {

    private String type;
    private String identifier;
    private Person owner;


    public Device(String type, String identifier, Person owner) {
        this.type = type;
        this.identifier = identifier;
        this.owner = owner;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIdentifier() {
        return identifier;
    }

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }


}
