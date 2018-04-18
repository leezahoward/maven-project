package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor. There is a Newline problem I'm having.  How do I get rid of it?
   */
  public Greeter() {

  }

  /**
   * @param someone the name of a person
   * @return greeting string
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
