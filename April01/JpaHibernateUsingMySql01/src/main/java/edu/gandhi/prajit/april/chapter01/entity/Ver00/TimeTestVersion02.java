package edu.gandhi.prajit.april.chapter01.entity.Ver00;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TIME_TEST")
public class TimeTestVersion02 {

	@Id
	@GeneratedValue
	@Column(name = "TIME_TEST_ID")
	private Long timeTestId;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATETIME_COLUMN")
	private Date datetimeColumn;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TIMESTAMP_COLUMN")
	private Date timestampColumn;

	@Temporal(TemporalType.DATE)
	@Column(name = "DATE_COLUMN")
	private Date dateColumn;

	@Temporal(TemporalType.TIME)
	@Column(name = "TIME_COLUMN")
	private Date timeColumn;

	@Column(name = "SQL_DATETIME_COLUMN")
	private java.sql.Timestamp sqlDatetimeColumn;

	@Column(name = "SQL_TIMESTAMP_COLUMN")
	private java.sql.Timestamp sqlTimestampColumn;

	@Column(name = "SQL_DATE_COLUMN")
	private java.sql.Date sqlDateColumn;

	@Column(name = "SQL_TIME_COLUMN")
	private java.sql.Time sqlTimeColumn;

	public TimeTestVersion02() {

	}

	public TimeTestVersion02(Date date) {
		this.datetimeColumn = date;
		this.timestampColumn = date;
		this.timeColumn = date;
		this.dateColumn = date;

		this.sqlDatetimeColumn = new java.sql.Timestamp(date.getTime());
		this.sqlTimestampColumn = new java.sql.Timestamp(date.getTime());
		this.sqlDateColumn = new java.sql.Date(date.getTime());
		this.sqlTimeColumn = new java.sql.Time(date.getTime());
	}

	@Override
	public String toString() {
		return "TimeTest [" + (timeTestId != null ? "timeTestId=" + timeTestId + ", " : "")
				+ (datetimeColumn != null ? "datetimeColumn=" + datetimeColumn + ", " : "")
				+ (timestampColumn != null ? "timestampColumn=" + timestampColumn + ", " : "")
				+ (dateColumn != null ? "dateColumn=" + dateColumn + ", " : "")
				+ (timeColumn != null ? "timeColumn=" + timeColumn + ", " : "")
				+ (sqlDatetimeColumn != null ? "sqlDatetimeColumn=" + sqlDatetimeColumn + ", " : "")
				+ (sqlTimestampColumn != null ? "sqlTimestampColumn=" + sqlTimestampColumn + ", " : "")
				+ (sqlDateColumn != null ? "sqlDateColumn=" + sqlDateColumn + ", " : "")
				+ (sqlTimeColumn != null ? "sqlTimeColumn=" + sqlTimeColumn : "") + "]";
	}

	/**
	 * @return the timeTestId
	 */
	public final Long getTimeTestId() {
		return timeTestId;
	}

	/**
	 * @param timeTestId
	 *            the timeTestId to set
	 */
	public final void setTimeTestId(Long timeTestId) {
		this.timeTestId = timeTestId;
	}

	/**
	 * @return the datetimeColumn
	 */
	public final Date getDatetimeColumn() {
		return datetimeColumn;
	}

	/**
	 * @param datetimeColumn
	 *            the datetimeColumn to set
	 */
	public final void setDatetimeColumn(Date datetimeColumn) {
		this.datetimeColumn = datetimeColumn;
	}

	/**
	 * @return the timestampColumn
	 */
	public final Date getTimestampColumn() {
		return timestampColumn;
	}

	/**
	 * @param timestampColumn
	 *            the timestampColumn to set
	 */
	public final void setTimestampColumn(Date timestampColumn) {
		this.timestampColumn = timestampColumn;
	}

	/**
	 * @return the dateColumn
	 */
	public final Date getDateColumn() {
		return dateColumn;
	}

	/**
	 * @param dateColumn
	 *            the dateColumn to set
	 */
	public final void setDateColumn(Date dateColumn) {
		this.dateColumn = dateColumn;
	}

	/**
	 * @return the timeColumn
	 */
	public final Date getTimeColumn() {
		return timeColumn;
	}

	/**
	 * @param timeColumn
	 *            the timeColumn to set
	 */
	public final void setTimeColumn(Date timeColumn) {
		this.timeColumn = timeColumn;
	}

	/**
	 * @return the sqlDatetimeColumn
	 */
	public final java.sql.Timestamp getSqlDatetimeColumn() {
		return sqlDatetimeColumn;
	}

	/**
	 * @param sqlDatetimeColumn
	 *            the sqlDatetimeColumn to set
	 */
	public final void setSqlDatetimeColumn(java.sql.Timestamp sqlDatetimeColumn) {
		this.sqlDatetimeColumn = sqlDatetimeColumn;
	}

	/**
	 * @return the sqlTimestampColumn
	 */
	public final java.sql.Timestamp getSqlTimestampColumn() {
		return sqlTimestampColumn;
	}

	/**
	 * @param sqlTimestampColumn
	 *            the sqlTimestampColumn to set
	 */
	public final void setSqlTimestampColumn(java.sql.Timestamp sqlTimestampColumn) {
		this.sqlTimestampColumn = sqlTimestampColumn;
	}

	/**
	 * @return the sqlDateColumn
	 */
	public final java.sql.Date getSqlDateColumn() {
		return sqlDateColumn;
	}

	/**
	 * @param sqlDateColumn
	 *            the sqlDateColumn to set
	 */
	public final void setSqlDateColumn(java.sql.Date sqlDateColumn) {
		this.sqlDateColumn = sqlDateColumn;
	}

	/**
	 * @return the sqlTimeColumn
	 */
	public final java.sql.Time getSqlTimeColumn() {
		return sqlTimeColumn;
	}

	/**
	 * @param sqlTimeColumn
	 *            the sqlTimeColumn to set
	 */
	public final void setSqlTimeColumn(java.sql.Time sqlTimeColumn) {
		this.sqlTimeColumn = sqlTimeColumn;
	}
}
