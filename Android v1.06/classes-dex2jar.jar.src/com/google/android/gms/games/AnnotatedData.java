package com.google.android.gms.games;

public class AnnotatedData<T>
{
  private final Object zza;
  private final boolean zzb;
  
  public AnnotatedData(Object paramObject, boolean paramBoolean)
  {
    this.zza = paramObject;
    this.zzb = paramBoolean;
  }
  
  public T get()
  {
    return (T)this.zza;
  }
  
  public boolean isStale()
  {
    return this.zzb;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\AnnotatedData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */