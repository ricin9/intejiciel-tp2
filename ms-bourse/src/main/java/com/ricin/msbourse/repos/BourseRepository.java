package com.ricin.msbourse.repos;

import com.ricin.msbourse.entities.Bourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface BourseRepository extends JpaRepository<Bourse, Long> {
}
