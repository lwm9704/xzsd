package com.xzsd.app.userInfo.entity;

public class UserInfoU {
    /**
     * 用户编号
     */
    private String userId;
    /**
     * 新密码
     */
    private String password;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getInvitationCode() {
        return invitationCode;
    }

    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }
}
