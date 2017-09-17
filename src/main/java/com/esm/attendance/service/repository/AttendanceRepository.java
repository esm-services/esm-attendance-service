package com.esm.attendance.service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esm.attendance.service.domain.Attendance;

public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

}
