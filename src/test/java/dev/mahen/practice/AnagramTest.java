package dev.mahen.practice;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramTest {

  @Test
  public void testG() {
    Anagram anagram = new Anagram();
    anagram.groupAnagrams(new String[]{"eat", "tea"});
  }
}