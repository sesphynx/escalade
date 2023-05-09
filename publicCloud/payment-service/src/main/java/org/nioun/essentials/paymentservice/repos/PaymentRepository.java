package org.nioun.essentials.paymentservice.repos;


import org.nioun.essentials.niouncore.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {

}
