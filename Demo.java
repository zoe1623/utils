package com.ijourney.market.third_app_update;

public class Demo {
    private Demo() {
    }

    private static class KingInstance{
        private static final Demo KINGINSTANCE = new Demo();
    }

    public static Demo getInstance(){
        return KingInstance.KINGINSTANCE;
    }
}
