package com.workintech.tax;

import org.springframework.stereotype.Component;
@Component
public class DeveloperTax implements Taxable{
    @Override
    public double getSimpleTaxRate(){
        return 15d;
    }
    @Override
    public double getMiddleTaxRate(){
        return 25d;
    }
    @Override
    public double getUpperTaxRate(){
        return 35d;
    }

}