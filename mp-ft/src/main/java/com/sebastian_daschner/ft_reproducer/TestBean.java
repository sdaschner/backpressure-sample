package com.sebastian_daschner.ft_reproducer;

import org.eclipse.microprofile.faulttolerance.Asynchronous;
import org.eclipse.microprofile.faulttolerance.Bulkhead;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

public class TestBean {

    @Asynchronous
    @Bulkhead(value = 4, waitingTaskQueue = 4)
    public CompletionStage<String> someString() {
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return CompletableFuture.completedFuture("Hello");
    }

    @Asynchronous
    @Bulkhead(value = 4, waitingTaskQueue = 4)
    public CompletionStage<String> anotherString() {
        try {
            Thread.sleep(400);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return CompletableFuture.completedFuture("World");
    }

}
