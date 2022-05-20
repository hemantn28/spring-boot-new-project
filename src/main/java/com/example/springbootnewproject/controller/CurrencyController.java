package com.example.springbootnewproject.controller;

import com.example.springbootnewproject.model.Currency;
import com.example.springbootnewproject.service.CurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CurrencyController {

    @Autowired
    CurrencyService service;

    @RequestMapping(value = "add_currency_db", method = RequestMethod.POST)
    public String add(@RequestBody Currency currency){
        return service.add(currency);
    }

    @RequestMapping(value = "get_currency_db", method = RequestMethod.GET)
    public List<Currency> getAll(){
        return service.getAll();
    }

    @RequestMapping(value = "currency updated_db", method = RequestMethod.PUT)
    public String update(@RequestParam String name,@RequestParam Integer id){
        service.update("USD",2);
        return "currency updated in db";
    }

    @RequestMapping(value = "delete_currency_db/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id){
        service.delete(6);
        return "currency deleted in db";

    }
}
