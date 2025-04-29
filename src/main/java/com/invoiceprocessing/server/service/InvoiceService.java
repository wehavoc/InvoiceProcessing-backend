package com.invoiceprocessing.server.service;

import com.invoiceprocessing.server.model.Invoice;

import java.util.List;

public interface InvoiceService {

    public Invoice addInvoice(Invoice invoice);

    public List<Invoice> getInvoices();

    Invoice deleteInvoice(Long id);
}
