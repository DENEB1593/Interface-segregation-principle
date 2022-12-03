package io.study.rule;

import io.study.rule.component.Action;
import io.study.rule.component.Condition;

import java.util.Objects;

public class RuleBuilder {
  private Action action;
  private Condition condition;

  private RuleBuilder(Condition condition) {
    this.condition = condition;
  }

  public static RuleBuilder when(Condition condition) {
    Objects.requireNonNull(condition);
    return new RuleBuilder(condition);
  }

  public Rule then(Action action) {
    Objects.requireNonNull(action);
    return new DefaultRule(condition, action);
  }


}
