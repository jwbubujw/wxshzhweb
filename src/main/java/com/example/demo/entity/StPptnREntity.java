package com.example.demo.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ST_PPTN_R", schema = "dbo", catalog = "QingYangSHZH_NEW")
@IdClass(StPptnREntityPK.class)
public class StPptnREntity {
    private String stcd;
    private Timestamp tm;
    private BigDecimal drp;
    private BigDecimal intv;
    private BigDecimal pdr;
    private BigDecimal dyp;
    private String wth;

    @Id
    @Column(name = "STCD", nullable = false, length = 8)
    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd;
    }

    @Id
    @Column(name = "TM", nullable = false)
    public Timestamp getTm() {
        return tm;
    }

    public void setTm(Timestamp tm) {
        this.tm = tm;
    }

    @Basic
    @Column(name = "DRP", nullable = true, precision = 1)
    public BigDecimal getDrp() {
        return drp;
    }

    public void setDrp(BigDecimal drp) {
        this.drp = drp;
    }

    @Basic
    @Column(name = "INTV", nullable = true, precision = 2)
    public BigDecimal getIntv() {
        return intv;
    }

    public void setIntv(BigDecimal intv) {
        this.intv = intv;
    }

    @Basic
    @Column(name = "PDR", nullable = true, precision = 2)
    public BigDecimal getPdr() {
        return pdr;
    }

    public void setPdr(BigDecimal pdr) {
        this.pdr = pdr;
    }

    @Basic
    @Column(name = "DYP", nullable = true, precision = 1)
    public BigDecimal getDyp() {
        return dyp;
    }

    public void setDyp(BigDecimal dyp) {
        this.dyp = dyp;
    }

    @Basic
    @Column(name = "WTH", nullable = true, length = 1)
    public String getWth() {
        return wth;
    }

    public void setWth(String wth) {
        this.wth = wth;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StPptnREntity that = (StPptnREntity) o;
        return Objects.equals(stcd, that.stcd) &&
                Objects.equals(tm, that.tm) &&
                Objects.equals(drp, that.drp) &&
                Objects.equals(intv, that.intv) &&
                Objects.equals(pdr, that.pdr) &&
                Objects.equals(dyp, that.dyp) &&
                Objects.equals(wth, that.wth);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stcd, tm, drp, intv, pdr, dyp, wth);
    }
}
