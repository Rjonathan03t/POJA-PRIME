package com.company.base.endpoint.rest.controller.health;

import com.company.base.PojaGenerated;
import com.company.base.repository.DummyRepository;
import com.company.base.repository.DummyUuidRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@PojaGenerated
@RestController
@AllArgsConstructor
public class PingController {

  DummyRepository dummyRepository;
  DummyUuidRepository dummyUuidRepository;

  public static final ResponseEntity<String> OK = new ResponseEntity<>("OK", HttpStatus.OK);
  public static final ResponseEntity<String> KO =
      new ResponseEntity<>("KO", HttpStatus.INTERNAL_SERVER_ERROR);

  @GetMapping("/ping")
  public String ping() {
    return "pong";
  }

  @GetMapping("/new-prime")
  public String getNewPrime() {
    BigInteger probablePrime = BigInteger.probablePrime(10000, new java.util.Random());
    return "Nouveau nombre premier probable : " + probablePrime.toString();
  }
}
