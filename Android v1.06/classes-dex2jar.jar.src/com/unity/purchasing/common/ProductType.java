package com.unity.purchasing.common;

public enum ProductType
{
  private static final ProductType[] $VALUES;
  
  static
  {
    ProductType localProductType3 = new ProductType("Consumable", 0);
    Consumable = localProductType3;
    ProductType localProductType2 = new ProductType("NonConsumable", 1);
    NonConsumable = localProductType2;
    ProductType localProductType1 = new ProductType("Subscription", 2);
    Subscription = localProductType1;
    $VALUES = new ProductType[] { localProductType3, localProductType2, localProductType1 };
  }
  
  private ProductType() {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity\purchasing\common\ProductType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */