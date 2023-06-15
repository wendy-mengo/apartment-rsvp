package com.meng.apartment_rsvp.repos;

import com.meng.apartment_rsvp.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {
}
