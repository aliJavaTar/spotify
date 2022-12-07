package com.spotify.inventory.invoice.infrastructure;

import com.spotify.inventory.invoice.domin.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MySqlInvoiceRepository extends JpaRepository<Invoice, Long> {
}
