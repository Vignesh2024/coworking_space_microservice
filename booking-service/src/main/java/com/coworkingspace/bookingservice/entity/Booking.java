package com.coworkingspace.bookingservice.entity;



import com.coworkingspace.bookingservice.entity.types.BookingStatus;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "bookings")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    private  String memberName;

    @Enumerated(EnumType.STRING)
    private BookingStatus bookingStatus;
    private  Double totalPrice;
    @OneToMany(
            mappedBy = "booking",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<BookingItem> items;


}
