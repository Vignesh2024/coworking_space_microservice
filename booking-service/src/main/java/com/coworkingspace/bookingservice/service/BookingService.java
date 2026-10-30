package com.coworkingspace.bookingservice.service;


import com.coworkingspace.bookingservice.dto.BookingRequestDto;
import com.coworkingspace.bookingservice.entity.Booking;
import com.coworkingspace.bookingservice.repository.BookingRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class BookingService {

    private  final BookingRepository bookingRepository;

    private final  ModelMapper modelMapper;

    public List<BookingRequestDto>getAllBookings(){
        log.info("Fetching all bookings");
        List<Booking>bookings = bookingRepository.findAll();
        return bookings.stream()
                .map(booking->modelMapper.map(
                        booking,
                        BookingRequestDto.class
                ))
                .toList();
    }

    public  BookingRequestDto getBookingById(Long bookingId){
        log.info("Fetching booking with ID:{}",bookingId);
        Booking booking = bookingRepository.findById(bookingId)
                .orElseThrow(()-> new RuntimeException("Booking id not found"));
        return modelMapper.map(booking,BookingRequestDto.class);

    }
}
