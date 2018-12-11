package com.sebastian_daschner.ft_reproducer;

import com.airhacks.porcupine.configuration.control.ExecutorConfigurator;
import com.airhacks.porcupine.execution.control.ExecutorConfiguration;

import javax.enterprise.inject.Specializes;

@Specializes
public class CustomExecutorConfigurator extends ExecutorConfigurator {

    @Override
    public ExecutorConfiguration forPipeline(String name) {
        return new ExecutorConfiguration.Builder()
                .abortPolicy()
                .queueCapacity(4)
                .build();
    }

}
