package org.crazyit.app.domain;

import java.sql.Timestamp;

/**
 * Created by 010200022422 on 2017/7/28.
 */
public class FaultEntity {
    private long id;
    private Integer faultVersion;
    private String faultVehicle;
    private String faultId;
    private Timestamp faultTimeAppear;
    private Timestamp faultTimeDisappear;
    private Integer faultState;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getFaultVersion() {
        return faultVersion;
    }

    public void setFaultVersion(Integer faultVersion) {
        this.faultVersion = faultVersion;
    }

    public String getFaultVehicle() {
        return faultVehicle;
    }

    public void setFaultVehicle(String faultVehicle) {
        this.faultVehicle = faultVehicle;
    }

    public String getFaultId() {
        return faultId;
    }

    public void setFaultId(String faultId) {
        this.faultId = faultId;
    }

    public Timestamp getFaultTimeAppear() {
        return faultTimeAppear;
    }

    public void setFaultTimeAppear(Timestamp faultTimeAppear) {
        this.faultTimeAppear = faultTimeAppear;
    }

    public Timestamp getFaultTimeDisappear() {
        return faultTimeDisappear;
    }

    public void setFaultTimeDisappear(Timestamp faultTimeDisappear) {
        this.faultTimeDisappear = faultTimeDisappear;
    }

    public Integer getFaultState() {
        return faultState;
    }

    public void setFaultState(Integer faultState) {
        this.faultState = faultState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FaultEntity that = (FaultEntity) o;

        if (id != that.id) return false;
        if (faultVersion != null ? !faultVersion.equals(that.faultVersion) : that.faultVersion != null) return false;
        if (faultVehicle != null ? !faultVehicle.equals(that.faultVehicle) : that.faultVehicle != null) return false;
        if (faultId != null ? !faultId.equals(that.faultId) : that.faultId != null) return false;
        if (faultTimeAppear != null ? !faultTimeAppear.equals(that.faultTimeAppear) : that.faultTimeAppear != null)
            return false;
        if (faultTimeDisappear != null ? !faultTimeDisappear.equals(that.faultTimeDisappear) : that.faultTimeDisappear != null)
            return false;
        if (faultState != null ? !faultState.equals(that.faultState) : that.faultState != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (faultVersion != null ? faultVersion.hashCode() : 0);
        result = 31 * result + (faultVehicle != null ? faultVehicle.hashCode() : 0);
        result = 31 * result + (faultId != null ? faultId.hashCode() : 0);
        result = 31 * result + (faultTimeAppear != null ? faultTimeAppear.hashCode() : 0);
        result = 31 * result + (faultTimeDisappear != null ? faultTimeDisappear.hashCode() : 0);
        result = 31 * result + (faultState != null ? faultState.hashCode() : 0);
        return result;
    }
}
