package com.coworkingspace.spaceservice.controller;


import com.coworkingspace.spaceservice.dto.DeskDto;
import com.coworkingspace.spaceservice.service.DeskService;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

import java.util.List;

@RestController
@RequestMapping("/desks")
@Slf4j
@RequiredArgsConstructor
public class DeskController {

    private  final DeskService deskService;
    private  final RestClient restClient;
    private  final DiscoveryClient discoveryClient;

    @GetMapping("/fetchBookings")
    public String fetchFromBookingsService(HttpServletRequest request) {

        // Read custom header from API Gateway
        String header = request.getHeader("X-Custom-Header");
        log.info("Custom Header: {}", header);

        // Discover Booking Service from Eureka
        List<ServiceInstance> instances =
                discoveryClient.getInstances("BOOKING-SERVICE");

        if (instances.isEmpty()) {
            throw new RuntimeException(
                    "Booking service not available in Eureka"
            );
        }

        ServiceInstance serviceInstance = instances.getFirst();

        String url = serviceInstance.getUri()
                + "/bookings/core/helloBookings";

        return restClient.get()
                .uri(url)
                .retrieve()
                .body(String.class);
    }
    @GetMapping
    public ResponseEntity<List<DeskDto>>getAllDesks(){
        List<DeskDto>desks = deskService.getAllDesks();
        return ResponseEntity.ok(desks);
    }
    @GetMapping("/{id}")
    public  ResponseEntity<DeskDto>getDeskById(@PathVariable Long id){
        DeskDto desk = deskService.getDeskById(id);

        return ResponseEntity.ok(desk);
    }


}
