package io.study.rule.component;

import io.study.rule.Facts;

@FunctionalInterface
public interface Condition {
  boolean evaluate(Facts facts);
}
