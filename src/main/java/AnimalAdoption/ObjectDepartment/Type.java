
package AnimalAdoption.ObjectDepartment;

public class Type {


    private String href;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Type() {
    }

    /**
     * 
     * @param href
     */
    public Type(String href) {
        super();
        this.href = href;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Type withHref(String href) {
        this.href = href;
        return this;
    }

}
