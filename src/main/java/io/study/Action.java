package io.study;

@FunctionalInterface
public interface Action {
  void perform(Facts facts);
}
