package com.unity.purchasing.common;

public class ProductDefinition
{
  public String id;
  public String storeSpecificId;
  public ProductType type;
  
  public ProductDefinition(String paramString, ProductType paramProductType)
  {
    this(paramString, paramString, paramProductType);
  }
  
  public ProductDefinition(String paramString1, String paramString2, ProductType paramProductType)
  {
    this.id = paramString1;
    this.storeSpecificId = paramString2;
    this.type = paramProductType;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity\purchasing\common\ProductDefinition.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */