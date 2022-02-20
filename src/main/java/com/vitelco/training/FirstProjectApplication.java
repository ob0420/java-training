package com.vitelco.training;

import com.vitelco.training.model.Customer;
import com.vitelco.training.model.Order;
import com.vitelco.training.model.OrderItem;
import com.vitelco.training.model.Sample;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Slf4j
@SpringBootApplication
public class FirstProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstProjectApplication.class, args);

        /*Sample sample = new Sample("abc", "905545567867");
        System.out.println(sample); */
        Customer customer = new Customer(1, "Olya", "Babakulyyeva");


        OrderItem itm1 = new OrderItem(1, "iphone", 1, 15000);
        OrderItem itm2 = new OrderItem(2, "samsung", 2, 8000);

        Set items = new HashSet();
        items.add(itm1);
        items.add(itm2);

        Order order = new Order(1, customer, items);

        log.info("musteri: {} - siparis: {}", customer, order);


    }
}
