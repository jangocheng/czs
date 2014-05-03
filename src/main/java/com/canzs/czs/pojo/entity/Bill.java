package com.canzs.czs.pojo.entity;

// Generated 2014-4-30 11:35:37 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Bill generated by hbm2java
 */
@Entity
@Table(name = "bill", catalog = "czs")
public class Bill implements java.io.Serializable {

	private Long id;
	private String businessId;
	private String consumerId;
	private Date dateTime;
	private BigDecimal amount;
	private Short type;
	private String consumeCode;
	private Long sceneId;
	private Short status;
	private Date settDateTime;
	private String settHandler;
	private String billHandler;
	private Short isDelete;

	public Bill() {
	}

	public Bill(String businessId, String consumerId, Date dateTime, BigDecimal amount, Short type, String consumeCode,
			Long sceneId, Short status, Date settDateTime, String settHandler, String billHandler, Short isDelete) {
		this.businessId = businessId;
		this.consumerId = consumerId;
		this.dateTime = dateTime;
		this.amount = amount;
		this.type = type;
		this.consumeCode = consumeCode;
		this.sceneId = sceneId;
		this.status = status;
		this.settDateTime = settDateTime;
		this.settHandler = settHandler;
		this.billHandler = billHandler;
		this.isDelete = isDelete;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "business_id")
	public String getBusinessId() {
		return this.businessId;
	}

	public void setBusinessId(String businessId) {
		this.businessId = businessId;
	}

	@Column(name = "consumer_id")
	public String getConsumerId() {
		return this.consumerId;
	}

	public void setConsumerId(String consumerId) {
		this.consumerId = consumerId;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_time", length = 19)
	public Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	@Column(name = "amount", precision = 10)
	public BigDecimal getAmount() {
		return this.amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	@Column(name = "type")
	public Short getType() {
		return this.type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	@Column(name = "consume_code", length = 500)
	public String getConsumeCode() {
		return this.consumeCode;
	}

	public void setConsumeCode(String consumeCode) {
		this.consumeCode = consumeCode;
	}

	@Column(name = "scene_id")
	public Long getSceneId() {
		return this.sceneId;
	}

	public void setSceneId(Long sceneId) {
		this.sceneId = sceneId;
	}

	@Column(name = "status")
	public Short getStatus() {
		return this.status;
	}

	public void setStatus(Short status) {
		this.status = status;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "sett_date_time", length = 19)
	public Date getSettDateTime() {
		return this.settDateTime;
	}

	public void setSettDateTime(Date settDateTime) {
		this.settDateTime = settDateTime;
	}

	@Column(name = "sett_handler")
	public String getSettHandler() {
		return this.settHandler;
	}

	public void setSettHandler(String settHandler) {
		this.settHandler = settHandler;
	}

	@Column(name = "bill_handler")
	public String getBillHandler() {
		return this.billHandler;
	}

	public void setBillHandler(String billHandler) {
		this.billHandler = billHandler;
	}

	@Column(name = "is_delete")
	public Short getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Short isDelete) {
		this.isDelete = isDelete;
	}

}