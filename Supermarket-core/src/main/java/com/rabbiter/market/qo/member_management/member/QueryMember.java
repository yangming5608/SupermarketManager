package com.rabbiter.market.qo.member_management.member;

import com.rabbiter.market.qo.BaseQuery;

public class QueryMember extends BaseQuery {
    private String phone;
    private String state;
    private String name;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
