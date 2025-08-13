package br.com.bernardopereira.gestao_cursos.utils;

import java.util.regex.Pattern;

public class PasswordValidation {
  static final int MIN_LENGTH = 8;
  static final int MAX_LENGTH = 15;
  // static final Pattern SPECIAL_CHARACTERS_PATTERN = Pattern.compile("[!@#$%&*-_=+:,.]");
  static final Pattern NUMERIC_PATTERN = Pattern.compile("[0-9]");
  static final Pattern LOWERCASE_PATTERN = Pattern.compile("[a-z]");
  static final Pattern UPPERCASE_PATTERN = Pattern.compile("[A-Z]");

  public static boolean isValid(String password) {
    return password != null &&
           password.length() >= MIN_LENGTH &&
           password.length() <= MAX_LENGTH &&
           LOWERCASE_PATTERN.matcher(password).find() &&
           UPPERCASE_PATTERN.matcher(password).find() &&
           NUMERIC_PATTERN.matcher(password).find();
          //  SPECIAL_CHARACTERS_PATTERN.matcher(password).find();
  }
}
