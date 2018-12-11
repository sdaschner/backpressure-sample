package com.sebastian_daschner.ft_reproducer;

import com.airhacks.porcupine.execution.boundary.Dedicated;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.ExecutorService;

@Path("test")
public class TestResource {

    @Inject
    TestBean testBean;

    @Inject
    @Dedicated("test1")
    ExecutorService executorService1;

    @Inject
    @Dedicated("test2")
    ExecutorService executorService2;

    @GET
    @Path("1")
    public CompletionStage<String> test1() {
        return CompletableFuture.supplyAsync(() -> testBean.someString(), executorService1);
    }

    @GET
    @Path("2")
    public CompletionStage<String> test2() {
        return CompletableFuture.supplyAsync(() -> testBean.anotherString(), executorService2);
    }

}
