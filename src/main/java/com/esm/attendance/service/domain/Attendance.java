package com.esm.attendance.service.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

@Entity
@Getter
@Table(name = "T_ATTENDANCE")
public class Attendance implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "ATTENDANCE_DATE")
	private LocalDate attendance_date;

	@Column(name = "EMPLOYEE_ID")
	private Long employee_id;

	@Id
	@Column(name = "ATTENDANCE_ID")
	private Long attendance_id;

	@Column(name = "LATE_BY")
	private LocalDateTime late_by;

	@Column(name = "OVER_TIME")
	private LocalDateTime over_time;

	@Column(name = "SHIFT_TIME")
	private LocalDateTime shift_timing;

	@Column(name = "WORK_DURATION")
	private LocalDateTime work_duration;

	@Column(name = "CHECK_IN_TIME")
	private LocalDateTime check_in_time;

	@Column(name = "CHECK_OUT_TIME")
	private LocalDateTime check_out_time;

	public Attendance() {
	}

	public Attendance(LocalDate attendance_date, Long employee_id, LocalDateTime late_by, LocalDateTime over_time,
			LocalDateTime shift_timing, LocalDateTime work_duration, LocalDateTime check_in_time,
			LocalDateTime check_out_time) {
		this.attendance_date = attendance_date;
		this.employee_id = employee_id;
		this.late_by = late_by;
		this.over_time = over_time;
		this.shift_timing = shift_timing;
		this.work_duration = work_duration;
		this.check_in_time = check_in_time;
		this.check_out_time = check_out_time;
	}

	@Override
	public String toString() {
		return "Attendance [attendance_date=" + attendance_date + ", employee_id=" + employee_id + ", attendance_id="
				+ attendance_id + ", late_by=" + late_by + ", over_time=" + over_time + ", shift_timing=" + shift_timing
				+ ", work_duration=" + work_duration + ", check_in_time=" + check_in_time + ", check_out_time="
				+ check_out_time + "]";
	}
}
