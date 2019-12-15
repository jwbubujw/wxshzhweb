package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Objects;

public class StPptnREntityPK implements Serializable {
    private String stcd;
    private Timestamp tm;

    @Column(name = "STCD", nullable = false, length = 8)
    @Id
    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd;
    }

    @Column(name = "TM", nullable = false)
    @Id
    public Timestamp getTm() {
        return tm;
    }

    public void setTm(Timestamp tm) {
        this.tm = tm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StPptnREntityPK that = (StPptnREntityPK) o;
        return Objects.equals(stcd, that.stcd) &&
                Objects.equals(tm, that.tm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stcd, tm);
    }
}
