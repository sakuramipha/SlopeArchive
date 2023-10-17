package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzkc<MessageType extends zzkc<MessageType, BuilderType>, BuilderType extends zzjy<MessageType, BuilderType>>
  extends zzil<MessageType, BuilderType>
{
  private static final Map zza = new ConcurrentHashMap();
  protected zzmm zzc = zzmm.zzc();
  protected int zzd = -1;
  
  static zzkc zzbC(Class paramClass)
  {
    Map localMap = zza;
    Object localObject2 = (zzkc)localMap.get(paramClass);
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      try
      {
        Class.forName(paramClass.getName(), true, paramClass.getClassLoader());
        localObject1 = (zzkc)localMap.get(paramClass);
      }
      catch (ClassNotFoundException paramClass)
      {
        throw new IllegalStateException("Class initialization cannot fail.", paramClass);
      }
    }
    localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = (zzkc)((zzkc)zzmv.zze(paramClass)).zzl(6, null, null);
      if (localObject2 != null) {
        localMap.put(paramClass, localObject2);
      } else {
        throw new IllegalStateException();
      }
    }
    return (zzkc)localObject2;
  }
  
  protected static zzkh zzbD()
  {
    return zzkd.zzf();
  }
  
  protected static zzki zzbE()
  {
    return zzky.zzf();
  }
  
  protected static zzki zzbF(zzki paramzzki)
  {
    int i = paramzzki.size();
    if (i == 0) {
      i = 10;
    } else {
      i += i;
    }
    return paramzzki.zze(i);
  }
  
  protected static zzkj zzbG()
  {
    return zzls.zze();
  }
  
  protected static zzkj zzbH(zzkj paramzzkj)
  {
    int i = paramzzkj.size();
    if (i == 0) {
      i = 10;
    } else {
      i += i;
    }
    return paramzzkj.zzd(i);
  }
  
  static Object zzbK(Method paramMethod, Object paramObject, Object... paramVarArgs)
  {
    try
    {
      paramMethod = paramMethod.invoke(paramObject, paramVarArgs);
      return paramMethod;
    }
    catch (InvocationTargetException paramMethod)
    {
      paramMethod = paramMethod.getCause();
      if (!(paramMethod instanceof RuntimeException))
      {
        if ((paramMethod instanceof Error)) {
          throw ((Error)paramMethod);
        }
        throw new RuntimeException("Unexpected exception thrown by generated accessor method.", paramMethod);
      }
      throw ((RuntimeException)paramMethod);
    }
    catch (IllegalAccessException paramMethod)
    {
      throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", paramMethod);
    }
  }
  
  protected static Object zzbL(zzlj paramzzlj, String paramString, Object[] paramArrayOfObject)
  {
    return new zzlt(paramzzlj, paramString, paramArrayOfObject);
  }
  
  protected static void zzbM(Class paramClass, zzkc paramzzkc)
  {
    zza.put(paramClass, paramzzkc);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (getClass() != paramObject.getClass()) {
      return false;
    }
    return zzlr.zza().zzb(getClass()).zzj(this, (zzkc)paramObject);
  }
  
  public final int hashCode()
  {
    int i = this.zzb;
    if (i != 0) {
      return i;
    }
    i = zzlr.zza().zzb(getClass()).zzb(this);
    this.zzb = i;
    return i;
  }
  
  public final String toString()
  {
    return zzll.zza(this, super.toString());
  }
  
  protected final zzjy zzbA()
  {
    return (zzjy)zzl(5, null, null);
  }
  
  public final zzjy zzbB()
  {
    zzjy localzzjy = (zzjy)zzl(5, null, null);
    localzzjy.zzaC(this);
    return localzzjy;
  }
  
  public final void zzbN(zzjj paramzzjj)
    throws IOException
  {
    zzlr.zza().zzb(getClass()).zzi(this, zzjk.zza(paramzzjj));
  }
  
  final int zzbu()
  {
    return this.zzd;
  }
  
  final void zzbx(int paramInt)
  {
    this.zzd = paramInt;
  }
  
  public final int zzbz()
  {
    int j = this.zzd;
    int i = j;
    if (j == -1)
    {
      i = zzlr.zza().zzb(getClass()).zza(this);
      this.zzd = i;
    }
    return i;
  }
  
  protected abstract Object zzl(int paramInt, Object paramObject1, Object paramObject2);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzkc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */