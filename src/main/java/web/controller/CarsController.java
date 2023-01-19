package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;

@Controller
public class CarsController {
    private final CarService carService;
    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }
    @GetMapping("/cars")
    public String carsPage(Model model, @RequestParam (defaultValue  = "5") String count1) {
        model.addAttribute("allcars", carService.getAllCars(count1));
    return "cars";
    }
}
