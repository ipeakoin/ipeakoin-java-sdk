package com.ipeakoin.dto.req.v1;

import com.ipeakoin.dto.FileData;
import com.ipeakoin.dto.req.DefaultReq;

/**
 * @author klover
 * description FaceAuthReq
 * date 2023/6/30 17:49
 */
public class FaceAuthReq extends DefaultReq {
    private String accountId;
    private FileData file;

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

    @Override
    public String toString() {
        return "FaceAuthReq{" +
                "accountId='" + accountId + '\'' +
                ", file=" + file +
                ", accessToken='" + accessToken + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof FaceAuthReq)) {
            return false;
        }

        FaceAuthReq that = (FaceAuthReq) o;

        if (getAccountId() != null ? !getAccountId().equals(that.getAccountId()) : that.getAccountId() != null) {
            return false;
        }
        return getFile() != null ? getFile().equals(that.getFile()) : that.getFile() == null;
    }

    @Override
    public int hashCode() {
        int result = getAccountId() != null ? getAccountId().hashCode() : 0;
        result = 31 * result + (getFile() != null ? getFile().hashCode() : 0);
        return result;
    }
}