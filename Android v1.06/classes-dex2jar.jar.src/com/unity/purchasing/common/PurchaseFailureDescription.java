package com.unity.purchasing.common;

public class PurchaseFailureDescription
{
  public String message;
  public String productId;
  public PurchaseFailureReason reason;
  public String storeSpecificErrorCode;
  
  public PurchaseFailureDescription(String paramString, PurchaseFailureReason paramPurchaseFailureReason)
  {
    this(paramString, paramPurchaseFailureReason, "", "");
  }
  
  public PurchaseFailureDescription(String paramString1, PurchaseFailureReason paramPurchaseFailureReason, String paramString2, String paramString3)
  {
    this.productId = paramString1;
    this.reason = paramPurchaseFailureReason;
    this.message = paramString2;
    this.storeSpecificErrorCode = paramString3;
  }
  
  public boolean equals(Object paramObject)
  {
    if ((paramObject != null) && ((paramObject instanceof PurchaseFailureDescription))) {
      return equalsAllFields((PurchaseFailureDescription)paramObject);
    }
    return false;
  }
  
  public boolean equalsAllFields(PurchaseFailureDescription paramPurchaseFailureDescription)
  {
    boolean bool;
    if ((this.productId.equals(paramPurchaseFailureDescription.productId)) && (this.reason == paramPurchaseFailureDescription.reason) && (this.message.equals(paramPurchaseFailureDescription.message)) && (this.storeSpecificErrorCode.equals(paramPurchaseFailureDescription.storeSpecificErrorCode))) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("productId: \"");
    localStringBuilder.append(this.productId);
    localStringBuilder.append("\" reason: ");
    localStringBuilder.append(this.reason);
    localStringBuilder.append(" message: \"");
    localStringBuilder.append(this.message);
    localStringBuilder.append("\" storeSpecificErrorCode: ");
    localStringBuilder.append(this.storeSpecificErrorCode);
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity\purchasing\common\PurchaseFailureDescription.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */