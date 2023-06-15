package com.meng.apartment_rsvp.repos;

import com.meng.apartment_rsvp.domain.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}
