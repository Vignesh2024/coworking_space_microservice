package com.coworkingspace.spaceservice.dto;


import lombok.Data;

@Data
public class DeskDto {

    private  Long id;

    private  String label;

    private  String zone;

    private  Double hourlyRate;

    private  Integer availableSloats;
}
