package com.coworkingspace.bookingservice.dto;


import lombok.Data;

import java.util.List;

@Data
public class BookingRequestDto {

    private  Long id;

    private  String memberName;

    private List<BookingItemRequestDto>items;

    private  Double totalPrice;
}
