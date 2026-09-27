package model;

import javax.swing.ImageIcon;

public class UserProfile {

    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    private String phone;
    private String email;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
                + "\nGender: " + gender
                + "\nAge: " + age
                + "\nPhone: " + phone
                + "\nEmail: " + email;
    }
}
