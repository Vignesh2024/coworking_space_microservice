package com.coworkingspace.bookingservice.dto;


import lombok.Data;

@Data
public class BookingItemRequestDto {

    private  Long id;

    private  Long deskId;

    private  Integer hours;

}
