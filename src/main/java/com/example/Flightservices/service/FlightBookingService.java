package com.example.Flightservices.service;

import com.example.Flightservices.dto.BookingRequest;
import com.example.Flightservices.dto.FlightBookingAcknowledgement;
import com.example.Flightservices.entity.Passengerinfo;
import com.example.Flightservices.entity.Paymentinfo;
import com.example.Flightservices.exception.InsufficientAmountException;
import com.example.Flightservices.repo.Passengerrepo;
import com.example.Flightservices.repo.Payementrepo;
import com.example.Flightservices.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class FlightBookingService {
    @Autowired
    private Passengerrepo passengerrepo;
    @Autowired
    private Payementrepo payementrepo;
    @Transactional
    public FlightBookingAcknowledgement bookingAcknowledgement(BookingRequest request) throws InsufficientAmountException {
        Passengerinfo passengerinfo =request.getPassengerinfo();
        passengerinfo=passengerrepo.save(passengerinfo);
        Paymentinfo paymentinfo=request.getPaymentinfo();
        PaymentUtils.validateCreditLimit(paymentinfo.getAccountNo(),passengerinfo.getFare());
        paymentinfo.setPassengerId(passengerinfo.getPId());
        paymentinfo.setAmount(passengerinfo.getFare());
        payementrepo.save(paymentinfo);
        return new FlightBookingAcknowledgement("success",passengerinfo.getFare(),UUID.randomUUID().toString().split("-")[0],passengerinfo);


    }
}
