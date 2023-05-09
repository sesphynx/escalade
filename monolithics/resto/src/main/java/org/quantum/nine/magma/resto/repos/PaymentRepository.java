package org.quantum.nine.magma.resto.repos;

import org.quantum.nine.magma.resto.entities.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment , Long> {

}
