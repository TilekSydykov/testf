package io.flaterlab.testf.persistence.dao;

import io.flaterlab.testf.persistence.model.Test;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "tests", collectionResourceRel = "tests", itemResourceRel = "test")
public interface TestRepository extends JpaRepository<Test, Long> {
}