package com.devertelo.payment.domain.payment;

import com.devertelo.payment.infrastructure.db.PaymentRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PaymentService {

    private final PaymentRepository repository;
    private final PaymentMapper paymentMapper;

    public PaginatedPayments getAll(PageRequest pageRequest) {
        var entities = repository.findAll(pageRequest);
        var results = paymentMapper.toResponses(entities.getContent());
        return PaginatedPayments.builder()
                .page(entities.getNumber())
                .size(entities.getSize())
                .total(entities.getTotalPages())
                .hasNext(entities.hasNext())
                .totalPages(entities.getTotalPages())
                .results(results)
                .build();
    }

    public PaymentResponse create(PaymentRequest request) {
        var entity = paymentMapper.toEntity(request);
        var entitySaved = repository.save(entity);
        return paymentMapper.toResponse(entitySaved);
    }
}
