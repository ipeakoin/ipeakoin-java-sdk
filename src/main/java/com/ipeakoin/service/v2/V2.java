package com.ipeakoin.service.v2;

import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.v2.DeleteAccountReq;
import com.ipeakoin.dto.req.v2.UpdateAccountReq;

/**
 * @author klover
 * description V2
 * date 2023/6/30 17:31
 */
public interface V2 {
    /**
     * Delete account
     *
     * @param input {@link DeleteAccountReq}
     * @return {@link Boolean}
     * @throws ApiException error
     */
    ApiResponse<Boolean> deleteAccount(DeleteAccountReq input) throws ApiException;

    /**
     * Update a account
     *
     * @param input {@link UpdateAccountReq}
     * @return {@link Boolean}
     * @throws ApiException error
     */
    ApiResponse<Boolean> updateAccount(UpdateAccountReq input) throws ApiException;

    /**
     * card
     *
     * @return {@link com.ipeakoin.service.v2.Card}
     */
    Card card();

    /**
     * quantumAccount
     *
     * @return {@link com.ipeakoin.service.v2.QuantumAccount}
     */
    QuantumAccount quantumAccount();
}
