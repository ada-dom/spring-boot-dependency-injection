package com.switchfully.springdi.springbootdependencyinjection.taxcalculations;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AmericanTaxCalculation implements TaxCalculation {

    private static final double TAX_RATE = 0.18;
    private static final int LUMP_SUM = 950;

    @Override
    public double calculateTaxBasedYearlyIncomeInEuro(double yearlyIncome) {
        return yearlyIncome * TAX_RATE + LUMP_SUM;
    }
}
