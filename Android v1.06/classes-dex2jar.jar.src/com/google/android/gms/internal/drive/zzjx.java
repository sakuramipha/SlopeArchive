package com.google.android.gms.internal.drive;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class zzjx
{
  private static volatile boolean zzol = false;
  private static final Class<?> zzom = ;
  private static volatile zzjx zzon;
  static final zzjx zzoo = new zzjx(true);
  private final Map<zza, zzkk.zzd<?, ?>> zzop;
  
  zzjx()
  {
    this.zzop = new HashMap();
  }
  
  private zzjx(boolean paramBoolean)
  {
    this.zzop = Collections.emptyMap();
  }
  
  static zzjx zzcg()
  {
    return zzki.zza(zzjx.class);
  }
  
  private static Class<?> zzch()
  {
    try
    {
      Class localClass = Class.forName("com.google.protobuf.Extension");
      return localClass;
    }
    catch (ClassNotFoundException localClassNotFoundException) {}
    return null;
  }
  
  public static zzjx zzci()
  {
    return zzjw.zzcf();
  }
  
  public static zzjx zzcj()
  {
    zzjx localzzjx3 = zzon;
    zzjx localzzjx1 = localzzjx3;
    if (localzzjx3 == null) {
      try
      {
        localzzjx3 = zzon;
        localzzjx1 = localzzjx3;
        if (localzzjx3 == null)
        {
          localzzjx1 = zzjw.zzcg();
          zzon = localzzjx1;
        }
      }
      finally {}
    }
    return localzzjx2;
  }
  
  public final <ContainingType extends zzlq> zzkk.zzd<ContainingType, ?> zza(ContainingType paramContainingType, int paramInt)
  {
    return (zzkk.zzd)this.zzop.get(new zza(paramContainingType, paramInt));
  }
  
  static final class zza
  {
    private final int number;
    private final Object object;
    
    zza(Object paramObject, int paramInt)
    {
      this.object = paramObject;
      this.number = paramInt;
    }
    
    public final boolean equals(Object paramObject)
    {
      if (!(paramObject instanceof zza)) {
        return false;
      }
      paramObject = (zza)paramObject;
      return (this.object == ((zza)paramObject).object) && (this.number == ((zza)paramObject).number);
    }
    
    public final int hashCode()
    {
      return System.identityHashCode(this.object) * 65535 + this.number;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzjx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */