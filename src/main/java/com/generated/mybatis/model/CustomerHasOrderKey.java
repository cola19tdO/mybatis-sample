package com.generated.mybatis.model;

public class CustomerHasOrderKey {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column CUSTOMER_HAS_ORDER.customer_id
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	private Long customerId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column CUSTOMER_HAS_ORDER.order_id
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	private Long orderId;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column CUSTOMER_HAS_ORDER.customer_id
	 * @return  the value of CUSTOMER_HAS_ORDER.customer_id
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	public Long getCustomerId() {
		return customerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column CUSTOMER_HAS_ORDER.customer_id
	 * @param customerId  the value for CUSTOMER_HAS_ORDER.customer_id
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column CUSTOMER_HAS_ORDER.order_id
	 * @return  the value of CUSTOMER_HAS_ORDER.order_id
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	public Long getOrderId() {
		return orderId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column CUSTOMER_HAS_ORDER.order_id
	 * @param orderId  the value for CUSTOMER_HAS_ORDER.order_id
	 * @mbggenerated  Tue May 15 14:05:00 PDT 2012
	 */
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
}