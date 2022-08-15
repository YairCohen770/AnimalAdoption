
package AnimalAdoption.ObjectDepartment;

public class Photo {

    private String small;

    private String medium;

    private String large;

    private String full;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Photo() {
    }

    /**
     * 
     * @param small
     * @param large
     * @param medium
     * @param full
     */
    public Photo(String small, String medium, String large, String full) {
        super();
        this.small = small;
        this.medium = medium;
        this.large = large;
        this.full = full;
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small;
    }

    public Photo withSmall(String small) {
        this.small = small;
        return this;
    }

    public String getMedium() {
        return medium;
    }

    public void setMedium(String medium) {
        this.medium = medium;
    }

    public Photo withMedium(String medium) {
        this.medium = medium;
        return this;
    }

    public String getLarge() {
        return large;
    }

    public void setLarge(String large) {
        this.large = large;
    }

    public Photo withLarge(String large) {
        this.large = large;
        return this;
    }

    public String getFull() {
        return full;
    }

    public void setFull(String full) {
        this.full = full;
    }

    public Photo withFull(String full) {
        this.full = full;
        return this;
    }

}
