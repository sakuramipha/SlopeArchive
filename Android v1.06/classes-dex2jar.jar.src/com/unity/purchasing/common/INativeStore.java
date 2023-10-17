package com.unity.purchasing.common;

public abstract interface INativeStore
{
  public abstract void FinishTransaction(String paramString1, String paramString2);
  
  public abstract void Purchase(String paramString1, String paramString2);
  
  public abstract void RetrieveProducts(String paramString);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity\purchasing\common\INativeStore.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */