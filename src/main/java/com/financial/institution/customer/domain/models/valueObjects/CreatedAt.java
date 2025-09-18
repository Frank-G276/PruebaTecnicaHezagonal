package com.financial.institution.customer.domain.models.valueObjects;

import java.time.LocalDateTime;

public class CreatedAt {
    private final LocalDateTime createAt;

    public CreatedAt() {
        this.createAt = LocalDateTime.now();
    }

    public LocalDateTime getCreateAt(){
        return createAt;
    }
}
