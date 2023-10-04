package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

@Controller
public class CarsController {
    @Autowired
    private CarService carService;
    @GetMapping("/cars")
    public String carsPage(@RequestParam(value = "count", required = false) Integer count, Model model) {
        model.addAttribute("cars", carService.listCars(count));
        return "cars";
    }
}
