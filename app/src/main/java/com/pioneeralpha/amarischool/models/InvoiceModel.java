package com.pioneeralpha.amarischool.models;

public class InvoiceModel {
    private String invoiceTitle,invoiceTaka,invoiceImg;

    public InvoiceModel(String invoiceTitle, String invoiceTaka, String invoiceImg) {
        this.invoiceTitle = invoiceTitle;
        this.invoiceTaka = invoiceTaka;
        this.invoiceImg = invoiceImg;
    }

    public String getInvoiceTitle() {
        return invoiceTitle;
    }

    public void setInvoiceTitle(String invoiceTitle) {
        this.invoiceTitle = invoiceTitle;
    }

    public String getInvoiceTaka() {
        return invoiceTaka;
    }

    public void setInvoiceTaka(String invoiceTaka) {
        this.invoiceTaka = invoiceTaka;
    }

    public String getInvoiceImg() {
        return invoiceImg;
    }

    public void setInvoiceImg(String invoiceImg) {
        this.invoiceImg = invoiceImg;
    }
}
