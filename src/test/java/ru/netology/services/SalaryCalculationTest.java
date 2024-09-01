package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class SalaryCalculationTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/DataTest.txt")
    void OneSalaryCalculation(int income, int expenses, int threshold, int expected) {
        SalaryCalculation service = new SalaryCalculation();


        // вызываем целевой метод:
        int actual = service.calculate(income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }


}
