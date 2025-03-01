package eci.arsw.parcial.producto.controller;

import eci.arsw.parcial.producto.model.Product;
import eci.arsw.parcial.producto.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/productos")
class ProductController {

    @Autowired
    private ProductService productService;
    @GetMapping
    public List<Product> getProducts() {
        return productService.getAllProducts();
    }
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        return productService.addProduct(product.getNombre(), product.getPrecio());
    }
}
