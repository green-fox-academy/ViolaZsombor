package com.example.frontend.services;

import com.example.frontend.models.LogInput;
import java.util.List;
import sun.rmi.runtime.Log;

public interface ILogService {

void addNewLog (LogInput logInput);

List<LogInput>findall();

}
