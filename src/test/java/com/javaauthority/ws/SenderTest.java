package com.javaauthority.ws;

import com.google.gson.Gson;
import com.javaauthority.ws.dto.earthquake.usgs.Response;
import org.junit.Test;

/**
 * Created by mxk on 8/14/2015.
 */
public class SenderTest {

    @Test
    public void test() throws Exception {
        String response = Sender.executeGet(ApiUrl.EarthQuakeUsgsGov.getBaseUrl() + "?format=geojson&alertlevel=green");
        Gson gson = new Gson();
        Response responseClass = gson.fromJson(response, Response.class);
        System.out.println(responseClass);
    }
}
