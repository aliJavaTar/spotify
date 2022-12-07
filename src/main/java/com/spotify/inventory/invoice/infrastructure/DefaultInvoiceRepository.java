package com.spotify.inventory.invoice.infrastructure;

import com.spotify.inventory.invoice.domin.Invoice;
import com.spotify.inventory.invoice.domin.InvoiceRepository;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DefaultInvoiceRepository implements InvoiceRepository {
    private final MySqlInvoiceRepository invoiceRepository;

    public DefaultInvoiceRepository(MySqlInvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    @Override
    public Optional<Invoice> save(Invoice invoice) {
        return Optional.of(invoiceRepository.save(invoice));
    }
}
