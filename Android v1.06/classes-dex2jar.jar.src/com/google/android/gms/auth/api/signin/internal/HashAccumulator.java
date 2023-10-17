package com.google.android.gms.auth.api.signin.internal;

public class HashAccumulator
{
  static int zaa = 31;
  private int zab = 1;
  
  public HashAccumulator addObject(Object paramObject)
  {
    int k = zaa;
    int j = this.zab;
    int i;
    if (paramObject == null) {
      i = 0;
    } else {
      i = paramObject.hashCode();
    }
    this.zab = (k * j + i);
    return this;
  }
  
  public int hash()
  {
    return this.zab;
  }
  
  public final HashAccumulator zaa(boolean paramBoolean)
  {
    this.zab = (zaa * this.zab + paramBoolean);
    return this;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\auth\api\signin\internal\HashAccumulator.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */