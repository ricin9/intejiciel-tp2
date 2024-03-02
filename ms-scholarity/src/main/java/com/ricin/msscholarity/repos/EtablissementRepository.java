package com.ricin.msscholarity.repos;

import com.ricin.msscholarity.entities.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface EtablissementRepository extends JpaRepository<Etablissement, Long> {
}
