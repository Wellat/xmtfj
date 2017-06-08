package com.wsu.hemi.xmtfj.entity;

import java.util.Date;

public class TransactionInfo {
    private Integer id;

    private String region;

    private Integer sellSum;

    private Float sellArea;

    private Integer totalSum;

    private Float totalArea;

    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region == null ? null : region.trim();
    }

    public Integer getSellSum() {
        return sellSum;
    }

    public void setSellSum(Integer sellSum) {
        this.sellSum = sellSum;
    }

    public Float getSellArea() {
        return sellArea;
    }

    public void setSellArea(Float sellArea) {
        this.sellArea = sellArea;
    }

    public Integer getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(Integer totalSum) {
        this.totalSum = totalSum;
    }

    public Float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(Float totalArea) {
        this.totalArea = totalArea;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}