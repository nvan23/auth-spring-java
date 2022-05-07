package com.nvan.auth.registration;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegistrationService {

  private EmailValidator emailValidator;

  public String register(RegistrationRequest request) {
    return "it works";
  }
}
