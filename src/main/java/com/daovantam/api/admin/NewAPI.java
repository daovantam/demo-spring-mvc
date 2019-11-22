package com.daovantam.api.admin;

import com.daovantam.dto.NewDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController(value = "newAPIOfAdmin")
public class NewAPI {

    @PostMapping("/api/new")
    public NewDTO createNew(@RequestBody NewDTO newDTO){
        return newDTO;
    }

    @PutMapping(value = "/api/new")
    public NewDTO updateNew(@RequestBody NewDTO newDTO){
        return newDTO;
    }

    @DeleteMapping(value = "/api/new")
    public void deleteNew(@RequestBody Long[] ids){
        System.out.println("ok");
    }
}
