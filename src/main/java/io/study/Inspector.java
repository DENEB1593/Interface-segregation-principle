package io.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Inspector {

  private final List<ConditionalAction> conditionalActions;

  public Inspector(ConditionalAction... conditionalActions) {
    this.conditionalActions = Arrays.asList(conditionalActions);
  }

  public List<Report> inspect(Facts facts) {
    List<Report> reports = new ArrayList<>();
    conditionalActions.forEach(conditionalAction -> {
      var conditionResult = conditionalAction.evaluate(facts);
      Report report = new Report(conditionalAction, facts, conditionResult);
      reports.add(report);
    });
    return reports;
  }
}
