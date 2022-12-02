package io.study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class BusinessRuleEngineTest {

  @Test
  void shouldCountWithTwoActions() {
    Facts mockFacts = mock(Facts.class);
    Action mockAction = mock(Action.class);
    BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(mockFacts);

    businessRuleEngine.addAction(mockAction);
    businessRuleEngine.addAction(mockAction);

    assertEquals(2, businessRuleEngine.count());
  }

  @Test
  void shouldPerformAnActionWithFacts() {
    Action mockAction = mock(Action.class);
    Facts mockFacts = mock(Facts.class);
    BusinessRuleEngine businessRuleEngine = new BusinessRuleEngine(mockFacts);

    businessRuleEngine.addAction(mockAction);
    businessRuleEngine.run();

    verify(mockAction).perform(mockFacts);

  }

}