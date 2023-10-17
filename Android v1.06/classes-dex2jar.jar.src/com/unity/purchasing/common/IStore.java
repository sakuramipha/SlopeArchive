package com.unity.purchasing.common;

import java.util.List;

public abstract interface IStore
{
  public abstract void FinishTransaction(ProductDefinition paramProductDefinition, String paramString);
  
  public abstract void Purchase(ProductDefinition paramProductDefinition);
  
  public abstract void Purchase(ProductDefinition paramProductDefinition, String paramString);
  
  public abstract void RetrieveProducts(List<ProductDefinition> paramList);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity\purchasing\common\IStore.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */