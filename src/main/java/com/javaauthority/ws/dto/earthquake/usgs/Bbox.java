package com.javaauthority.ws.dto.earthquake.usgs;

import java.util.Arrays;

/**
 * Created by mxk on 8/14/2015.
 */
public class Bbox {
    private String[] coords;

    @Override
    public String toString() {
        return "Bbox{" +
                "coords=" + Arrays.toString(coords) +
                '}';
    }
}
