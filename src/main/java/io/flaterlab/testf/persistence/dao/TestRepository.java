package io.flaterlab.testf.persistence.dao;

import io.flaterlab.testf.persistence.model.Test;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface TestRepository extends JpaRepository<Test, Long> {

    Optional<Test> findTestByTitle(String title);

    List<Test> findAllByPublishedTrue(Pageable pageable);

}
