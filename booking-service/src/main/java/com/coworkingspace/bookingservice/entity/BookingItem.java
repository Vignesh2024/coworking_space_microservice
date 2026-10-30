package com.coworkingspace.bookingservice.entity;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Entity
@Table(name = "booking_items")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private  Long deskId;

    private  Integer hours;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private  Booking booking;
}
