package com.devertelo.payment.controller.payment;

import com.devertelo.payment.domain.payment.PaginatedPayments;
import com.devertelo.payment.domain.payment.PaymentRequest;
import com.devertelo.payment.domain.payment.PaymentResponse;
import com.devertelo.payment.model.PaginatedPaymentsApiResponse;
import com.devertelo.payment.model.PaymentApiRequest;
import com.devertelo.payment.model.PaymentApiResponse;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PaymentApiMapper {

    PaymentRequest toRequest(PaymentApiRequest request);

    PaymentApiResponse toResponse(PaymentResponse response);

    List<PaymentApiResponse> toResponses(List<PaymentResponse> response);

    PaginatedPaymentsApiResponse toPaginatedPayments(PaginatedPayments payments);
}
