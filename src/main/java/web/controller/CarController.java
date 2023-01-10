package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value ="/cars")
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        List<String> messages = new ArrayList<>();
        CarService carService = new CarServiceImp();
        model.addAttribute("cars", carService.severalCars(count));
        return "cars";
    }
}

