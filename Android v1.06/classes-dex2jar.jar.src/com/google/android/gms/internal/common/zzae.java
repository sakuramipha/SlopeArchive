package com.google.android.gms.internal.common;

final class zzae<E>
  extends zzz<E>
{
  private final zzag<E> zza;
  
  zzae(zzag<E> paramzzag, int paramInt)
  {
    super(paramzzag.size(), paramInt);
    this.zza = paramzzag;
  }
  
  protected final E zza(int paramInt)
  {
    return (E)this.zza.get(paramInt);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\common\zzae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */