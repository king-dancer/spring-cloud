package com.spring.feign.dto;

public class UserInfo {
    private String name;
    private String age;
    private String certId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCertId() {
        return certId;
    }

    public void setCertId(String certId) {
        this.certId = certId;
    }

    public UserInfo(String name, String age, String certId) {
        this.name = name;
        this.age = age;
        this.certId = certId;
    }

    public UserInfo() {
    }
}
