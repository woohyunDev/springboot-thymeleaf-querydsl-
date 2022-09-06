package com.mysite.sbb.cart;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.mysite.sbb.cartItem.CartItem;
import com.mysite.sbb.user.SiteUser;

import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Service
public class CartService {
	
	private final CartRepository cartRepository;
	
	
	public Cart createCart(SiteUser siteUser) {
		Cart cart = new Cart();
		cart.setSiteUser(siteUser);
		return this.cartRepository.save(cart);
		
	}
	
	
	public Cart getCart(SiteUser siteUser) {
		
		Optional<Cart> cart = this.cartRepository.findBySiteUser(siteUser);
		if(cart.isPresent()) {
			return cart.get();
		}
		else {
			 return createCart(siteUser);
			
		}
	}

	
	public int getTotalPrice(Cart cart) {
		int totalPrice = 0 ;
		int price=0;
		for(CartItem cartItem: cart.getCartItemList()) {
			price = 0;
			price = cartItem.getSiteItem().getPrice() * cartItem.getAmount();
			totalPrice += price;			
		}
		return totalPrice;
	}
}