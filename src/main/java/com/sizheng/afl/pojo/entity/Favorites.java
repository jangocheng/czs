package com.sizheng.afl.pojo.entity;

// Generated 2014-4-26 0:07:03 by Hibernate Tools 3.4.0.CR1

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
 * Favorites generated by hbm2java
 */
@Entity
@Table(name = "favorites", catalog = "afl")
public class Favorites implements java.io.Serializable {

	private Long id;
	private String openId;
	private String refId;
	private Short type;
	private Date dateTime;
	private Short isDelete;
	private String limitCode;

	public Favorites() {
	}

	public Favorites(String openId, String refId, Short type, Date dateTime, Short isDelete, String limitCode) {
		this.openId = openId;
		this.refId = refId;
		this.type = type;
		this.dateTime = dateTime;
		this.isDelete = isDelete;
		this.limitCode = limitCode;
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

	@Column(name = "open_id")
	public String getOpenId() {
		return this.openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	@Column(name = "ref_id")
	public String getRefId() {
		return this.refId;
	}

	public void setRefId(String refId) {
		this.refId = refId;
	}

	@Column(name = "type")
	public Short getType() {
		return this.type;
	}

	public void setType(Short type) {
		this.type = type;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "date_time", length = 19)
	public Date getDateTime() {
		return this.dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	@Column(name = "is_delete")
	public Short getIsDelete() {
		return this.isDelete;
	}

	public void setIsDelete(Short isDelete) {
		this.isDelete = isDelete;
	}

	@Column(name = "limit_code")
	public String getLimitCode() {
		return this.limitCode;
	}

	public void setLimitCode(String limitCode) {
		this.limitCode = limitCode;
	}

}
