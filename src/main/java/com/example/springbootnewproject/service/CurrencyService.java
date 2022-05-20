package com.example.springbootnewproject.service;

import com.example.springbootnewproject.model.Currency;
import com.example.springbootnewproject.repository.CurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class CurrencyService {

    @Autowired
    CurrencyRepository repository;

    public String add(Currency currency){
        repository.save(currency);
        return "currency added to db";

    }

    public List<Currency> getAll(){
        return repository.findAll();
    }


    public String update(@RequestParam String name,@RequestParam Integer id){
        Currency currency=repository.getById(id);
        currency.setName("USD");
        repository.save(currency);
        return "currency updated in db";
    }

    public String delete(@PathVariable Integer id){
repository.deleteById(id);
return "currency deleted in db";
    }
}
