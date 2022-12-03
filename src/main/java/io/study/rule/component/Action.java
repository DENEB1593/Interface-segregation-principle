package io.study.rule.component;

import io.study.rule.Facts;

@FunctionalInterface
public interface Action {
  void perform(Facts facts);
}
