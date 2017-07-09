package data.user.loadimage;

public class User {
    private String name;
    private String email;
    private String phone;
    private String pictureUrl;
    private String notes;


    public User(String name, String email, String phone, String pictureUrl, String notes) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.pictureUrl = pictureUrl;
        this.notes = notes;
    }
    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
