
package AnimalAdoption.ObjectDepartment;

public class Attributes {

    private Boolean spayedNeutered;

    private Boolean houseTrained;

    private Object declawed;

    private Boolean specialNeeds;

    private Boolean shotsCurrent;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Attributes() {
    }

    /**
     * 
     * @param houseTrained
     * @param declawed
     * @param shotsCurrent
     * @param spayedNeutered
     * @param specialNeeds
     */
    public Attributes(Boolean spayedNeutered, Boolean houseTrained, Object declawed, Boolean specialNeeds, Boolean shotsCurrent) {
        super();
        this.spayedNeutered = spayedNeutered;
        this.houseTrained = houseTrained;
        this.declawed = declawed;
        this.specialNeeds = specialNeeds;
        this.shotsCurrent = shotsCurrent;
    }

    public Boolean getSpayedNeutered() {
        return spayedNeutered;
    }

    public void setSpayedNeutered(Boolean spayedNeutered) {
        this.spayedNeutered = spayedNeutered;
    }

    public Attributes withSpayedNeutered(Boolean spayedNeutered) {
        this.spayedNeutered = spayedNeutered;
        return this;
    }

    public Boolean getHouseTrained() {
        return houseTrained;
    }

    public void setHouseTrained(Boolean houseTrained) {
        this.houseTrained = houseTrained;
    }

    public Attributes withHouseTrained(Boolean houseTrained) {
        this.houseTrained = houseTrained;
        return this;
    }

    public Object getDeclawed() {
        return declawed;
    }

    public void setDeclawed(Object declawed) {
        this.declawed = declawed;
    }

    public Attributes withDeclawed(Object declawed) {
        this.declawed = declawed;
        return this;
    }

    public Boolean getSpecialNeeds() {
        return specialNeeds;
    }

    public void setSpecialNeeds(Boolean specialNeeds) {
        this.specialNeeds = specialNeeds;
    }

    public Attributes withSpecialNeeds(Boolean specialNeeds) {
        this.specialNeeds = specialNeeds;
        return this;
    }

    public Boolean getShotsCurrent() {
        return shotsCurrent;
    }

    public void setShotsCurrent(Boolean shotsCurrent) {
        this.shotsCurrent = shotsCurrent;
    }

    public Attributes withShotsCurrent(Boolean shotsCurrent) {
        this.shotsCurrent = shotsCurrent;
        return this;
    }

}
