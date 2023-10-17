package com.unity.purchasing.common;

public enum PurchaseFailureReason
{
  private static final PurchaseFailureReason[] $VALUES;
  
  static
  {
    PurchaseFailureReason localPurchaseFailureReason1 = new PurchaseFailureReason("BillingUnavailable", 0);
    BillingUnavailable = localPurchaseFailureReason1;
    PurchaseFailureReason localPurchaseFailureReason2 = new PurchaseFailureReason("ExistingPurchasePending", 1);
    ExistingPurchasePending = localPurchaseFailureReason2;
    PurchaseFailureReason localPurchaseFailureReason3 = new PurchaseFailureReason("ItemUnavailable", 2);
    ItemUnavailable = localPurchaseFailureReason3;
    PurchaseFailureReason localPurchaseFailureReason5 = new PurchaseFailureReason("SignatureInvalid", 3);
    SignatureInvalid = localPurchaseFailureReason5;
    PurchaseFailureReason localPurchaseFailureReason8 = new PurchaseFailureReason("UserCancelled", 4);
    UserCancelled = localPurchaseFailureReason8;
    PurchaseFailureReason localPurchaseFailureReason4 = new PurchaseFailureReason("PaymentDeclined", 5);
    PaymentDeclined = localPurchaseFailureReason4;
    PurchaseFailureReason localPurchaseFailureReason6 = new PurchaseFailureReason("DuplicateTransaction", 6);
    DuplicateTransaction = localPurchaseFailureReason6;
    PurchaseFailureReason localPurchaseFailureReason7 = new PurchaseFailureReason("Unknown", 7);
    Unknown = localPurchaseFailureReason7;
    $VALUES = new PurchaseFailureReason[] { localPurchaseFailureReason1, localPurchaseFailureReason2, localPurchaseFailureReason3, localPurchaseFailureReason5, localPurchaseFailureReason8, localPurchaseFailureReason4, localPurchaseFailureReason6, localPurchaseFailureReason7 };
  }
  
  private PurchaseFailureReason() {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity\purchasing\common\PurchaseFailureReason.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */