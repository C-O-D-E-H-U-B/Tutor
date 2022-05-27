package com.codehub.tutor.core.model;

import javax.persistence.*;

@Entity
@Table(name= "advertisements")
public class Advertisement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long adId;

    @Column(name = "content")
    private String content;

    @Column(name = "fromDate")
    private String fromDate;

    @Column(name = "toDate")
    private String toDate;

    @Column(name = "type")
    private int type;

    @Column(name = "status")
    private int status;

    public long getAdId() {
        return adId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFrom() {
        return fromDate;
    }

    public void setFrom(String from) {
        this.fromDate = from;
    }

    public String getTo() {
        return toDate;
    }

    public void setTo(String to) {
        this.toDate = to;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
