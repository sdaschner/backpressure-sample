package com.sebastian_daschner.ft_reproducer;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.concurrent.CompletionStage;

@Path("test")
public class TestResource {

    @Inject
    TestBean testBean;

    @GET
    @Path("1")
    public CompletionStage<String> test1() {
        return testBean.someString();
    }

    @GET
    @Path("2")
    public CompletionStage<String> test2() {
        return testBean.anotherString();
    }

}
