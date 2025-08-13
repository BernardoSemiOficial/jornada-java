package br.com.bernardopereira.gestao_cursos.utils;

import java.util.regex.Pattern;

public class EmailValidation {
  static final String EMAIL_VALIDATION_REGEX = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

  public static boolean isValid(String email) {
    Pattern pattern = Pattern.compile(EMAIL_VALIDATION_REGEX);
    return email != null && pattern.matcher(email).matches();
  }
}
