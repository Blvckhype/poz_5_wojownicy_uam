package pl.edu.amu.wojownicy.braincode19.courier;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/courier")
public class CourierController {

    @GetMapping("")
    void invokePackage() {

    }
}
