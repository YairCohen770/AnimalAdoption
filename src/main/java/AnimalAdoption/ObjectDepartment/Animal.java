
package AnimalAdoption.ObjectDepartment;

import java.util.List;


public class Animal {

    private Integer id;

    private String organizationId;

    private String url;

    private String type;

    private String species;

    private Breeds breeds;

    private Colors colors;

    private String age;

    private String gender;

    private String size;

    private Object coat;

    private Attributes attributes;

    private Environment environment;

    private List<String> tags = null;

    private String name;

    private String description;

    private List<Photo> photos = null;

    private List<Video> videos = null;

    private String status;

    private String publishedAt;

    private Contact contact;

    private Links links;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Animal() {
    }

    /**
     * 
     * @param gender
     * @param publishedAt
     * @param description
     * @param videos
     * @param type
     * @param photos
     * @param url
     * @param colors
     * @param breeds
     * @param tags
     * @param organizationId
     * @param coat
     * @param environment
     * @param size
     * @param species
     * @param contact
     * @param name
     * @param attributes
     * @param links
     * @param id
     * @param age
     * @param status
     */
    public Animal(Integer id, String organizationId, String url, String type, String species, Breeds breeds, Colors colors, String age, String gender, String size, Object coat, Attributes attributes, Environment environment, List<String> tags, String name, String description, List<Photo> photos, List<Video> videos, String status, String publishedAt, Contact contact, Links links) {
        super();
        this.id = id;
        this.organizationId = organizationId;
        this.url = url;
        this.type = type;
        this.species = species;
        this.breeds = breeds;
        this.colors = colors;
        this.age = age;
        this.gender = gender;
        this.size = size;
        this.coat = coat;
        this.attributes = attributes;
        this.environment = environment;
        this.tags = tags;
        this.name = name;
        this.description = description;
        this.photos = photos;
        this.videos = videos;
        this.status = status;
        this.publishedAt = publishedAt;
        this.contact = contact;
        this.links = links;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Animal withId(Integer id) {
        this.id = id;
        return this;
    }

    public String getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(String organizationId) {
        this.organizationId = organizationId;
    }

    public Animal withOrganizationId(String organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Animal withUrl(String url) {
        this.url = url;
        return this;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Animal withType(String type) {
        this.type = type;
        return this;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Animal withSpecies(String species) {
        this.species = species;
        return this;
    }

    public Breeds getBreeds() {
        return breeds;
    }

    public void setBreeds(Breeds breeds) {
        this.breeds = breeds;
    }

    public Animal withBreeds(Breeds breeds) {
        this.breeds = breeds;
        return this;
    }

    public Colors getColors() {
        return colors;
    }

    public void setColors(Colors colors) {
        this.colors = colors;
    }

    public Animal withColors(Colors colors) {
        this.colors = colors;
        return this;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public Animal withAge(String age) {
        this.age = age;
        return this;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Animal withGender(String gender) {
        this.gender = gender;
        return this;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Animal withSize(String size) {
        this.size = size;
        return this;
    }

    public Object getCoat() {
        return coat;
    }

    public void setCoat(Object coat) {
        this.coat = coat;
    }

    public Animal withCoat(Object coat) {
        this.coat = coat;
        return this;
    }

    public Attributes getAttributes() {
        return attributes;
    }

    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    public Animal withAttributes(Attributes attributes) {
        this.attributes = attributes;
        return this;
    }

    public Environment getEnvironment() {
        return environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public Animal withEnvironment(Environment environment) {
        this.environment = environment;
        return this;
    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Animal withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal withName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Animal withDescription(String description) {
        this.description = description;
        return this;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public Animal withPhotos(List<Photo> photos) {
        this.photos = photos;
        return this;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public Animal withVideos(List<Video> videos) {
        this.videos = videos;
        return this;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Animal withStatus(String status) {
        this.status = status;
        return this;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public Animal withPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public Animal withContact(Contact contact) {
        this.contact = contact;
        return this;
    }

    public Links getLinks() {
        return links;
    }

    public void setLinks(Links links) {
        this.links = links;
    }

    public Animal withLinks(Links links) {
        this.links = links;
        return this;
    }

}
