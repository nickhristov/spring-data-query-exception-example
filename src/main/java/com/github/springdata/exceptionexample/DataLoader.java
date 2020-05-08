package com.github.springdata.exceptionexample;

import com.github.springdata.exceptionexample.model.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    private OrderRepository repository;

    @Override
    public void run(ApplicationArguments args) {

        List<UUID> ids = new ArrayList<>();
        ids.add(UUID.randomUUID());
        ids.add(UUID.randomUUID());

        for(int i = 0; i < 1000; i++) {
            repository.findByOrderIdIn(ids).thenAccept(list->{});
        }

        for(int i = 0; i < 1000; i++) {
            repository.findByCustomerId(100L).thenAccept(list->{});
        }
    }
}
