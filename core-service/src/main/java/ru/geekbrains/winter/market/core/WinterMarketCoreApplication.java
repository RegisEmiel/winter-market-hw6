package ru.geekbrains.winter.market.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WinterMarketCoreApplication {
	// Замена int на BigDecimal выполнена
	// Фильтрация не сделана. Делал на Thymeleaf на прошлом курсе. С фильтрацией на AngularJS нужно разбираться.

	// Домашнее задание:
	// 1. Разобраться со структурой проекта
	// 2. Замените цены продуктов/корзин с int на BigDecimal
	// 3. Добавьте фильтрацию товаров (по цене мин/макс, названию)

	public static void main(String[] args) {
		SpringApplication.run(WinterMarketCoreApplication.class, args);
	}
}
