package com.javaauthority.ws;

/**
 * Created by mxk on 8/14/2015.
 */
public enum ApiUrl {
    EarthQuakeUsgsGov {
        @Override
        public String getBaseUrl() {
            return "http://earthquake.usgs.gov/fdsnws/event/1/query";
        }
    };

    public abstract String getBaseUrl();
}
