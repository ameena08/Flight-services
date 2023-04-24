package com.example.Flightservices.controller;

import com.example.Flightservices.dto.BookingRequest;
import com.example.Flightservices.dto.FlightBookingAcknowledgement;
import com.example.Flightservices.exception.InsufficientAmountException;
import com.example.Flightservices.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FlighserviceController {
    @Autowired
    private FlightBookingService flightBookingService;

    @PostMapping("/booking")
    public FlightBookingAcknowledgement bookingAcknowledgement(@RequestBody BookingRequest request) throws InsufficientAmountException {
        return flightBookingService.bookingAcknowledgement(request);
    }
}
