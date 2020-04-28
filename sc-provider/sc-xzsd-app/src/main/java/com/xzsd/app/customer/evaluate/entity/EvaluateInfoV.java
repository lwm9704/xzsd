package com.xzsd.app.customer.evaluate.entity;

/**
 * @author weiming
 * @date 2020-4-26
 */
public class EvaluateInfoV {
    /**
     * 评价编号
     */
    private String evaluateId;
    /**
     * 用户编号
     */
    private String userId;
    /**
     * 用户名称
     */
    private String userName;
    /**
     * 评价内容
     */
    private String evaluat;
    /**
     * 评价等级
     */
    private int grade;
    /**
     * 评价创建时间
     */
    private String evaluateTime;

    public String getEvaluateId() {
        return evaluateId;
    }

    public void setEvaluateId(String evaluateId) {
        this.evaluateId = evaluateId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEvaluat() {
        return evaluat;
    }

    public void setEvaluat(String evaluat) {
        this.evaluat = evaluat;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getEvaluateTime() {
        return evaluateTime;
    }

    public void setEvaluateTime(String evaluateTime) {
        this.evaluateTime = evaluateTime;
    }
}
