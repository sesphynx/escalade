package org.nioun.essentials.repos;

import org.nioun.essentials.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment , Long> {

}
