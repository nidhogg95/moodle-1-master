package com.example.ks.moodle.Bean;

public class EventBean {

    private Integer id; //  自生成id
    private String event_id; //  事件id...必填
    private String event_name; //  事件名称...
    private long time_stamp; //  时间戳...必填
    private String devices_model; //  设备型号...必填
    private String system_version; //  系统版本...必填

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEvent_id() {
        return event_id;
    }

    public void setEvent_id(String event_id) {
        this.event_id = event_id;
    }

    public String getEvent_name() {
        return event_name;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public long getTime_stamp() {
        return time_stamp;
    }

    public void setTime_stamp(long time_stamp) {
        this.time_stamp = time_stamp;
    }

    public String getDevices_model() {
        return devices_model;
    }

    public void setDevices_model(String devices_model) {
        this.devices_model = devices_model;
    }

    public String getSystem_version() {
        return system_version;
    }

    public void setSystem_version(String system_version) {
        this.system_version = system_version;
    }
}
