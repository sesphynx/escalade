package org.nioun.essentials.actionservice.repos;

import org.nioun.essentials.niounsocial.Action;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActionRepository extends JpaRepository<Action, Long> {

}
