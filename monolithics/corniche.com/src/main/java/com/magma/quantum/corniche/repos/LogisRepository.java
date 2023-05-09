package com.magma.quantum.corniche.repos;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.magma.quantum.corniche.entities.Chambre;
import com.magma.quantum.corniche.entities.Logis;

@Repository
public interface LogisRepository extends JpaRepository<Logis , Long> {

	
@Query("from chambres where douche:=douche and serviceEtage:=serviceEtage and tvAccess:=tvAccess  and wifiAccess:=wifiAccess  and  regularPhoneAccess:=regularPhoneAccess/")
		
public List<Chambre> findChambres(@Param ("douche") boolean  douche0, @Param ("serviceEtage") boolean serviceEtage0,
		@Param ("tvAccess") boolean tvAccess0 , @Param ("wifiAccess") boolean  wifiAccess0 ,
		@Param ("regularPhoneAccess") boolean regularPhoneAccess0 );
}

