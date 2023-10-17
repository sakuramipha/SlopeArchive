package com.unity.purchasing.common;

public class ProductDescription
{
  public final ProductMetadata metadata;
  public final String receipt;
  public final String storeSpecificId;
  public final String transactionId;
  
  public ProductDescription(String paramString1, ProductMetadata paramProductMetadata, String paramString2, String paramString3)
  {
    this.storeSpecificId = paramString1;
    this.metadata = paramProductMetadata;
    this.receipt = paramString2;
    this.transactionId = paramString3;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{ProductDescription: storeSpecificId = ");
    localStringBuilder.append(this.storeSpecificId);
    localStringBuilder.append(", metadata = ");
    localStringBuilder.append(this.metadata);
    localStringBuilder.append(", receipt = ");
    localStringBuilder.append(this.receipt);
    localStringBuilder.append(", transactionId = ");
    localStringBuilder.append(this.transactionId);
    localStringBuilder.append(", }");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity\purchasing\common\ProductDescription.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */