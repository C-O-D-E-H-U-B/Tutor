package com.codehub.tutor.core.modal;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;

@Entity
@Table(name= "advertisements")
public class Advertisements {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long adId;

    @Column(name = "content")
    private String content;

    @Column(name = "from")
    private DateTimeFormat from;

    @Column(name = "to")
    private DateTimeFormat to;

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

    public DateTimeFormat getFrom() {
        return from;
    }

    public void setFrom(DateTimeFormat from) {
        this.from = from;
    }

    public DateTimeFormat getTo() {
        return to;
    }

    public void setTo(DateTimeFormat to) {
        this.to = to;
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
