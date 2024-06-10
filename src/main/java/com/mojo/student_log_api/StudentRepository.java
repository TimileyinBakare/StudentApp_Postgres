package com.mojo.student_log_api;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface StudentRepository extends JpaRepository<Students, Integer> {
    List<Students> findAllByFirstnameContaining(String firstname);
}
