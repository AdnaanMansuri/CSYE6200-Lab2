package model;

import javax.swing.ImageIcon;

public class UserProfile {

    private String firstName;
    private String lastName;
    private int age;
    private String gender;
    private String phone;
    private String continent;
    private String experience;
    private ImageIcon photo;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public ImageIcon getPhoto() {
        return photo;
    }

    public void setPhoto(ImageIcon photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Name: " + firstName + " " + lastName
                + "\nAge: " + age
                + "\nGender: " + gender
                + "\nPhone: " + phone
                + "\nContinent: " + continent
                + "\nExperience: " + experience;
    }
}
