package com.ipeakoin.v1.core.dto.req;

import com.ipeakoin.v1.core.dto.entity.FileData;

/**
 * FaceAuthReq
 *
 * @author klover
 * @date 2024/4/12 14:17
 */
public class FaceAuthReq {
    private String accountId;
    private FileData file;

    @Override
    public String toString() {
        return "FaceAuthReq{" +
                "accountId='" + accountId + '\'' +
                ", file=" + file +
                '}';
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public FileData getFile() {
        return file;
    }

    public void setFile(FileData file) {
        this.file = file;
    }
}
