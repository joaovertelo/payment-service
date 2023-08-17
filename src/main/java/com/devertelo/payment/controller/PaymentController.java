package com.devertelo.payment.controller;

import com.devertelo.springswaggercodegen3.api.PaymentsApi;
import com.devertelo.springswaggercodegen3.model.PaymentApiRequest;
import com.devertelo.springswaggercodegen3.model.PaymentApiResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class PaymentController implements PaymentsApi {

    @Override
    public ResponseEntity<List<PaymentApiResponse>> getAllPayments() {
        return PaymentsApi.super.getAllPayments();
    }

    @Override
    public ResponseEntity<PaymentApiResponse> createPayment(PaymentApiRequest paymentApiRequest) {
        return PaymentsApi.super.createPayment(paymentApiRequest);
    }


}
