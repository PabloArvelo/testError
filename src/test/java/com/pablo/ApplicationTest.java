package com.pablo;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;

class ApplicationTest {


  @ParameterizedTest
  @CsvFileSource(resources = "notas.csv",numLinesToSkip = 1)
  void obtenerNota(String n, String c) {
    String resultado = Application.obtenerNota(Integer.parseInt(n));
    assertEquals(c, resultado);
  }
}