package com.practice.springbatch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="customer")
public class Customer {
    @javax.persistence.Id
    private Integer Id;
    @Column(name="First_Name")
    private String firstname;
    @Column(name="Last_Name")
    private String lastNamel;
    @Column(name="Email")
    private String email;
    @Column(name="Gender")
    private String gender;
    @Column(name="Contact_No")
    private String contactNo;
    @Column(name="Country")
    private String country;
    @Column(name="DOB")
    private String dob;
}
