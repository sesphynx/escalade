package org.nioun.essentials.rentservice.controller;

import org.nioun.essentials.rentautomodel.rent.Rent;
import org.nioun.essentials.rentservice.model.Response;
import org.nioun.essentials.rentservice.model.SimpleResponse;
import org.nioun.essentials.rentservice.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Mamadou Kebe
 * mutulay@nioun.org
 * www.nioun.com
 * @Project rentautomodel
 */
@RestController
@RequestMapping("/services/rents")
public class RentController {


    @Autowired
    RentService rentService;

    @PostMapping
    public Rent save(@RequestBody Rent rent) {
        return rentService.save(rent);
    }

    @GetMapping(value = "/{id}")
    public Response getRent(@PathVariable int id, @RequestParam(required = false) String type) {

        if(type==null){
            return  new SimpleResponse(rentService.findById(id));
        }else{
         return    rentService.findDetailResponse(id);
        }



    }

    @GetMapping
    public List<Rent> getAllRents() {
        return rentService.findAll();
    }


}
