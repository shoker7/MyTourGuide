package shoker.mytourguide;


public class Location {

    /**
     * Member variables
     */
    private String name;
    private String address;
    private String description;
    private String phone ;
    private String schedule;
    private String mapBookmark;
    private String url;
    int imageResId;

    /**
     * Constructors
     */
    public Location(String name, String address, String description, String phone,String schedule,String url,String mapbookmark,int imageResId) {
        this.name = name;
        this.address = address;
        this.description = description;
        this.phone = phone;
        this.schedule=schedule;
        this.url=url;
        this.mapBookmark=mapbookmark;
        this.imageResId = imageResId;
    }

    /**
     * Getters and setters
     */
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getDescription() {
        return description;
    }

    public String getPhone() {
        return phone;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getUrl(){
        return url;
    }

    public String getMapBookmark(){
        return mapBookmark;
    }

    public int getImgResId() {
        return imageResId;
    }

    /**
     * Other methods
     */

    @Override
    public String toString() {
        return "Location{" +
                "mName='" + name + '\'' +
                ", mAddress='" + address + '\'' +
                ", mOpeningHours='" + schedule + '\'' +
                ", mPhone='" + phone + '\'' +
                ", mDescription='" + description + '\'' +
                ", mImgResId=" + imageResId +
                '}';
    }
}
