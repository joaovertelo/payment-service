package com.devertelo.payment.infrastructure.db;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends CrudRepository<PaymentEntity, Long> {

    Page<PaymentEntity> findAll(Pageable pageable);
}
