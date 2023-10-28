package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Shop;

public interface ShopService {
	public Shop saveShop(Shop shop);

	public List<Shop> fetchShopList();

	public Shop fetchShopById(Long shopId);

	public void deleteShopById(Long shopId);

	public Shop updateShop(Long shopId, Shop shop);

}
