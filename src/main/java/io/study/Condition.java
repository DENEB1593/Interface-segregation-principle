package io.study;

@FunctionalInterface
public interface Condition {
  boolean evaluate(Facts facts);
}
