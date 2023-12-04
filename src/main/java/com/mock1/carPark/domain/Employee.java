package com.mock1.carPark.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.UuidGenerator;

@Data
@Entity
@NoArgsConstructor
public class Employee {
    @Id
    @UuidGenerator
    private String employeeId;
    private String account;
    private String password;

    public Employee(String account, String password) {
        this.account = account;
        this.password = password;
    }
}
