package in.techdenovo.apps.personalexpensetracker.service;

import in.techdenovo.apps.personalexpensetracker.model.Product;
import in.techdenovo.apps.personalexpensetracker.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public List<Product> getAllProducts(){return productRepository.findAll();}
    public Product createProduct(Product product) {return productRepository.save(product);}
    public Product getProductById(long id) {return productRepository.findById(id).orElse(null);}
}
