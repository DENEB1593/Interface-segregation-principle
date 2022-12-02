package io.study;

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
    return new DefaultRule(condition, action);
  }


}
