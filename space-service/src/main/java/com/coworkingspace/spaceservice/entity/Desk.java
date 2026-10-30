package com.coworkingspace.spaceservice.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "desks")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Desk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private  String label;

    private  String zone;

    private  Double hourlyRate;

    private  Integer availableSloats;
}
