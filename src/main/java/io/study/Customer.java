package io.study;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class Customer {
  private String name;
  private String jobTitle;

  public Customer(String name, String jobTitle) {
    this.name = name;
    this.jobTitle = jobTitle;
  }

  public String getName() {
    return name;
  }

  public String getJobTitle() {
    return jobTitle;
  }

  @Override
  public String toString() {
    return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
      .append("name", name)
      .append("jobTitle", jobTitle)
      .toString();
  }
}
