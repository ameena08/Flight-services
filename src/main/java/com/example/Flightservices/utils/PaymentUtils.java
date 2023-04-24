package com.example.Flightservices.utils;

import com.example.Flightservices.exception.InsufficientAmountException;

import java.util.HashMap;
import java.util.Map;

public class PaymentUtils {
    private static Map<String, Double> paymentmap=new HashMap<>();
    static{
        paymentmap.put("acc1",20000.00);
        paymentmap.put("acc2",25000.00);
        paymentmap.put("acc3",30000.00);
        paymentmap.put("acc4",15000.00);
        paymentmap.put("acc5",42000.00);
        paymentmap.put("acc6",24000.00);
        paymentmap.put("acc7",29000.00);
        paymentmap.put("acc8",60000.00);
    }
    public static boolean validateCreditLimit(String accountNo, double paidamount)throws InsufficientAmountException {
        if(paidamount>paymentmap.get(accountNo)) {
            throw new InsufficientAmountException("insufficient amount");
        }else{
            return true;
        }
    }
}
