package week3Task;

public class Singer {

    private String name;
    private String gender;
    private String nationality;
    private Date dateOfBirth;

    public Singer(String name, String gender, String nationality, Date dateOfBirth){
        this.name=name;
        this.gender=gender;
        this.nationality=nationality;
        this.dateOfBirth=dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String toString(){
        return String.format("Name: %s\n Gender: %s\n Nationality: %s\n Date of Birth: %s ", name, gender, nationality, dateOfBirth);
    }
}
