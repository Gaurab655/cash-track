package com.cashTrack.entity;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter

public class RegisterEntity {
    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String email;
    private String password;
}
