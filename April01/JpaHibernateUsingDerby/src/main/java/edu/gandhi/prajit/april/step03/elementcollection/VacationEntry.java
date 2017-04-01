package edu.gandhi.prajit.april.step03.elementcollection;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Embeddable
public class VacationEntry {
	@Temporal(TemporalType.DATE)
	private Calendar startDate;
	@Column(name="DaysCount")
	private int daysCount;
	/**
	 * @return the daysCount
	 */
	public final int getDaysCount() {
		return daysCount;
	}
	/**
	 * @param daysCount the daysCount to set
	 */
	public final void setDaysCount(int daysCount) {
		this.daysCount = daysCount;
	}
	/**
	 * @return the startDate
	 */
	public final Calendar getStartDate() {
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public final void setStartDate(Calendar startDate) {
		this.startDate = startDate;
	}	
}
