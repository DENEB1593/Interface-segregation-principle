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

    businessRuleEngine.addAction(facts -> {
      var jobTitle = facts.getFact("jobTitle");
      if ("CEO".equals(jobTitle)) {
        var name = facts.getFact("name");
        // send mail to target
      }
    });

  }

}