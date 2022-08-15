
package AnimalAdoption.ObjectDepartment;

public class Breeds {


    private String primary;

    private Object secondary;

    private Boolean mixed;

    private Boolean unknown;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Breeds() {
    }

    /**
     * 
     * @param secondary
     * @param mixed
     * @param primary
     * @param unknown
     */
    public Breeds(String primary, Object secondary, Boolean mixed, Boolean unknown) {
        super();
        this.primary = primary;
        this.secondary = secondary;
        this.mixed = mixed;
        this.unknown = unknown;
    }

    public String getPrimary() {
        return primary;
    }

    public void setPrimary(String primary) {
        this.primary = primary;
    }

    public Breeds withPrimary(String primary) {
        this.primary = primary;
        return this;
    }

    public Object getSecondary() {
        return secondary;
    }

    public void setSecondary(Object secondary) {
        this.secondary = secondary;
    }

    public Breeds withSecondary(Object secondary) {
        this.secondary = secondary;
        return this;
    }

    public Boolean getMixed() {
        return mixed;
    }

    public void setMixed(Boolean mixed) {
        this.mixed = mixed;
    }

    public Breeds withMixed(Boolean mixed) {
        this.mixed = mixed;
        return this;
    }

    public Boolean getUnknown() {
        return unknown;
    }

    public void setUnknown(Boolean unknown) {
        this.unknown = unknown;
    }

    public Breeds withUnknown(Boolean unknown) {
        this.unknown = unknown;
        return this;
    }

}
