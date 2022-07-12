package web.service;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarServiceImpl implements CarService {
    @Override
    public List<Car> list(Integer count) {

        List<Car> list = new ArrayList<>();
        list.add(new Car("Mercedes", "black", 1990));
        list.add(new Car("Bmv", "white", 2000));
        list.add(new Car("Mazda", "yellow", 2010));
        list.add(new Car("Lada", "blue", 2020));
        list.add(new Car("Uaz", "green", 2022));

        return list.stream().limit(count).collect(Collectors.toList());
    }
}
