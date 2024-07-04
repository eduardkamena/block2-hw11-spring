package pro.sky.spring.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.spring.service.CartService;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class CartServiceImpl implements CartService {

    private final List<Integer> item = new ArrayList<>();

    @Override
    public List<Integer> addToCart(List<Integer> item) {
        this.item.addAll(item);
        return new ArrayList<>(this.item);
    }

    @Override
    public List<Integer> getCart() {
        return new ArrayList<>(this.item);
    }

}
