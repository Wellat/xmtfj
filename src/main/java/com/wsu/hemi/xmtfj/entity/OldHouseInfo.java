package com.wsu.hemi.xmtfj.entity;

import java.util.Date;

/**
 * 二手房成交数据
 */
public class OldHouseInfo {

    private Integer id;

    private Float houseRate;

    private Integer sellNum;

    private Integer todaySellNum;

    private Float sellArea;

    private Float todaySellArea;

    private Date date;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getHouseRate() {
        return houseRate;
    }

    public void setHouseRate(Float houseRate) {
        this.houseRate = houseRate;
    }

    public Integer getSellNum() {
        return sellNum;
    }

    public void setSellNum(Integer sellNum) {
        this.sellNum = sellNum;
    }

    public Integer getTodaySellNum() {
        return todaySellNum;
    }

    public void setTodaySellNum(Integer todaySellNum) {
        this.todaySellNum = todaySellNum;
    }

    public Float getSellArea() {
        return sellArea;
    }

    public void setSellArea(Float sellArea) {
        this.sellArea = sellArea;
    }

    public Float getTodaySellArea() {
        return todaySellArea;
    }

    public void setTodaySellArea(Float todaySellArea) {
        this.todaySellArea = todaySellArea;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "OldHouseInfo{" +
                "id=" + id +
                ", houseRate=" + houseRate +
                ", sellNum=" + sellNum +
                ", todaySellNum=" + todaySellNum +
                ", sellArea=" + sellArea +
                ", todaySellArea=" + todaySellArea +
                ", date=" + date +
                '}';
    }
}