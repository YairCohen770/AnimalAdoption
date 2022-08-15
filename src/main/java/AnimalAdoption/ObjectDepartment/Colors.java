
package AnimalAdoption.ObjectDepartment;

public class Colors {


    private Object primary;

    private Object secondary;

    private Object tertiary;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Colors() {
    }

    /**
     * 
     * @param secondary
     * @param tertiary
     * @param primary
     */
    public Colors(Object primary, Object secondary, Object tertiary) {
        super();
        this.primary = primary;
        this.secondary = secondary;
        this.tertiary = tertiary;
    }

    public Object getPrimary() {
        return primary;
    }

    public void setPrimary(Object primary) {
        this.primary = primary;
    }

    public Colors withPrimary(Object primary) {
        this.primary = primary;
        return this;
    }

    public Object getSecondary() {
        return secondary;
    }

    public void setSecondary(Object secondary) {
        this.secondary = secondary;
    }

    public Colors withSecondary(Object secondary) {
        this.secondary = secondary;
        return this;
    }

    public Object getTertiary() {
        return tertiary;
    }

    public void setTertiary(Object tertiary) {
        this.tertiary = tertiary;
    }

    public Colors withTertiary(Object tertiary) {
        this.tertiary = tertiary;
        return this;
    }

}
