package com.j2.w7.pizzaaf;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

  public Dough createDough() {
    return new ThinCrustDough();
  }
  public Cheese createCheese() {
    return new ReggianoCheese();
  }
}