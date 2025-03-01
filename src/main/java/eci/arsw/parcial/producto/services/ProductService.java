package eci.arsw.parcial.producto.services;

import eci.arsw.parcial.producto.model.Product;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();
    public List<Product> getAllProducts() {
        products.add(new Product("Laptop", 400.5));
        return products;
    }
    public Product getProductById(int id) {
        return products.stream().filter(p -> p.getId() == id).findFirst().orElse(null);
    }

    public Product addProduct(String nombre, double precio) {
        Product product = new Product(nombre, precio);
        products.add(product);
        return product;
    }
}