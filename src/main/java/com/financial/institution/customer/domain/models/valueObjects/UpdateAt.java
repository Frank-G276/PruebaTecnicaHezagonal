package com.financial.institution.customer.domain.models.valueObjects;

import java.time.LocalDateTime;

public class UpdateAt {
    private final LocalDateTime updateAt;

    public UpdateAt(LocalDateTime updateAt) {
        this.updateAt = updateAt;
    }

    public UpdateAt() {this.updateAt = LocalDateTime.now();}

    public LocalDateTime getUpdateAt() {
        return updateAt;
    }
}
