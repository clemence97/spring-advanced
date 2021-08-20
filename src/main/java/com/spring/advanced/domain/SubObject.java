package com.spring.advanced.domain;

import org.springframework.stereotype.Component;

@Component
public class SubObject extends ParentObject {
    private String att2;
    public SubObject() {}

    public String getAtt2() {
        return att2;
    }

    public void setAtt2(String att2) {
        this.att2 = att2;
    }

}
