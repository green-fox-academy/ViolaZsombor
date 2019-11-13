package com.example.frontend.services;

import com.example.frontend.models.LogInput;
import com.example.frontend.repositories.LogRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogService implements ILogService {

  private LogRepository logRepository;

  @Autowired
  public LogService(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  @Override
  public void addNewLog(LogInput logInput) {
    logRepository.save(logInput);
  }

  @Override
  public List<LogInput> findall() {
    List<LogInput> logInputs = new ArrayList<>();
    logRepository.findAll().forEach(log ->logInputs.add(log));
    return logInputs;
  }
}
