package com.kodlamaio.commonpackage.events.invoice;

import com.kodlamaio.commonpackage.events.Event;
import com.kodlamaio.commonpackage.utils.dto.CreateInvoiceRequest;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class InvoiceCreatedEvent implements Event {
    private CreateInvoiceRequest invoiceRequest;
}
