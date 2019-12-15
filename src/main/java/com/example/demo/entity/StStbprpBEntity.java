package com.example.demo.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "ST_STBPRP_B", schema = "dbo", catalog = "QingYangSHZH_NEW")
public class StStbprpBEntity {
    private String stcd;
    private String stnm;
    private String rvnm;
    private String hnnm;
    private String bsnm;
    private BigDecimal lgtd;
    private BigDecimal lttd;
    private String stlc;
    private String addvcd;
    private String dtmnm;
    private BigDecimal dtmel;
    private BigDecimal dtpr;
    private String sttp;
    private String frgrd;
    private String esstym;
    private String bgfrym;
    private String atcunit;
    private String admauth;
    private String locality;
    private String stbk;
    private Integer stazt;
    private BigDecimal dstrvm;
    private Integer drna;
    private String phcd;
    private String usfl;
    private String comments;
    private Timestamp moditime;

    @Id
    @Column(name = "STCD", nullable = false, length = 8)
    public String getStcd() {
        return stcd;
    }

    public void setStcd(String stcd) {
        this.stcd = stcd;
    }

    @Basic
    @Column(name = "STNM", nullable = true, length = 100)
    public String getStnm() {
        return stnm;
    }

    public void setStnm(String stnm) {
        this.stnm = stnm;
    }

    @Basic
    @Column(name = "RVNM", nullable = true, length = 100)
    public String getRvnm() {
        return rvnm;
    }

    public void setRvnm(String rvnm) {
        this.rvnm = rvnm;
    }

    @Basic
    @Column(name = "HNNM", nullable = true, length = 100)
    public String getHnnm() {
        return hnnm;
    }

    public void setHnnm(String hnnm) {
        this.hnnm = hnnm;
    }

    @Basic
    @Column(name = "BSNM", nullable = true, length = 30)
    public String getBsnm() {
        return bsnm;
    }

    public void setBsnm(String bsnm) {
        this.bsnm = bsnm;
    }

    @Basic
    @Column(name = "LGTD", nullable = true, precision = 6)
    public BigDecimal getLgtd() {
        return lgtd;
    }

    public void setLgtd(BigDecimal lgtd) {
        this.lgtd = lgtd;
    }

    @Basic
    @Column(name = "LTTD", nullable = true, precision = 6)
    public BigDecimal getLttd() {
        return lttd;
    }

    public void setLttd(BigDecimal lttd) {
        this.lttd = lttd;
    }

    @Basic
    @Column(name = "STLC", nullable = true, length = 100)
    public String getStlc() {
        return stlc;
    }

    public void setStlc(String stlc) {
        this.stlc = stlc;
    }

    @Basic
    @Column(name = "ADDVCD", nullable = true, length = 100)
    public String getAddvcd() {
        return addvcd;
    }

    public void setAddvcd(String addvcd) {
        this.addvcd = addvcd;
    }

    @Basic
    @Column(name = "DTMNM", nullable = true, length = 16)
    public String getDtmnm() {
        return dtmnm;
    }

    public void setDtmnm(String dtmnm) {
        this.dtmnm = dtmnm;
    }

    @Basic
    @Column(name = "DTMEL", nullable = true, precision = 3)
    public BigDecimal getDtmel() {
        return dtmel;
    }

    public void setDtmel(BigDecimal dtmel) {
        this.dtmel = dtmel;
    }

    @Basic
    @Column(name = "DTPR", nullable = true, precision = 3)
    public BigDecimal getDtpr() {
        return dtpr;
    }

    public void setDtpr(BigDecimal dtpr) {
        this.dtpr = dtpr;
    }

    @Basic
    @Column(name = "STTP", nullable = true, length = 2)
    public String getSttp() {
        return sttp;
    }

    public void setSttp(String sttp) {
        this.sttp = sttp;
    }

    @Basic
    @Column(name = "FRGRD", nullable = true, length = 1)
    public String getFrgrd() {
        return frgrd;
    }

    public void setFrgrd(String frgrd) {
        this.frgrd = frgrd;
    }

    @Basic
    @Column(name = "ESSTYM", nullable = true, length = 6)
    public String getEsstym() {
        return esstym;
    }

    public void setEsstym(String esstym) {
        this.esstym = esstym;
    }

    @Basic
    @Column(name = "BGFRYM", nullable = true, length = 6)
    public String getBgfrym() {
        return bgfrym;
    }

    public void setBgfrym(String bgfrym) {
        this.bgfrym = bgfrym;
    }

    @Basic
    @Column(name = "ATCUNIT", nullable = true, length = 20)
    public String getAtcunit() {
        return atcunit;
    }

    public void setAtcunit(String atcunit) {
        this.atcunit = atcunit;
    }

    @Basic
    @Column(name = "ADMAUTH", nullable = true, length = 20)
    public String getAdmauth() {
        return admauth;
    }

    public void setAdmauth(String admauth) {
        this.admauth = admauth;
    }

    @Basic
    @Column(name = "LOCALITY", nullable = true, length = 10)
    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    @Basic
    @Column(name = "STBK", nullable = true, length = 10)
    public String getStbk() {
        return stbk;
    }

    public void setStbk(String stbk) {
        this.stbk = stbk;
    }

    @Basic
    @Column(name = "STAZT", nullable = true, precision = 0)
    public Integer getStazt() {
        return stazt;
    }

    public void setStazt(Integer stazt) {
        this.stazt = stazt;
    }

    @Basic
    @Column(name = "DSTRVM", nullable = true, precision = 1)
    public BigDecimal getDstrvm() {
        return dstrvm;
    }

    public void setDstrvm(BigDecimal dstrvm) {
        this.dstrvm = dstrvm;
    }

    @Basic
    @Column(name = "DRNA", nullable = true, precision = 0)
    public Integer getDrna() {
        return drna;
    }

    public void setDrna(Integer drna) {
        this.drna = drna;
    }

    @Basic
    @Column(name = "PHCD", nullable = true, length = 6)
    public String getPhcd() {
        return phcd;
    }

    public void setPhcd(String phcd) {
        this.phcd = phcd;
    }

    @Basic
    @Column(name = "USFL", nullable = true, length = 1)
    public String getUsfl() {
        return usfl;
    }

    public void setUsfl(String usfl) {
        this.usfl = usfl;
    }

    @Basic
    @Column(name = "COMMENTS", nullable = true, length = 200)
    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Basic
    @Column(name = "MODITIME", nullable = true)
    public Timestamp getModitime() {
        return moditime;
    }

    public void setModitime(Timestamp moditime) {
        this.moditime = moditime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StStbprpBEntity that = (StStbprpBEntity) o;
        return Objects.equals(stcd, that.stcd) &&
                Objects.equals(stnm, that.stnm) &&
                Objects.equals(rvnm, that.rvnm) &&
                Objects.equals(hnnm, that.hnnm) &&
                Objects.equals(bsnm, that.bsnm) &&
                Objects.equals(lgtd, that.lgtd) &&
                Objects.equals(lttd, that.lttd) &&
                Objects.equals(stlc, that.stlc) &&
                Objects.equals(addvcd, that.addvcd) &&
                Objects.equals(dtmnm, that.dtmnm) &&
                Objects.equals(dtmel, that.dtmel) &&
                Objects.equals(dtpr, that.dtpr) &&
                Objects.equals(sttp, that.sttp) &&
                Objects.equals(frgrd, that.frgrd) &&
                Objects.equals(esstym, that.esstym) &&
                Objects.equals(bgfrym, that.bgfrym) &&
                Objects.equals(atcunit, that.atcunit) &&
                Objects.equals(admauth, that.admauth) &&
                Objects.equals(locality, that.locality) &&
                Objects.equals(stbk, that.stbk) &&
                Objects.equals(stazt, that.stazt) &&
                Objects.equals(dstrvm, that.dstrvm) &&
                Objects.equals(drna, that.drna) &&
                Objects.equals(phcd, that.phcd) &&
                Objects.equals(usfl, that.usfl) &&
                Objects.equals(comments, that.comments) &&
                Objects.equals(moditime, that.moditime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stcd, stnm, rvnm, hnnm, bsnm, lgtd, lttd, stlc, addvcd, dtmnm, dtmel, dtpr, sttp, frgrd, esstym, bgfrym, atcunit, admauth, locality, stbk, stazt, dstrvm, drna, phcd, usfl, comments, moditime);
    }
}
