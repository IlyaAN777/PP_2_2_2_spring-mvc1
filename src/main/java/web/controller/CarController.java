package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarServiceImpl csim;

    public CarController(CarServiceImpl csim) {
        this.csim = csim;
    }

    @GetMapping()
    public String AllCars(@RequestParam(defaultValue = "5") Integer count, Model model) {
        List<Car> list1 = csim.list(count);
        model.addAttribute("cars", list1);
        return "cars";
    }

}
