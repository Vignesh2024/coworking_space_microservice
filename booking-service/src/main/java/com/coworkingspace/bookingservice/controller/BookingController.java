package com.coworkingspace.bookingservice.controller;


import com.coworkingspace.bookingservice.dto.BookingRequestDto;
import com.coworkingspace.bookingservice.service.BookingService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping("/core")
public class BookingController {

    private  final BookingService bookingService;

    @GetMapping("/helloBookings")
    public String helloBooking(){
        return "Hello booking";
    }
    @GetMapping
    public ResponseEntity<List<BookingRequestDto>>getAllBookings(){
        log.info("Fetching all booking via controller");
        List<BookingRequestDto>bookings = bookingService.getAllBookings();
        return ResponseEntity.ok(bookings);
    }
    @GetMapping("/{id}")
    public  ResponseEntity<BookingRequestDto>getBookingById(@PathVariable Long id){
        log.info("Fetching booking via ID:{}via controller",id);
        BookingRequestDto booking = bookingService.getBookingById(id);
        return ResponseEntity.ok(booking);
    }
}
