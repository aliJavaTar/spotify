package com.spotify.inventory.invoice.service;

import com.spotify.inventory.invoice.domin.Invoice;

public interface InvoiceService {
    Invoice save(Invoice invoice);
}
