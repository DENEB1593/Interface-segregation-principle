package io.study;

@FunctionalInterface
public interface Rule {
  void perform(Facts facts);
}
