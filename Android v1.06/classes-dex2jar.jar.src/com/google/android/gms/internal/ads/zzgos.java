package com.google.android.gms.internal.ads;

import java.io.IOException;

public class zzgos<MessageType extends zzgow<MessageType, BuilderType>, BuilderType extends zzgos<MessageType, BuilderType>>
  extends zzgmw<MessageType, BuilderType>
{
  protected zzgow zza;
  private final zzgow zzb;
  
  protected zzgos(MessageType paramMessageType)
  {
    this.zzb = paramMessageType;
    if (!paramMessageType.zzaY())
    {
      this.zza = paramMessageType.zzaD();
      return;
    }
    throw new IllegalArgumentException("Default instance must be immutable.");
  }
  
  private static void zza(Object paramObject1, Object paramObject2)
  {
    zzgqo.zza().zzb(paramObject1.getClass()).zzg(paramObject1, paramObject2);
  }
  
  public final zzgos zzai()
  {
    zzgos localzzgos = (zzgos)this.zzb.zzb(5, null, null);
    localzzgos.zza = zzam();
    return localzzgos;
  }
  
  public final zzgos zzaj(zzgow paramzzgow)
  {
    if (!this.zzb.equals(paramzzgow))
    {
      if (!this.zza.zzaY()) {
        zzaq();
      }
      zza(this.zza, paramzzgow);
    }
    return this;
  }
  
  public final zzgos zzak(byte[] paramArrayOfByte, int paramInt1, int paramInt2, zzgoi paramzzgoi)
    throws zzgpi
  {
    if (!this.zza.zzaY()) {
      zzaq();
    }
    try
    {
      zzgqz localzzgqz = zzgqo.zza().zzb(this.zza.getClass());
      zzgow localzzgow = this.zza;
      zzgna localzzgna = new com/google/android/gms/internal/ads/zzgna;
      localzzgna.<init>(paramzzgoi);
      localzzgqz.zzi(localzzgow, paramArrayOfByte, 0, paramInt2, localzzgna);
      return this;
    }
    catch (IOException paramArrayOfByte)
    {
      throw new RuntimeException("Reading from byte array should not throw IOException.", paramArrayOfByte);
    }
    catch (IndexOutOfBoundsException paramArrayOfByte)
    {
      throw zzgpi.zzj();
    }
    catch (zzgpi paramArrayOfByte)
    {
      throw paramArrayOfByte;
    }
  }
  
  public final MessageType zzal()
  {
    zzgow localzzgow = zzam();
    if (localzzgow.zzaX()) {
      return localzzgow;
    }
    throw new zzgrp(localzzgow);
  }
  
  public MessageType zzam()
  {
    if (!this.zza.zzaY()) {
      return this.zza;
    }
    this.zza.zzaS();
    return this.zza;
  }
  
  protected final void zzap()
  {
    if (!this.zza.zzaY()) {
      zzaq();
    }
  }
  
  protected void zzaq()
  {
    zzgow localzzgow = this.zzb.zzaD();
    zza(localzzgow, this.zza);
    this.zza = localzzgow;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgos.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */