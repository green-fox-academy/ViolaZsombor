package com.example.rielpractiseproject.services;

import com.example.rielpractiseproject.models.Product;
import com.example.rielpractiseproject.repositories.ProductRepository;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

  private ProductRepository repository;

  @Autowired
  public ProductService(ProductRepository repository) {
    this.repository = repository;
  }

  public List<Product> getItems() {
    return repository.getItems();
  }

  public List<Product> getFiltered(int quantity) {
    return repository.getItems().stream().filter(p -> p.getQuantity() >= quantity)
        .collect(Collectors.toList());
  }

  public void addItem(Product item) {
    item.setId(
        repository.getItems().stream().max(Comparator.comparing(p -> p.getId())).get().getId() + 1);
    repository.add(item);
  }
}
