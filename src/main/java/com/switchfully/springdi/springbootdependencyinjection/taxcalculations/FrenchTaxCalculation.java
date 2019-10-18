package com.switchfully.springdi.springbootdependencyinjection.taxcalculations;

import org.springframework.stereotype.Component;

@Component
public class FrenchTaxCalculation implements TaxCalculation {

    private static final double TAX_RATE = 0.48;

    @Override
    public double calculateTaxBasedYearlyIncomeInEuro(double yearlyIncome) {
        return yearlyIncome * TAX_RATE;
    }
}
