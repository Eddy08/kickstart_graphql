package com.harsh.graphql.subscription;

import java.time.Duration;
import java.util.Random;

import org.springframework.stereotype.Component;

import graphql.kickstart.tools.GraphQLSubscriptionResolver;
import reactor.core.publisher.Flux;
@Component
public class subscriptionresolver implements GraphQLSubscriptionResolver{
    public Flux<String> stockPrice(String name){
        return Flux.interval(Duration.ofSeconds(10)).map(num ->name+  " Stock Price is "+ new Random().nextInt(1000));
    }
    
}
