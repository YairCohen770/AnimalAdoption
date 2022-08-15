
package AnimalAdoption.ObjectDepartment;

public class Organization {


    private String href;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Organization() {
    }

    /**
     * 
     * @param href
     */
    public Organization(String href) {
        super();
        this.href = href;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Organization withHref(String href) {
        this.href = href;
        return this;
    }

}
