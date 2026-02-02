package com.mss.unified.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable

public class AtmCassetteCountId implements Serializable {

  private static final long serialVersionUID = 1L;

  @Column(name = "ATE_ID", nullable = false)
  private String atmCassTerminalId;

  @Column(name = "CASSETTE_ID", nullable = false)
  private String atmCassNumberId;

  public String getAtmCassTerminalId() {
    return atmCassTerminalId;
  }

  public void setAtmCassTerminalId(String atmCassTerminalId) {
    this.atmCassTerminalId = atmCassTerminalId;
  }

  public String getAtmCassNumberId() {
    return atmCassNumberId;
  }

  public void setAtmCassNumberId(String atmCassNumberId) {
    this.atmCassNumberId = atmCassNumberId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof AtmCassetteCountId)) {
      return false;
    }
    AtmCassetteCountId that = (AtmCassetteCountId) o;
    return Objects.equals(getAtmCassTerminalId(), that.getAtmCassTerminalId())
        && Objects.equals(getAtmCassNumberId(), that.getAtmCassNumberId());
  }

  @Override
  public int hashCode() {
    return Objects.hash(getAtmCassTerminalId(), getAtmCassNumberId());
  }
}
