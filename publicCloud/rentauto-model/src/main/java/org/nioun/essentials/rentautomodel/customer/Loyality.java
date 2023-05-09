package org.nioun.essentials.rentautomodel.customer;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @author Mamadou Kebe
 * mutulay@nioun.org
 * www.nioun.com
 * @Project rentautomodel
 */

@Entity
@Table(name = "loyalityPoint")
@Data
public class Loyality {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int transactionId;
    @ManyToOne
    @JoinColumn
    Customer customer;
    int point;
    LocalDateTime expireDate;
}
