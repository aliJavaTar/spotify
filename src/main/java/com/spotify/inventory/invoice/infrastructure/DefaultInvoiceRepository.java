package com.spotify.inventory.invoice.infrastructure;

import com.spotify.inventory.invoice.domin.Invoice;
import com.spotify.inventory.invoice.domin.InvoiceRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DefaultInvoiceRepository extends InvoiceRepository, JpaRepository<Invoice, Long> {
}
