package com.politician.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.repository.cdi.Eager;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity

@Table(name = "Politician_Data")
public class Politician
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Politician_Name")
    private String politicianname;

    @Column(name = "Politician_Party")
    private String politicianparty;

    @Column(name = "Politician_State")
    private String politicianstate;

    @Column(name = "Politician_Location")
    private String politicianlocation;

    @Column(name = "Politician_Salary")
    private String politiciansalary;


}
