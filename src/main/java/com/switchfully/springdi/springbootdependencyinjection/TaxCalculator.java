package com.switchfully.springdi.springbootdependencyinjection;

import com.switchfully.springdi.springbootdependencyinjection.taxcalculations.TaxCalculation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class TaxCalculator {

    private final TaxCalculation taxCalculation;

    @Autowired
    public TaxCalculator(@Qualifier("americanTaxCalculation") TaxCalculation taxCalculation) {
        this.taxCalculation = taxCalculation;
    }

    public double calculateTaxBasedYearlyIncomeInEuro(double incomeInEuro) {
        return taxCalculation.calculateTaxBasedYearlyIncomeInEuro(incomeInEuro);
    }

}
