package com.example.nextapp;


import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;

public class items implements Serializable {
   private String tvdesc;
   private String ivPref;

    public items() {
    }

    public items(String tvdesc, String ivPref) {
        this.tvdesc = tvdesc;
        this.ivPref = ivPref;
    }

    public String getTvdesc() {
        return tvdesc;
    }

    public void setTvdesc(String tvdesc) {
        this.tvdesc = tvdesc;
    }

    public String getIvPref() {
        return ivPref;
    }

    public void setIvPref(String ivPref) {
        this.ivPref = ivPref;
    }
}
