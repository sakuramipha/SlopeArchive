package com.google.android.gms.internal.drive;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class zzkk<MessageType extends zzkk<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>>
  extends zzit<MessageType, BuilderType>
{
  private static Map<Object, zzkk<?, ?>> zzrs = new ConcurrentHashMap();
  protected zzmy zzrq = zzmy.zzfa();
  private int zzrr = -1;
  
  private static <T extends zzkk<T, ?>> T zza(T paramT, byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzjx paramzzjx)
    throws zzkq
  {
    paramT = (zzkk)paramT.zza(zze.zzsa, null, null);
    try
    {
      zzmf localzzmf = zzmd.zzej().zzq(paramT);
      zziz localzziz = new com/google/android/gms/internal/drive/zziz;
      localzziz.<init>(paramzzjx);
      localzzmf.zza(paramT, paramArrayOfByte, 0, paramInt2, localzziz);
      paramT.zzbp();
      if (paramT.zzne == 0) {
        return paramT;
      }
      paramArrayOfByte = new java/lang/RuntimeException;
      paramArrayOfByte.<init>();
      throw paramArrayOfByte;
    }
    catch (IndexOutOfBoundsException paramArrayOfByte)
    {
      throw zzkq.zzdi().zzg(paramT);
    }
    catch (IOException paramArrayOfByte)
    {
      if ((paramArrayOfByte.getCause() instanceof zzkq)) {
        throw ((zzkq)paramArrayOfByte.getCause());
      }
      throw new zzkq(paramArrayOfByte.getMessage()).zzg(paramT);
    }
  }
  
  protected static <T extends zzkk<T, ?>> T zza(T paramT, byte[] paramArrayOfByte, zzjx paramzzjx)
    throws zzkq
  {
    paramT = zza(paramT, paramArrayOfByte, 0, paramArrayOfByte.length, paramzzjx);
    if ((paramT != null) && (!paramT.isInitialized())) {
      throw new zzkq(new zzmw(paramT).getMessage()).zzg(paramT);
    }
    return paramT;
  }
  
  protected static Object zza(zzlq paramzzlq, String paramString, Object[] paramArrayOfObject)
  {
    return new zzme(paramzzlq, paramString, paramArrayOfObject);
  }
  
  static Object zza(Method paramMethod, Object paramObject, Object... paramVarArgs)
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
  
  protected static <T extends zzkk<?, ?>> void zza(Class<T> paramClass, T paramT)
  {
    zzrs.put(paramClass, paramT);
  }
  
  protected static final <T extends zzkk<T, ?>> boolean zza(T paramT, boolean paramBoolean)
  {
    int i = ((Byte)paramT.zza(zze.zzrx, null, null)).byteValue();
    if (i == 1) {
      return true;
    }
    if (i == 0) {
      return false;
    }
    boolean bool = zzmd.zzej().zzq(paramT).zzp(paramT);
    if (paramBoolean)
    {
      i = zze.zzry;
      T ?;
      if (bool) {
        ? = paramT;
      } else {
        ? = null;
      }
      paramT.zza(i, ?, null);
    }
    return bool;
  }
  
  static <T extends zzkk<?, ?>> T zzd(Class<T> paramClass)
  {
    Object localObject2 = (zzkk)zzrs.get(paramClass);
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      try
      {
        Class.forName(paramClass.getName(), true, paramClass.getClassLoader());
        localObject1 = (zzkk)zzrs.get(paramClass);
      }
      catch (ClassNotFoundException paramClass)
      {
        throw new IllegalStateException("Class initialization cannot fail.", paramClass);
      }
    }
    localObject2 = localObject1;
    if (localObject1 == null)
    {
      localObject2 = (zzkk)((zzkk)zznd.zzh(paramClass)).zza(zze.zzsc, null, null);
      if (localObject2 != null) {
        zzrs.put(paramClass, localObject2);
      } else {
        throw new IllegalStateException();
      }
    }
    return (T)localObject2;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!((zzkk)zza(zze.zzsc, null, null)).getClass().isInstance(paramObject)) {
      return false;
    }
    return zzmd.zzej().zzq(this).equals(this, (zzkk)paramObject);
  }
  
  public int hashCode()
  {
    if (this.zzne != 0) {
      return this.zzne;
    }
    this.zzne = zzmd.zzej().zzq(this).hashCode(this);
    return this.zzne;
  }
  
  public final boolean isInitialized()
  {
    Boolean localBoolean = Boolean.TRUE;
    return zza(this, true);
  }
  
  public String toString()
  {
    return zzlt.zza(this, super.toString());
  }
  
  protected abstract Object zza(int paramInt, Object paramObject1, Object paramObject2);
  
  public final void zzb(zzjr paramzzjr)
    throws IOException
  {
    zzmd.zzej().zzf(getClass()).zza(this, zzjt.zza(paramzzjr));
  }
  
  final int zzbm()
  {
    return this.zzrr;
  }
  
  protected final void zzbp()
  {
    zzmd.zzej().zzq(this).zzd(this);
  }
  
  protected final <MessageType extends zzkk<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>> BuilderType zzcw()
  {
    return (zza)zza(zze.zzsb, null, null);
  }
  
  public final int zzcx()
  {
    if (this.zzrr == -1) {
      this.zzrr = zzmd.zzej().zzq(this).zzn(this);
    }
    return this.zzrr;
  }
  
  final void zzo(int paramInt)
  {
    this.zzrr = paramInt;
  }
  
  public static class zza<MessageType extends zzkk<MessageType, BuilderType>, BuilderType extends zza<MessageType, BuilderType>>
    extends zziu<MessageType, BuilderType>
  {
    private final MessageType zzrt;
    protected MessageType zzru;
    private boolean zzrv;
    
    protected zza(MessageType paramMessageType)
    {
      this.zzrt = paramMessageType;
      this.zzru = ((zzkk)paramMessageType.zza(zzkk.zze.zzsa, null, null));
      this.zzrv = false;
    }
    
    private static void zza(MessageType paramMessageType1, MessageType paramMessageType2)
    {
      zzmd.zzej().zzq(paramMessageType1).zzc(paramMessageType1, paramMessageType2);
    }
    
    public final boolean isInitialized()
    {
      return zzkk.zza(this.zzru, false);
    }
    
    public final BuilderType zza(MessageType paramMessageType)
    {
      zzdb();
      zza(this.zzru, paramMessageType);
      return this;
    }
    
    protected final void zzdb()
    {
      if (this.zzrv)
      {
        zzkk localzzkk = (zzkk)this.zzru.zza(zzkk.zze.zzsa, null, null);
        zza(localzzkk, this.zzru);
        this.zzru = localzzkk;
        this.zzrv = false;
      }
    }
    
    public MessageType zzdc()
    {
      if (this.zzrv) {
        return this.zzru;
      }
      this.zzru.zzbp();
      this.zzrv = true;
      return this.zzru;
    }
    
    public final MessageType zzdd()
    {
      zzkk localzzkk = (zzkk)zzde();
      if (localzzkk.isInitialized()) {
        return localzzkk;
      }
      throw new zzmw(localzzkk);
    }
  }
  
  public static final class zzb<T extends zzkk<T, ?>>
    extends zziv<T>
  {
    private final T zzrt;
    
    public zzb(T paramT)
    {
      this.zzrt = paramT;
    }
  }
  
  public static abstract class zzc<MessageType extends zzc<MessageType, BuilderType>, BuilderType>
    extends zzkk<MessageType, BuilderType>
    implements zzls
  {
    protected zzkb<Object> zzrw = zzkb.zzcn();
    
    final zzkb<Object> zzdg()
    {
      if (this.zzrw.isImmutable()) {
        this.zzrw = ((zzkb)this.zzrw.clone());
      }
      return this.zzrw;
    }
  }
  
  public static final class zzd<ContainingType extends zzlq, Type>
    extends zzjv<ContainingType, Type>
  {}
  
  public static enum zze
  {
    private static final int[] zzse = { 1, 2, 3, 4, 5, 6, 7 };
    private static final int[] zzsh = { 1, 2 };
    private static final int[] zzsk = { 1, 2 };
    
    public static int[] zzdh()
    {
      return (int[])zzse.clone();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzkk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */