package com.myapplicationdev.android.tw_listview;

/**
 * Created by 15017359 on 27/4/2017.
 */

public class Module {

    private String name;
    private boolean logo;
    public Module(String name, boolean logo) {
        this.name = name;
        this.logo = logo;
    }
    public String getName() {
        return name;
    }
    public boolean isLogo() {
        return logo;
    }

}
