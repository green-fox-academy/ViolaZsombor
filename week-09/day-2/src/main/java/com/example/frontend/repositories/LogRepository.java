package com.example.frontend.repositories;

import com.example.frontend.models.LogInput;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogRepository extends CrudRepository<LogInput, Long> {

}

