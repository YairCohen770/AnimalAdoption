
package AnimalAdoption.ObjectDepartment;

public class Video {

    private String embed;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Video() {
    }

    /**
     * 
     * @param embed
     */
    public Video(String embed) {
        super();
        this.embed = embed;
    }

    public String getEmbed() {
        return embed;
    }

    public void setEmbed(String embed) {
        this.embed = embed;
    }

    public Video withEmbed(String embed) {
        this.embed = embed;
        return this;
    }

}
