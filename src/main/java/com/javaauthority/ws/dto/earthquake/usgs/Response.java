package com.javaauthority.ws.dto.earthquake.usgs;

import java.util.List;

/**
 * Created by mxk on 8/14/2015.
 */
public class Response {
    private String type;
    private List<Float> bbox;
    private List<Features> features;
    private Metadata metadata;


}
