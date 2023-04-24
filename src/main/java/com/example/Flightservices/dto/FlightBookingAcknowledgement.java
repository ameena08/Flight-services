package com.example.Flightservices.dto;

import com.example.Flightservices.entity.Passengerinfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FlightBookingAcknowledgement {
    private String status;
    private double amount;
    private String pnrno;
    private Passengerinfo passengerinfo;

}
