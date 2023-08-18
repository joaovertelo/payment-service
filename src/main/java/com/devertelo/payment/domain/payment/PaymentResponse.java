package com.devertelo.payment.domain.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.OffsetDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentResponse {

    private Long id;
    private Long userId;
    private PaymentType type;
    private Long amount;
    private PaymentStatus status;
    private OffsetDateTime createdAt;
    private OffsetDateTime updatedAt;
}
