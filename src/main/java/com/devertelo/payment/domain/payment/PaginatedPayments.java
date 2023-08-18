package com.devertelo.payment.domain.payment;

import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaginatedPayments {

    private int page;
    private int size;
    private int total;
    private int totalPages;
    private boolean hasNext;
    private List<PaymentResponse> results;
}
