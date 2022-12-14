package io.study.rule;

import java.util.HashMap;
import java.util.Map;

public class Facts {

  private final Map<String, String> facts = new HashMap<>();

  public String getFact(String name) {
    return facts.getOrDefault(name, "");
  }

  public void addFact(String name, String value) {
    facts.put(name, value);
  }

}
