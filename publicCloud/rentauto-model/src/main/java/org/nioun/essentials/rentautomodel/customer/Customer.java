package org.nioun.essentials.rentautomodel.customer;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


/**
 * @author Mamadou Kebe
 * mutulay@nioun.org
 * www.nioun.com
 * @Project rentautomodel
 */



@Entity
@Table(name = "customer")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    private String firstName;
    private String lastName;
    private String dlNumber;
    private String zipcode;
    @OneToMany(mappedBy = "customer")
    private List<Loyality> loyalities;


}
