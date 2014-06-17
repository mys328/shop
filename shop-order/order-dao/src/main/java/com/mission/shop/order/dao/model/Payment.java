package com.mission.shop.order.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Payment implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.payment_id
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    private Long paymentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.order_id
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    private Long orderId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.amount
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    private String amount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.status
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    private Integer status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.create_time
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.update_time
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.pay_account
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    private String payAccount;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column payment.payer_name
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    private String payerName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table payment
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.payment_id
     *
     * @return the value of payment.payment_id
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    public Long getPaymentId() {
        return paymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.payment_id
     *
     * @param paymentId the value for payment.payment_id
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.order_id
     *
     * @return the value of payment.order_id
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.order_id
     *
     * @param orderId the value for payment.order_id
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.amount
     *
     * @return the value of payment.amount
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    public String getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.amount
     *
     * @param amount the value for payment.amount
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    public void setAmount(String amount) {
        this.amount = amount == null ? null : amount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.status
     *
     * @return the value of payment.status
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.status
     *
     * @param status the value for payment.status
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.create_time
     *
     * @return the value of payment.create_time
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.create_time
     *
     * @param createTime the value for payment.create_time
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.update_time
     *
     * @return the value of payment.update_time
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.update_time
     *
     * @param updateTime the value for payment.update_time
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.pay_account
     *
     * @return the value of payment.pay_account
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    public String getPayAccount() {
        return payAccount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.pay_account
     *
     * @param payAccount the value for payment.pay_account
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount == null ? null : payAccount.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column payment.payer_name
     *
     * @return the value of payment.payer_name
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    public String getPayerName() {
        return payerName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column payment.payer_name
     *
     * @param payerName the value for payment.payer_name
     *
     * @mbggenerated Tue Jun 17 17:11:38 CST 2014
     */
    public void setPayerName(String payerName) {
        this.payerName = payerName == null ? null : payerName.trim();
    }
}