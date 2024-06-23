package pro.sky.spring.service;

import java.util.List;

public interface CartService {

    List<Integer> addToCart(List<Integer> item);

    List<Integer> getCart();

}
