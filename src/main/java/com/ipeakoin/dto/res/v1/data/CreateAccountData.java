package com.ipeakoin.dto.res.v1.data;

/**
 * @author klover
 * description CreateAccountData
 * date 2023/7/4 15:50
 */
public class CreateAccountData {
    private String accountId;
    private String userId;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CreateAccountData)) return false;

        CreateAccountData that = (CreateAccountData) o;

        if (getAccountId() != null ? !getAccountId().equals(that.getAccountId()) : that.getAccountId() != null)
            return false;
        return getUserId() != null ? getUserId().equals(that.getUserId()) : that.getUserId() == null;
    }

    @Override
    public int hashCode() {
        int result = getAccountId() != null ? getAccountId().hashCode() : 0;
        result = 31 * result + (getUserId() != null ? getUserId().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CreateAccountData{" +
                "accountId='" + accountId + '\'' +
                ", userId='" + userId + '\'' +
                '}';
    }
}