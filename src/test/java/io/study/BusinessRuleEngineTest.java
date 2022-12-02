package io.study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class BusinessRuleEngineTest {

  @Test
  void shouldCountWithTwoActions() {
    var mockFacts = mock(Facts.class);
    var mockAction = mock(Action.class);
    var businessRuleEngine = new BusinessRuleEngine(mockFacts);

    businessRuleEngine.addAction(mockAction);
    businessRuleEngine.addAction(mockAction);

    assertEquals(2, businessRuleEngine.count());
  }

  @Test
  void shouldPerformAnActionWithFacts() {
    var mockAction = mock(Action.class);
    var mockFacts = mock(Facts.class);
    var businessRuleEngine = new BusinessRuleEngine(mockFacts);

    businessRuleEngine.addAction(mockAction);
    businessRuleEngine.run();

    verify(mockAction).perform(mockFacts);

  }

  @Test
  void addAction() {
    var mockFacts = mock(Facts.class);
    var businessRuleEngine = new BusinessRuleEngine(mockFacts);

    Condition condition = (facts) -> "CEQ".equals(facts.getFact("jobTitle"));
    Action action = (facts) -> {
      var name = facts.getFact("name");
      System.out.println("send mail to " + name);
    };

    // condition, action 도메인 분리 -> 결합해 rule 생성
    Rule rule = new DefaultRule(condition, action);
  }


}