package com.spotify.inventory.invoice.domin;

import java.util.Optional;

public interface InvoiceRepository {
    Optional<Invoice> save(Invoice invoice);
}
