package com.cyngofokglobal.bookshop_webapp.clients.catalog;

import com.cyngofokglobal.catalogservice.sivalabs.bookshop.catalog.domain.PagedResult;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

public interface CatalogServiceClient {

    @GetExchange("/catalog/api/products")
    PagedResult<Product> getProducts(@RequestParam int page);
    @GetExchange
    ResponseEntity<Product> getProductByCode(@PathVariable String code);
}
