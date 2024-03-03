package com.ricin.msformation.repos;

import com.ricin.msformation.entities.Formation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface FormationRepository extends JpaRepository<Formation, Long> {
    List<Formation> findFormationsByDureeBetween(int a, int b);
}
