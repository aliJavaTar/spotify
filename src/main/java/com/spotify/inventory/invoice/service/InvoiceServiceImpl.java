package com.spotify.inventory.invoice.service;

import com.spotify.inventory.invoice.domin.Invoice;
import com.spotify.inventory.invoice.infrastructure.DefaultInvoiceRepository;

public class InvoiceServiceImpl implements InvoiceService {
    private final DefaultInvoiceRepository invoiceRepository;

    public InvoiceServiceImpl(DefaultInvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public Invoice save(Invoice invoice) {
        return invoiceRepository.save(invoice)
                .orElseThrow(() -> new RuntimeException("can create!"));
    }
}
