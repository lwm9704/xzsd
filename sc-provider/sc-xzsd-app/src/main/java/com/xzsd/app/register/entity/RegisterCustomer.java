package com.xzsd.app.register.entity;

public class RegisterCustomer {
    /**
     * 用户id
     */
    private String userId;
    /**
     * 邀请码
     */
    private String invitationCode;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }
}
