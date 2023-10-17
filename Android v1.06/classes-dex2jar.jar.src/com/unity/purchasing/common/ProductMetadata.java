package com.unity.purchasing.common;

import java.math.BigDecimal;

public class ProductMetadata
{
  public final String isoCurrencyCode;
  public final String localizedDescription;
  public final BigDecimal localizedPrice;
  public final String localizedPriceString;
  public final String localizedTitle;
  
  public ProductMetadata(String paramString1, String paramString2, String paramString3, String paramString4, BigDecimal paramBigDecimal)
  {
    String str = paramString1;
    if (paramString1 == null) {
      str = "";
    }
    this.localizedPriceString = str;
    this.localizedTitle = paramString2;
    this.localizedDescription = paramString3;
    this.isoCurrencyCode = paramString4;
    this.localizedPrice = paramBigDecimal;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{ProductMetadata: localizedPriceString = ");
    localStringBuilder.append(this.localizedPriceString);
    localStringBuilder.append(", localizedTitle = ");
    localStringBuilder.append(this.localizedTitle);
    localStringBuilder.append(", localizedDescription = ");
    localStringBuilder.append(this.localizedDescription);
    localStringBuilder.append(", isoCurrencyCode = ");
    localStringBuilder.append(this.isoCurrencyCode);
    localStringBuilder.append(", localizedPrice = ");
    localStringBuilder.append(this.localizedPrice);
    localStringBuilder.append(", }");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity\purchasing\common\ProductMetadata.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */