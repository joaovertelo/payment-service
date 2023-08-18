package com.devertelo.payment.domain.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PaymentRequest {

    private Long id;
    private Long userId;
    private PaymentType type;
    private Long amount;
    private PaymentStatus status;
}
