package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Customer extends BaseEntity {

    private String email;
    private String firstName;    // first_name
    private String lastName;
    private String userName;

    @OneToMany
    @JoinColumn(name = "customer_id")
    private List<Address> addresses;

}
