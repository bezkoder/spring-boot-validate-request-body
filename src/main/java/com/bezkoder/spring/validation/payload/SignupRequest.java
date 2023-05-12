package com.bezkoder.spring.validation.payload;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;

public class SignupRequest {

  @NotBlank(message = "The username is required.")
  @Size(min = 3, max = 20, message = "The username must be from 3 to 20 characters.")
  private String username;

  @NotEmpty(message = "The email is required.")
  @Email(message = "The email is not a valid email.")
  private String email;

  @NotNull(message = "The age is required.")
  @Min(value = 18, message = "The age must be equal or greater than 18")
  private int age;

  @NotNull(message = "The graduation date is required.")
  @Past(message = "The graduation date must be in the past.")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date graduationDate;

  @NotBlank(message = "The password is required.")
  @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!*()]).{8,}$", message = "Password must be 8 characters long and combination of uppercase letters, lowercase letters, numbers, special characters.")
  private String password;

  @NotBlank(message = "The confirm Password is required.")
  private String confirmPassword;

  @Valid
  @NotNull(message = "The address is required.")
  private AddressDTO address;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public Date getGraduationDate() {
    return graduationDate;
  }

  public void setGraduationDate(Date graduationDate) {
    this.graduationDate = graduationDate;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getConfirmPassword() {
    return confirmPassword;
  }

  public void setConfirmPassword(String confirmPassword) {
    this.confirmPassword = confirmPassword;
  }

  public AddressDTO getAddress() {
    return address;
  }

  public void setAddress(AddressDTO address) {
    this.address = address;
  }

}
