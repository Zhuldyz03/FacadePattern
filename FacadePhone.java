package com.company;

public class FacadePhone {
    private IPhone iPhone;
    private Huawei huawei;
    private Samsung samsung;

    public FacadePhone() {
        iPhone = new IPhone();
        huawei = new Huawei();
        samsung = new Samsung();
    }

    public String buildApplePhone() {
        return iPhone.build();
    }

    public String buildMicrosoftPhone() {
        return huawei.build();
    }

    public String buildAndroidPhone() {
        return samsung.build();
    }
}
