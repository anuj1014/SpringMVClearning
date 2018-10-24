package com.tutorials.Classes;



import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Component
public class Student {

    public Student(){}

    private String studentName;
    private String city;
    @Size(min = 4, max = 18,message = "Please enter valid Country Name")
    private String country;


    @Min(value =3, message = "Pincode Should not be less than 3 Characters")
    //@Max(value = 6, message = "Pincode Should not be greater than 6 Characters")
    private int pincode;

    private String hobbies;
    @NotNull(message = "Please select Gender")
    private String gender;

    private CourseDetails courseDetails;

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }



    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public CourseDetails getCourseDetails() {
        return courseDetails;
    }

    public void setCourseDetails(CourseDetails courseDetails) {
        this.courseDetails = courseDetails;
    }
}
