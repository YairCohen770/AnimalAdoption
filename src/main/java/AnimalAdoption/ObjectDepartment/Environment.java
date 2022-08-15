
package AnimalAdoption.ObjectDepartment;

public class Environment {

    private Boolean children;

    private Boolean dogs;

    private Boolean cats;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Environment() {
    }

    /**
     * 
     * @param cats
     * @param children
     * @param dogs
     */
    public Environment(Boolean children, Boolean dogs, Boolean cats) {
        super();
        this.children = children;
        this.dogs = dogs;
        this.cats = cats;
    }

    public Boolean getChildren() {
        return children;
    }

    public void setChildren(Boolean children) {
        this.children = children;
    }

    public Environment withChildren(Boolean children) {
        this.children = children;
        return this;
    }

    public Boolean getDogs() {
        return dogs;
    }

    public void setDogs(Boolean dogs) {
        this.dogs = dogs;
    }

    public Environment withDogs(Boolean dogs) {
        this.dogs = dogs;
        return this;
    }

    public Boolean getCats() {
        return cats;
    }

    public void setCats(Boolean cats) {
        this.cats = cats;
    }

    public Environment withCats(Boolean cats) {
        this.cats = cats;
        return this;
    }

}
