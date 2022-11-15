package com.common.library.com.Common.library.exception;

public class EmployeeNotFoundException extends RuntimeException {

  public EmployeeNotFoundException(Long id) {
    super("Could not find employee " + id);
  }
}