package com.example.rielpractiseproject.repositories;

import com.example.rielpractiseproject.models.Product;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

  private List<Product> items = new ArrayList<>();

  public ProductRepository() {
    items.add(new Product(1, "zsepi", 5, 300));
    items.add(new Product(2, "kendo", 10, 1100));
    items.add(new Product(3, "víz", 15, 100));
    items.add(new Product(4, "laptop", 22, 3200));
  }

  public List<Product> getItems() {
    return items;
  }

  public void add(Product product) {
    items.add(product);
  }
}
