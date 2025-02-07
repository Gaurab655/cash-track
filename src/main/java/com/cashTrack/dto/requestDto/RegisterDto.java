package com.cashTrack.dto.requestDto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RegisterDto {

    @NotNull(message = "Enter first name")
    private String firstName;

    private String middleName;

    @NotNull(message = "Enter last name")
    private String lastName;

    @Column(unique = true)
    @NotNull(message = "Email can't be null")
    @Email(message = "Insert valid email")
    private String email;

    @NotNull(message = "Enter password")
    private String password;

}
