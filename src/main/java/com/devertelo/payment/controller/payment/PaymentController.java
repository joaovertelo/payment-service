package com.devertelo.payment.controller.payment;

import com.devertelo.payment.api.PaymentsApi;
import com.devertelo.payment.domain.payment.PaymentService;
import com.devertelo.payment.model.PaginatedPaymentsApiResponse;
import com.devertelo.payment.model.PaymentApiRequest;
import com.devertelo.payment.model.PaymentApiResponse;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@AllArgsConstructor
public class PaymentController implements PaymentsApi {

    private final PaymentService service;
    private final PaymentApiMapper mapper;

    @Override
    public ResponseEntity<PaginatedPaymentsApiResponse> getAllPayments() {

        var response = service.getAll(PageRequest.of(0, 10));

        return ResponseEntity.ok(mapper.toPaginatedPayments(response));
    }

    @Override
    public ResponseEntity<PaymentApiResponse> createPayment(PaymentApiRequest paymentApiRequest) {

        var response = service.create(mapper.toRequest(paymentApiRequest));

        return ResponseEntity.created(URI.create("payments/" + response.getId()))
                .body(mapper.toResponse(response));
    }
}
