package com.javaauthority.ws;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

/**
 * Created by mxk on 8/14/2015.
 */
public class Sender {
    private static final String DEFAULT_ENCODING = "UTF-8";
    private static HttpClient httpClient = HttpClientBuilder.create().build();
    private static HttpPost post;
    private static HttpGet get;

    public static void executePost(final String url) throws Exception {

        post = new HttpPost(url);

    }

    public static String executeGet(final String url) throws Exception {
        get = new HttpGet(url);
        HttpResponse response = httpClient.execute(get);
        return EntityUtils.toString(response.getEntity());
    }
}
