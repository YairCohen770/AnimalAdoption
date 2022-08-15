
package AnimalAdoption.ObjectDepartment;

public class Links {

    private Self self;

    private Type type;

    private Organization organization;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Links() {
    }

    /**
     * 
     * @param organization
     * @param self
     * @param type
     */
    public Links(Self self, Type type, Organization organization) {
        super();
        this.self = self;
        this.type = type;
        this.organization = organization;
    }

    public Self getSelf() {
        return self;
    }

    public void setSelf(Self self) {
        this.self = self;
    }

    public Links withSelf(Self self) {
        this.self = self;
        return this;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Links withType(Type type) {
        this.type = type;
        return this;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Links withOrganization(Organization organization) {
        this.organization = organization;
        return this;
    }

}
