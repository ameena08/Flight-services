package com.example.Flightservices.dto;

import com.example.Flightservices.entity.Passengerinfo;
import com.example.Flightservices.entity.Paymentinfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingRequest {
    private Passengerinfo passengerinfo;
    private Paymentinfo paymentinfo;
}
