package ua.ucu.edu.apps.flower_contnue.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.cglib.core.Local;

import jakarta.persistence.GenerationType;
import lombok.*;
@Data
@Entity(name="app_user")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(unique = true, nullable = false)
    private String email;
    private LocalDate dob;
    @Transient
    private Integer age;
    public Integer getAge(){
        return Period.between(dob, LocalDate.now()).getYears();
    }

}
