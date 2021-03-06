package com.example.demo.controller;

import com.example.demo.to.Vehicle;
import com.example.demo.vehicle.IVehicle;
import com.example.demo.vehicle.VehicleEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class VehicleController {

    @RequestMapping(value = "/vehicle/{id}", method = RequestMethod.GET)
    public Vehicle getVehicleDetails(@PathVariable Integer id) {
        IVehicle vehicle = new VehicleEntity();
        return vehicle.getVehicleDetails(id);
    }

}
