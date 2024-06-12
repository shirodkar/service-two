package com.shirodkar.servicemeshdemo.entity;

import java.util.Date;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;

@Entity
public class RequestLog extends PanacheEntity {

    public String requestValue;

    public String responseValue;

    public Date timestamp;
}
