package org.crazyit.app.domain;

import java.sql.Timestamp;

/**
 * Created by 010200022422 on 2017/7/24.
 */
public class EventEntity {
    private long id;
    private int eventVesion;
    private String eventVehicle;
    private Timestamp eventTime;
    private String eventDigital;
    private String eventAnalog;
    private Double eventLatitude;
    private Double eventLongitude;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getEventVesion() {
        return eventVesion;
    }

    public void setEventVesion(int eventVesion) {
        this.eventVesion = eventVesion;
    }

    public String getEventVehicle() {
        return eventVehicle;
    }

    public void setEventVehicle(String eventVehicle) {
        this.eventVehicle = eventVehicle;
    }

    public Timestamp getEventTime() {
        return eventTime;
    }

    public void setEventTime(Timestamp eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventDigital() {
        return eventDigital;
    }

    public void setEventDigital(String eventDigital) {
        this.eventDigital = eventDigital;
    }

    public String getEventAnalog() {
        return eventAnalog;
    }

    public void setEventAnalog(String eventAnalog) {
        this.eventAnalog = eventAnalog;
    }

    public Double getEventLatitude() {
        return eventLatitude;
    }

    public void setEventLatitude(Double eventLatitude) {
        this.eventLatitude = eventLatitude;
    }

    public Double getEventLongitude() {
        return eventLongitude;
    }

    public void setEventLongitude(Double eventLongitude) {
        this.eventLongitude = eventLongitude;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        EventEntity that = (EventEntity) o;

        if (id != that.id) return false;
        if (eventVesion != that.eventVesion) return false;
        if (eventVehicle != null ? !eventVehicle.equals(that.eventVehicle) : that.eventVehicle != null) return false;
        if (eventTime != null ? !eventTime.equals(that.eventTime) : that.eventTime != null) return false;
        if (eventDigital != null ? !eventDigital.equals(that.eventDigital) : that.eventDigital != null) return false;
        if (eventAnalog != null ? !eventAnalog.equals(that.eventAnalog) : that.eventAnalog != null) return false;
        if (eventLatitude != null ? !eventLatitude.equals(that.eventLatitude) : that.eventLatitude != null)
            return false;
        if (eventLongitude != null ? !eventLongitude.equals(that.eventLongitude) : that.eventLongitude != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + eventVesion;
        result = 31 * result + (eventVehicle != null ? eventVehicle.hashCode() : 0);
        result = 31 * result + (eventTime != null ? eventTime.hashCode() : 0);
        result = 31 * result + (eventDigital != null ? eventDigital.hashCode() : 0);
        result = 31 * result + (eventAnalog != null ? eventAnalog.hashCode() : 0);
        result = 31 * result + (eventLatitude != null ? eventLatitude.hashCode() : 0);
        result = 31 * result + (eventLongitude != null ? eventLongitude.hashCode() : 0);
        return result;
    }
}
