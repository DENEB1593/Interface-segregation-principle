package io.study;

import io.study.rule.Rule;
import io.study.rule.RuleBuilder;
import org.junit.jupiter.api.Test;

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