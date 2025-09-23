package com.financial.institution.product.application.useCases;

import com.financial.institution.product.application.Dto.UpdateBalanceDto;
import com.financial.institution.product.domain.models.valueObjects.Balance;

public interface UpdateBalancesProductUseCase {
    Balance execute (UpdateBalanceDto update, Long idProduct);
}
