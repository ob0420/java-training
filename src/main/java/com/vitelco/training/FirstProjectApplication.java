package com.vitelco.training;

import com.vitelco.training.model.Point;
import com.vitelco.training.model.Ractangle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.awt.*;

@SpringBootApplication
public class FirstProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(FirstProjectApplication.class, args);

        Ractangle rectangle = new Ractangle();

        Point point1 = new Point();
        point1.x = 10;
        point1.y = 10;

        Point point2 = new Point();
        point2.x = 10;
        point2.y = 40;

        Point point3 = new Point();
        point3.x = 50;
        point3.y = 50;

        Point point4 = new Point();
        point4.x = 110;
        point4.y = 120;

        rectangle.pointA = point1;
        rectangle.pointB = point2;
        rectangle.pointC = point3;
        rectangle.pointD = point4;

        System.out.println(rectangle);
        //variable declaration
        Point point; //instance of Point class, Class is object
        String name;

        //variable allocation
        point = new Point();
        point.x = 10;
        point.y = 5;
        name = "Olya";

    }

}
