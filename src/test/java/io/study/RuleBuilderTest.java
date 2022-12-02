package io.study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RuleBuilderTest {

  @Test
  void createRule() {
    Rule rule = RuleBuilder
      .when(facts ->  "CEO".equals(facts.getFact("jobTile")))
      .then(facts -> {
        var name = facts.getFact("name");
        System.out.println("send mail");
      });
  }

}