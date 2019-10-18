package com.switchfully.springdi.springbootdependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootDependencyInjectionApplication implements CommandLineRunner {

    private final TaxCalculator taxCalculator;

    @Autowired
    public SpringBootDependencyInjectionApplication(TaxCalculator taxCalculator) {
        this.taxCalculator = taxCalculator;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDependencyInjectionApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(taxCalculator.calculateTaxBasedYearlyIncomeInEuro(23000) + "€");
    }
}
