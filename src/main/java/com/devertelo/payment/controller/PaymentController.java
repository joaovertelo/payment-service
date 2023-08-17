package com.devertelo.payment.controller;

import com.devertelo.payment.api.PaymentsApi;
import com.devertelo.payment.model.PaymentApiRequest;
import com.devertelo.payment.model.PaymentApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
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
