package com.github.bot.curiosone.core.nlp;

// SUPPRESS CHECKSTYLE AvoidStarImport
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Test;

public class TokenTest {
  @Test
  public void testInstantiation() {
    Token classUnderTest = new Token("color");
    Set<Meaning> means = classUnderTest.getMeanings();
    assertTrue(means.size() > 0);
  }

  @Test
  public void testEquals() {
    Token classUnderTest = new Token("color");
    Token classUnderTestClone = new Token("color");
    assertEquals(classUnderTest, classUnderTestClone);
  }

  @Test
  public void testTokenize() {
    List<Token> tokens;

    tokens = Token.tokenize("The cat is on the table!");
    assertEquals(5, tokens.size());
    assertEquals("the", tokens.get(0).getText());
    assertEquals("cat", tokens.get(1).getText());
    assertEquals("is on", tokens.get(2).getText());
    assertEquals("the", tokens.get(3).getText());
    assertEquals("table", tokens.get(4).getText());

    tokens = Token.tokenize("I love united states of america");
    assertEquals(3, tokens.size());
    assertEquals("I", tokens.get(0).getText());
    assertEquals("love", tokens.get(1).getText());
    assertEquals("united states of america", tokens.get(2).getText());
  }
}
