package com.spotify.inventory.invoice.presentation;

import com.spotify.inventory.invoice.domin.Invoice;
import com.spotify.inventory.invoice.service.InvoiceService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {
    private final InvoiceService invoiceService;

    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @PostMapping("api-v1-invoce")
    public ResponseEntity<Invoice> save(@RequestBody @Valid Invoice invoice) {
        return new ResponseEntity<>(invoiceService.save(invoice), HttpStatus.CREATED);
    }
}
