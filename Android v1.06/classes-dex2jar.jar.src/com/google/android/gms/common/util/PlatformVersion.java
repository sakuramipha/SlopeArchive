package com.google.android.gms.common.util;

import android.os.Build.VERSION;

public final class PlatformVersion
{
  public static boolean isAtLeastHoneycomb()
  {
    return true;
  }
  
  public static boolean isAtLeastHoneycombMR1()
  {
    return true;
  }
  
  public static boolean isAtLeastIceCreamSandwich()
  {
    return true;
  }
  
  public static boolean isAtLeastIceCreamSandwichMR1()
  {
    return Build.VERSION.SDK_INT >= 15;
  }
  
  public static boolean isAtLeastJellyBean()
  {
    return Build.VERSION.SDK_INT >= 16;
  }
  
  public static boolean isAtLeastJellyBeanMR1()
  {
    return Build.VERSION.SDK_INT >= 17;
  }
  
  public static boolean isAtLeastJellyBeanMR2()
  {
    return Build.VERSION.SDK_INT >= 18;
  }
  
  public static boolean isAtLeastKitKat()
  {
    return Build.VERSION.SDK_INT >= 19;
  }
  
  public static boolean isAtLeastKitKatWatch()
  {
    return Build.VERSION.SDK_INT >= 20;
  }
  
  public static boolean isAtLeastLollipop()
  {
    return Build.VERSION.SDK_INT >= 21;
  }
  
  public static boolean isAtLeastLollipopMR1()
  {
    return Build.VERSION.SDK_INT >= 22;
  }
  
  public static boolean isAtLeastM()
  {
    return Build.VERSION.SDK_INT >= 23;
  }
  
  public static boolean isAtLeastN()
  {
    return Build.VERSION.SDK_INT >= 24;
  }
  
  public static boolean isAtLeastO()
  {
    return Build.VERSION.SDK_INT >= 26;
  }
  
  public static boolean isAtLeastP()
  {
    return Build.VERSION.SDK_INT >= 28;
  }
  
  public static boolean isAtLeastQ()
  {
    return Build.VERSION.SDK_INT >= 29;
  }
  
  public static boolean isAtLeastR()
  {
    return Build.VERSION.SDK_INT >= 30;
  }
  
  public static boolean isAtLeastS()
  {
    if (Build.VERSION.SDK_INT >= 31) {
      return true;
    }
    if (!isAtLeastR()) {
      return false;
    }
    return (Build.VERSION.CODENAME.length() == 1) && (Build.VERSION.CODENAME.charAt(0) >= 'S') && (Build.VERSION.CODENAME.charAt(0) <= 'Z');
  }
  
  public static boolean isAtLeastT()
  {
    if (!isAtLeastS()) {
      return false;
    }
    return (Build.VERSION.CODENAME.charAt(0) >= 'T') && (Build.VERSION.CODENAME.charAt(0) <= 'Z');
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\commo\\util\PlatformVersion.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */