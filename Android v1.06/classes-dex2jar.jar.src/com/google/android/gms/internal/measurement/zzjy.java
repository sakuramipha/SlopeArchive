package com.google.android.gms.internal.measurement;

import java.io.IOException;

public class zzjy<MessageType extends zzkc<MessageType, BuilderType>, BuilderType extends zzjy<MessageType, BuilderType>>
  extends zzik<MessageType, BuilderType>
{
  protected zzkc zza;
  protected boolean zzb;
  private final zzkc zzc;
  
  protected zzjy(MessageType paramMessageType)
  {
    this.zzc = paramMessageType;
    this.zza = ((zzkc)paramMessageType.zzl(4, null, null));
    this.zzb = false;
  }
  
  private static final void zza(zzkc paramzzkc1, zzkc paramzzkc2)
  {
    zzlr.zza().zzb(paramzzkc1.getClass()).zzg(paramzzkc1, paramzzkc2);
  }
  
  public final zzjy zzaB()
  {
    zzjy localzzjy = (zzjy)this.zzc.zzl(5, null, null);
    localzzjy.zzaC(zzaF());
    return localzzjy;
  }
  
  public final zzjy zzaC(zzkc paramzzkc)
  {
    if (this.zzb)
    {
      zzaI();
      this.zzb = false;
    }
    zza(this.zza, paramzzkc);
    return this;
  }
  
  public final zzjy zzaD(byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzjo paramzzjo)
    throws zzkm
  {
    if (this.zzb)
    {
      zzaI();
      this.zzb = false;
    }
    try
    {
      zzlu localzzlu = zzlr.zza().zzb(this.zza.getClass());
      zzkc localzzkc = this.zza;
      zzio localzzio = new com/google/android/gms/internal/measurement/zzio;
      localzzio.<init>(paramzzjo);
      localzzlu.zzh(localzzkc, paramArrayOfByte, 0, paramInt2, localzzio);
      return this;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new RuntimeException("Reading from byte array should not throw IOException.", paramArrayOfByte);
    }
    catch (IndexOutOfBoundsException paramArrayOfByte)
    {
      throw zzkm.zzf();
    }
    catch (zzkm paramArrayOfByte)
    {
      throw paramArrayOfByte;
    }
  }
  
  public final MessageType zzaE()
  {
    zzkc localzzkc = zzaF();
    Object localObject = Boolean.TRUE;
    int i = ((Byte)localzzkc.zzl(1, null, null)).byteValue();
    if (i != 1)
    {
      if (i != 0)
      {
        boolean bool = zzlr.zza().zzb(localzzkc.getClass()).zzk(localzzkc);
        if (true != bool) {
          localObject = null;
        } else {
          localObject = localzzkc;
        }
        localzzkc.zzl(2, localObject, null);
        if (!bool) {}
      }
    }
    else {
      return localzzkc;
    }
    throw new zzmk(localzzkc);
  }
  
  public MessageType zzaF()
  {
    if (this.zzb) {
      return this.zza;
    }
    zzkc localzzkc = this.zza;
    zzlr.zza().zzb(localzzkc.getClass()).zzf(localzzkc);
    this.zzb = true;
    return this.zza;
  }
  
  protected void zzaI()
  {
    zzkc localzzkc = (zzkc)this.zza.zzl(4, null, null);
    zza(localzzkc, this.zza);
    this.zza = localzzkc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzjy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */