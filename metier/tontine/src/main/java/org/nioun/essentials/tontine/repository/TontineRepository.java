package org.nioun.essentials.tontine.repository;

import java.math.BigDecimal;
import java.util.Date;
import org.nioun.essentials.tontine.model.Tontine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TontineRepository extends JpaRepository<Tontine, Long> {

 Tontine findByMiseAndCagnotte(BigDecimal mise,BigDecimal cagnotte);

 Tontine findByMise(BigDecimal mise);
 
 Tontine findByCagnotte(BigDecimal cagnotte);
 
 Tontine findByDateDebut(Date dateDebut);
 
 Tontine findByDateFin(Date dateFin);
 
 Tontine findByCycle(String cycle);
 
Tontine findByTontineId(Long tontineId);

}
