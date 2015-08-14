package com.javaauthority.ws;

import org.junit.Test;

/**
 * Created by mxk on 8/14/2015.
 */
public class SenderTest {

    @Test
    public void test() throws Exception {
        Sender.executeGet(ApiUrl.EarthQuakeUsgsGov.getBaseUrl() + "?format=geojson&alertlevel=green");

    }
}
