package com.customException;

public class InvalidAgeException extends RuntimeException{
      InvalidAgeException(String msg) {
	  super(msg);
  }
}
