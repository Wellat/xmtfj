package com.wsu.hemi.xmtfj.entity;

import java.util.Date;

/**
 * 全市楼盘信息
 */
public class HouseInfo {

    private Integer id;

    private Date date;

    private Integer onSellNum;

    private Integer allNum;

    private Integer canSellNum;

    private Long allArea;

    private Long canSellArea;

    private Integer isSellNum;

    private Long isSellArea;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getOnSellNum() {
        return onSellNum;
    }

    public void setOnSellNum(Integer onSellNum) {
        this.onSellNum = onSellNum;
    }

    public Integer getAllNum() {
        return allNum;
    }

    public void setAllNum(Integer allNum) {
        this.allNum = allNum;
    }

    public Integer getCanSellNum() {
        return canSellNum;
    }

    public void setCanSellNum(Integer canSellNum) {
        this.canSellNum = canSellNum;
    }

    public Long getAllArea() {
        return allArea;
    }

    public void setAllArea(Long allArea) {
        this.allArea = allArea;
    }

    public Long getCanSellArea() {
        return canSellArea;
    }

    public void setCanSellArea(Long canSellArea) {
        this.canSellArea = canSellArea;
    }

    public Integer getIsSellNum() {
        return isSellNum;
    }

    public void setIsSellNum(Integer isSellNum) {
        this.isSellNum = isSellNum;
    }

    public Long getIsSellArea() {
        return isSellArea;
    }

    public void setIsSellArea(Long isSellArea) {
        this.isSellArea = isSellArea;
    }

    @Override
    public String toString() {
        return "HouseInfo{" +
                "id=" + id +
                ", date=" + date +
                ", onSellNum=" + onSellNum +
                ", allNum=" + allNum +
                ", canSellNum=" + canSellNum +
                ", allArea=" + allArea +
                ", canSellArea=" + canSellArea +
                ", isSellNum=" + isSellNum +
                ", isSellArea=" + isSellArea +
                '}';
    }
}