package com.exerciseThreePointOneTwo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InvoiceTest {
    Invoice invoice;

    @BeforeEach
    void setUp() {
        invoice = new Invoice("number 1","50 bags",30,5.00);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void PartNumberForInvoiceCanBeSet(){
        invoice.setPartNumber("number 1");
        assertEquals("number 1",invoice.getPartNumber());
    }

    @Test
    void PartDescriptionForInvoiceCanBeSet(){
        invoice.setPartDescription("50 bags");
        assertEquals("50 bags", invoice.getPartDescription());
    }

    @Test
    void ItemQuantityForInvoiceCanBeSet(){
        invoice.setItemQuantity(30);
        assertEquals(30, invoice.getItemQuantity());
    }

    @Test
    void PricePerItemCanBeSet(){
        invoice.setPricePerItem(5.00);
        assertEquals(5.00,invoice.getPricePerItem());
    }

    @Test
    void InvoiceAmountCanBeGotten(){
        invoice.getInvoiceAmount(-1,5.00);
        assertEquals(0.00,invoice.getInvoiceAmount(0,0));
    }
}