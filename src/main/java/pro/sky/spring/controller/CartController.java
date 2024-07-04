package pro.sky.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.spring.service.CartService;

import java.util.List;

@RestController
@RequestMapping(path = "order")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @GetMapping(path = "add")
    public List<Integer> addToCart(@RequestParam("item") List<Integer> item) {
        return cartService.addToCart(item);
    }

    @GetMapping(path = "get")
    public List<Integer> getCart() {
        return cartService.getCart();
    }

}
