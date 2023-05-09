package org.nioun.essentials.rentautomodel.rent;

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
@Table(name = "rent")
@Data
public class Rent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int rentId;
    int customerId;
    int vehicleId;
    LocalDateTime rentFrom;
    LocalDateTime rentTill;
    int currentOdometer;
    String returnLocation;
    
    

}
