package com.ipeakoin.service.v2;

import com.ipeakoin.dto.ApiException;
import com.ipeakoin.dto.ApiResponse;
import com.ipeakoin.dto.req.v2.AccountTxReq;
import com.ipeakoin.dto.req.v2.AccountTxsReq;
import com.ipeakoin.dto.res.ListRes;
import com.ipeakoin.dto.res.v2.AccountTxInfo;

/**
 * QuantumAccount
 *
 * @author klover
 * @date 2023/12/27 20:11
 */
public interface QuantumAccount {
    /**
     * List all quantum account transactions
     *
     * @param input {@link AccountTxsReq}
     * @return {@link ListRes<AccountTxInfo>}
     * @throws ApiException
     */
    ApiResponse<ListRes<AccountTxInfo>> getAccountTransactions(AccountTxsReq input) throws ApiException;

    /**
     * Get a quantum account transaction
     *
     * @param input {@link AccountTxsReq}
     * @return {@link AccountTxInfo}
     * @throws ApiException
     */
    ApiResponse<AccountTxInfo> getAccountTransaction(AccountTxReq input) throws ApiException;
}
