package com.PollService.PollService.userFeignClient;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class UserResponce {
    @JsonProperty("userId")
    private Long userId;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("userEmail")
    private String userEmail;
    @JsonProperty("userAge")
    private Integer userAge;
    @JsonProperty("userAddress")
    private String userAddress;
    @JsonProperty("userJoiningDate")
    private LocalDate userJoiningDate;
    @JsonProperty("regStatus")
    private Boolean regStatus;

    public UserResponce(Long userId, String firstName, String lastName, String userEmail, Integer userAge, String userAddress, LocalDate userJoiningDate, Boolean regStatus) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userEmail = userEmail;
        this.userAge = userAge;
        this.userAddress = userAddress;
        this.userJoiningDate = userJoiningDate;
        this.regStatus = regStatus;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

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

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public LocalDate getUserJoiningDate() {
        return userJoiningDate;
    }

    public void setUserJoiningDate(LocalDate userJoiningDate) {
        this.userJoiningDate = userJoiningDate;
    }

    public Boolean getRegStatus() {
        return regStatus;
    }

    public void setRegStatus(Boolean regStatus) {
        this.regStatus = regStatus;
    }
}
