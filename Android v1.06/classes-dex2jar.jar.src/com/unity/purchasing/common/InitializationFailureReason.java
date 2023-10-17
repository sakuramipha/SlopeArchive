package com.unity.purchasing.common;

public enum InitializationFailureReason
{
  private static final InitializationFailureReason[] $VALUES;
  
  static
  {
    InitializationFailureReason localInitializationFailureReason1 = new InitializationFailureReason("PurchasingUnavailable", 0);
    PurchasingUnavailable = localInitializationFailureReason1;
    InitializationFailureReason localInitializationFailureReason2 = new InitializationFailureReason("NoProductsAvailable", 1);
    NoProductsAvailable = localInitializationFailureReason2;
    InitializationFailureReason localInitializationFailureReason3 = new InitializationFailureReason("AppNotKnown", 2);
    AppNotKnown = localInitializationFailureReason3;
    $VALUES = new InitializationFailureReason[] { localInitializationFailureReason1, localInitializationFailureReason2, localInitializationFailureReason3 };
  }
  
  private InitializationFailureReason() {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity\purchasing\common\InitializationFailureReason.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */