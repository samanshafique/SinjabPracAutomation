package org.SinjabPracAutomation.CustomExceptions;

public class FrameworkException extends RuntimeException {

  public FrameworkException(String message) {
    super(message);
  }

  public FrameworkException(String message, Throwable t) {
    super(message, t);
  }
}