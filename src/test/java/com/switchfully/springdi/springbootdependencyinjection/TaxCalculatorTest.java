package com.switchfully.springdi.springbootdependencyinjection;

import com.switchfully.springdi.springbootdependencyinjection.taxcalculations.BelgianTaxCalculation;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TaxCalculatorTest {

    private BelgianTaxCalculation belgianTaxCalculationMock;
    private TaxCalculator taxCalculator;

    @BeforeEach
    void initialize() {
        belgianTaxCalculationMock = Mockito.mock(BelgianTaxCalculation.class);
        taxCalculator = new TaxCalculator(belgianTaxCalculationMock);
    }

    //mocking
    @Test
    void givenTaxCalculatorWithBelgianTaxCalculation_whenCalculateTax_thenCalculateTheBelgianTax() {
        //given
        final int yearlyIncome = 25000;

        //when
        taxCalculator.calculateTaxBasedYearlyIncomeInEuro(yearlyIncome);
        //then
        Mockito.verify(belgianTaxCalculationMock).calculateTaxBasedYearlyIncomeInEuro(yearlyIncome);
    }

    //stubbing
    @Test
    void givenTaxCalculatorWithBelgianTaxCalculation_whenCalculateTax_thenReturn42() {
        //given
        final int yearlyIncome = 25000;
        double expectedResult = 42.0;

        //when
        Mockito.when(taxCalculator.calculateTaxBasedYearlyIncomeInEuro(yearlyIncome)).thenReturn(expectedResult);

        //then
        Assertions.assertEquals(expectedResult, taxCalculator.calculateTaxBasedYearlyIncomeInEuro(yearlyIncome));
    }
}