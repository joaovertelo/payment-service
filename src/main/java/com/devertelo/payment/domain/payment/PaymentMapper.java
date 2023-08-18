package com.devertelo.payment.domain.payment;

import com.devertelo.payment.infrastructure.db.PaymentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PaymentMapper {

    PaymentEntity toEntity(PaymentRequest request);

    List<PaymentResponse> toResponses(List<PaymentEntity> request);

    @Mapping(source = "createdAt", target = "createdAt", qualifiedByName = "toOffsetDateTime")
    @Mapping(source = "updatedAt", target = "updatedAt", qualifiedByName = "toOffsetDateTime")
    PaymentResponse toResponse(PaymentEntity entity);

    @Named("toOffsetDateTime")
    default OffsetDateTime toOffsetDateTime(LocalDateTime dateTime) {
        if (dateTime == null) {
            return null;
        }
        return dateTime.atOffset(ZoneOffset.UTC);
    }
}
