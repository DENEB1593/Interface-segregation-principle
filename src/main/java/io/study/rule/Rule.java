package io.study.rule;

@FunctionalInterface
public interface Rule {
  void perform(Facts facts);
}
