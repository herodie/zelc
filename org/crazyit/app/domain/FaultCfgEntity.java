package org.crazyit.app.domain;

/**
 * Created by 010200022422 on 2017/7/28.
 */
public class FaultCfgEntity {
    private String fltId;
    private Integer fltVersion;
    private String fltCar;
    private Integer fltBitOffset;
    private String fltGrade;
    private String fltSystem;
    private String fltNameL1;
    private String fltNameL2;
    private String fltNameL3;
    private String fltDescrL1;
    private String fltDescrL2;
    private String fltDescrL3;
    private String fltActionL1;
    private String fltActionL2;
    private String fltActionL3;
    private int id;

    public String getFltId() {
        return fltId;
    }

    public void setFltId(String fltId) {
        this.fltId = fltId;
    }

    public Integer getFltVersion() {
        return fltVersion;
    }

    public void setFltVersion(Integer fltVersion) {
        this.fltVersion = fltVersion;
    }

    public String getFltCar() {
        return fltCar;
    }

    public void setFltCar(String fltCar) {
        this.fltCar = fltCar;
    }

    public Integer getFltBitOffset() {
        return fltBitOffset;
    }

    public void setFltBitOffset(Integer fltBitOffset) {
        this.fltBitOffset = fltBitOffset;
    }

    public String getFltGrade() {
        return fltGrade;
    }

    public void setFltGrade(String fltGrade) {
        this.fltGrade = fltGrade;
    }

    public String getFltSystem() {
        return fltSystem;
    }

    public void setFltSystem(String fltSystem) {
        this.fltSystem = fltSystem;
    }

    public String getFltNameL1() {
        return fltNameL1;
    }

    public void setFltNameL1(String fltNameL1) {
        this.fltNameL1 = fltNameL1;
    }

    public String getFltNameL2() {
        return fltNameL2;
    }

    public void setFltNameL2(String fltNameL2) {
        this.fltNameL2 = fltNameL2;
    }

    public String getFltNameL3() {
        return fltNameL3;
    }

    public void setFltNameL3(String fltNameL3) {
        this.fltNameL3 = fltNameL3;
    }

    public String getFltDescrL1() {
        return fltDescrL1;
    }

    public void setFltDescrL1(String fltDescrL1) {
        this.fltDescrL1 = fltDescrL1;
    }

    public String getFltDescrL2() {
        return fltDescrL2;
    }

    public void setFltDescrL2(String fltDescrL2) {
        this.fltDescrL2 = fltDescrL2;
    }

    public String getFltDescrL3() {
        return fltDescrL3;
    }

    public void setFltDescrL3(String fltDescrL3) {
        this.fltDescrL3 = fltDescrL3;
    }

    public String getFltActionL1() {
        return fltActionL1;
    }

    public void setFltActionL1(String fltActionL1) {
        this.fltActionL1 = fltActionL1;
    }

    public String getFltActionL2() {
        return fltActionL2;
    }

    public void setFltActionL2(String fltActionL2) {
        this.fltActionL2 = fltActionL2;
    }

    public String getFltActionL3() {
        return fltActionL3;
    }

    public void setFltActionL3(String fltActionL3) {
        this.fltActionL3 = fltActionL3;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FaultCfgEntity that = (FaultCfgEntity) o;

        if (id != that.id) return false;
        if (fltId != null ? !fltId.equals(that.fltId) : that.fltId != null) return false;
        if (fltVersion != null ? !fltVersion.equals(that.fltVersion) : that.fltVersion != null) return false;
        if (fltCar != null ? !fltCar.equals(that.fltCar) : that.fltCar != null) return false;
        if (fltBitOffset != null ? !fltBitOffset.equals(that.fltBitOffset) : that.fltBitOffset != null) return false;
        if (fltGrade != null ? !fltGrade.equals(that.fltGrade) : that.fltGrade != null) return false;
        if (fltSystem != null ? !fltSystem.equals(that.fltSystem) : that.fltSystem != null) return false;
        if (fltNameL1 != null ? !fltNameL1.equals(that.fltNameL1) : that.fltNameL1 != null) return false;
        if (fltNameL2 != null ? !fltNameL2.equals(that.fltNameL2) : that.fltNameL2 != null) return false;
        if (fltNameL3 != null ? !fltNameL3.equals(that.fltNameL3) : that.fltNameL3 != null) return false;
        if (fltDescrL1 != null ? !fltDescrL1.equals(that.fltDescrL1) : that.fltDescrL1 != null) return false;
        if (fltDescrL2 != null ? !fltDescrL2.equals(that.fltDescrL2) : that.fltDescrL2 != null) return false;
        if (fltDescrL3 != null ? !fltDescrL3.equals(that.fltDescrL3) : that.fltDescrL3 != null) return false;
        if (fltActionL1 != null ? !fltActionL1.equals(that.fltActionL1) : that.fltActionL1 != null) return false;
        if (fltActionL2 != null ? !fltActionL2.equals(that.fltActionL2) : that.fltActionL2 != null) return false;
        if (fltActionL3 != null ? !fltActionL3.equals(that.fltActionL3) : that.fltActionL3 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fltId != null ? fltId.hashCode() : 0;
        result = 31 * result + (fltVersion != null ? fltVersion.hashCode() : 0);
        result = 31 * result + (fltCar != null ? fltCar.hashCode() : 0);
        result = 31 * result + (fltBitOffset != null ? fltBitOffset.hashCode() : 0);
        result = 31 * result + (fltGrade != null ? fltGrade.hashCode() : 0);
        result = 31 * result + (fltSystem != null ? fltSystem.hashCode() : 0);
        result = 31 * result + (fltNameL1 != null ? fltNameL1.hashCode() : 0);
        result = 31 * result + (fltNameL2 != null ? fltNameL2.hashCode() : 0);
        result = 31 * result + (fltNameL3 != null ? fltNameL3.hashCode() : 0);
        result = 31 * result + (fltDescrL1 != null ? fltDescrL1.hashCode() : 0);
        result = 31 * result + (fltDescrL2 != null ? fltDescrL2.hashCode() : 0);
        result = 31 * result + (fltDescrL3 != null ? fltDescrL3.hashCode() : 0);
        result = 31 * result + (fltActionL1 != null ? fltActionL1.hashCode() : 0);
        result = 31 * result + (fltActionL2 != null ? fltActionL2.hashCode() : 0);
        result = 31 * result + (fltActionL3 != null ? fltActionL3.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
