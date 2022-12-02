package io.study;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Report {
  private final ConditionalAction conditionalAction;
  private final Facts facts;
  private final boolean isPositive;

  public Report(ConditionalAction conditionalAction,
                Facts facts,
                boolean isPositive) {
    this.conditionalAction = conditionalAction;
    this.facts = facts;
    this.isPositive = isPositive;
  }

  public ConditionalAction getConditionalAction() {
    return conditionalAction;
  }

  public Facts getFacts() {
    return facts;
  }

  public boolean isPositive() {
    return isPositive;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
      .append("conditionalAction", conditionalAction)
      .append("facts", facts)
      .append("isPositive", isPositive)
      .toString();
  }
}
