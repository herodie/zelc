package org.crazyit.app.domain;

/**
 * Created by 010200022422 on 2017/7/25.
 */
public class EventCfgEntity {
    private int evtId;
    private int evtVersion;
    private int evtType;
    private int evtByteOffset;
    private int evtLen;
    private String evtSystem;
    private String evtNameL1;
    private String evtNameL2;
    private String evtNameL3;
    private Integer evtSign;
    private String evtOp1;
    private Double evtOpvalue1;
    private String evtOp2;
    private Double evtOpvalue2;
    private String evtUnit;
    private Integer evtBigendian;
    private Integer evtIsstation;
    private int eId;

    public int getEvtId() {
        return evtId;
    }

    public void setEvtId(int evtId) {
        this.evtId = evtId;
    }

    public int getEvtVersion() {
        return evtVersion;
    }

    public void setEvtVersion(int evtVersion) {
        this.evtVersion = evtVersion;
    }

    public int getEvtType() {
        return evtType;
    }

    public void setEvtType(int evtType) {
        this.evtType = evtType;
    }

    public int getEvtByteOffset() {
        return evtByteOffset;
    }

    public void setEvtByteOffset(int evtByteOffset) {
        this.evtByteOffset = evtByteOffset;
    }

    public int getEvtLen() {
        return evtLen;
    }

    public void setEvtLen(int evtLen) {
        this.evtLen = evtLen;
    }

    public String getEvtSystem() {
        return evtSystem;
    }

    public void setEvtSystem(String evtSystem) {
        this.evtSystem = evtSystem;
    }

    public String getEvtNameL1() {
        return evtNameL1;
    }

    public void setEvtNameL1(String evtNameL1) {
        this.evtNameL1 = evtNameL1;
    }

    public String getEvtNameL2() {
        return evtNameL2;
    }

    public void setEvtNameL2(String evtNameL2) {
        this.evtNameL2 = evtNameL2;
    }

    public String getEvtNameL3() {
        return evtNameL3;
    }

    public void setEvtNameL3(String evtNameL3) {
        this.evtNameL3 = evtNameL3;
    }

    public Integer getEvtSign() {
        return evtSign;
    }

    public void setEvtSign(Integer evtSign) {
        this.evtSign = evtSign;
    }

    public String getEvtOp1() {
        return evtOp1;
    }

    public void setEvtOp1(String evtOp1) {
        this.evtOp1 = evtOp1;
    }

    public Double getEvtOpvalue1() {
        return evtOpvalue1;
    }

    public void setEvtOpvalue1(Double evtOpvalue1) {
        this.evtOpvalue1 = evtOpvalue1;
    }

    public String getEvtOp2() {
        return evtOp2;
    }

    public void setEvtOp2(String evtOp2) {
        this.evtOp2 = evtOp2;
    }

    public Double getEvtOpvalue2() {
        return evtOpvalue2;
    }

    public void setEvtOpvalue2(Double evtOpvalue2) {
        this.evtOpvalue2 = evtOpvalue2;
    }

    public String getEvtUnit() {
        return evtUnit;
    }

    public void setEvtUnit(String evtUnit) {
        this.evtUnit = evtUnit;
    }

    public Integer getEvtBigendian() {
        return evtBigendian;
    }

    public void setEvtBigendian(Integer evtBigendian) {
        this.evtBigendian = evtBigendian;
    }

    public Integer getEvtIsstation() {
        return evtIsstation;
    }

    public void setEvtIsstation(Integer evtIsstation) {
        this.evtIsstation = evtIsstation;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventCfgEntity that = (EventCfgEntity) o;

        if (evtId != that.evtId) return false;
        if (evtVersion != that.evtVersion) return false;
        if (evtType != that.evtType) return false;
        if (evtByteOffset != that.evtByteOffset) return false;
        if (evtLen != that.evtLen) return false;
        if (eId != that.eId) return false;
        if (evtSystem != null ? !evtSystem.equals(that.evtSystem) : that.evtSystem != null) return false;
        if (evtNameL1 != null ? !evtNameL1.equals(that.evtNameL1) : that.evtNameL1 != null) return false;
        if (evtNameL2 != null ? !evtNameL2.equals(that.evtNameL2) : that.evtNameL2 != null) return false;
        if (evtNameL3 != null ? !evtNameL3.equals(that.evtNameL3) : that.evtNameL3 != null) return false;
        if (evtSign != null ? !evtSign.equals(that.evtSign) : that.evtSign != null) return false;
        if (evtOp1 != null ? !evtOp1.equals(that.evtOp1) : that.evtOp1 != null) return false;
        if (evtOpvalue1 != null ? !evtOpvalue1.equals(that.evtOpvalue1) : that.evtOpvalue1 != null) return false;
        if (evtOp2 != null ? !evtOp2.equals(that.evtOp2) : that.evtOp2 != null) return false;
        if (evtOpvalue2 != null ? !evtOpvalue2.equals(that.evtOpvalue2) : that.evtOpvalue2 != null) return false;
        if (evtUnit != null ? !evtUnit.equals(that.evtUnit) : that.evtUnit != null) return false;
        if (evtBigendian != null ? !evtBigendian.equals(that.evtBigendian) : that.evtBigendian != null) return false;
        if (evtIsstation != null ? !evtIsstation.equals(that.evtIsstation) : that.evtIsstation != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = evtId;
        result = 31 * result + evtVersion;
        result = 31 * result + evtType;
        result = 31 * result + evtByteOffset;
        result = 31 * result + evtLen;
        result = 31 * result + (evtSystem != null ? evtSystem.hashCode() : 0);
        result = 31 * result + (evtNameL1 != null ? evtNameL1.hashCode() : 0);
        result = 31 * result + (evtNameL2 != null ? evtNameL2.hashCode() : 0);
        result = 31 * result + (evtNameL3 != null ? evtNameL3.hashCode() : 0);
        result = 31 * result + (evtSign != null ? evtSign.hashCode() : 0);
        result = 31 * result + (evtOp1 != null ? evtOp1.hashCode() : 0);
        result = 31 * result + (evtOpvalue1 != null ? evtOpvalue1.hashCode() : 0);
        result = 31 * result + (evtOp2 != null ? evtOp2.hashCode() : 0);
        result = 31 * result + (evtOpvalue2 != null ? evtOpvalue2.hashCode() : 0);
        result = 31 * result + (evtUnit != null ? evtUnit.hashCode() : 0);
        result = 31 * result + (evtBigendian != null ? evtBigendian.hashCode() : 0);
        result = 31 * result + (evtIsstation != null ? evtIsstation.hashCode() : 0);
        result = 31 * result + eId;
        return result;
    }
}
