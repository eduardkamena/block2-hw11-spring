package pro.sky.spring.service.impl;

import org.springframework.stereotype.Service;
import pro.sky.spring.service.CartService;

import java.util.List;

@Service
public class CartServiceImpl implements CartService {

    private final CartService cartService;

    public CartServiceImpl(CartService cartService) {
        this.cartService = cartService;
    }

    @Override
    public List<Integer> addToCart(List<Integer> items) {
        return cartService.addToCart(items);
    }

    @Override
    public List<Integer> getCart() {
        return cartService.getCart();
    }
}
