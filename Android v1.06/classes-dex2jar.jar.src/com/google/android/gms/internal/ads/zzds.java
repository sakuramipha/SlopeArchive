package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public abstract class zzds
  implements zzdr
{
  protected zzdp zzb;
  protected zzdp zzc;
  private zzdp zzd;
  private zzdp zze;
  private ByteBuffer zzf;
  private ByteBuffer zzg;
  private boolean zzh;
  
  public zzds()
  {
    Object localObject = zza;
    this.zzf = ((ByteBuffer)localObject);
    this.zzg = ((ByteBuffer)localObject);
    this.zzd = zzdp.zza;
    localObject = zzdp.zza;
    this.zze = ((zzdp)localObject);
    this.zzb = ((zzdp)localObject);
    this.zzc = ((zzdp)localObject);
  }
  
  public final zzdp zza(zzdp paramzzdp)
    throws zzdq
  {
    this.zzd = paramzzdp;
    this.zze = zzi(paramzzdp);
    if (zzg()) {
      paramzzdp = this.zze;
    } else {
      paramzzdp = zzdp.zza;
    }
    return paramzzdp;
  }
  
  public ByteBuffer zzb()
  {
    ByteBuffer localByteBuffer = this.zzg;
    this.zzg = zza;
    return localByteBuffer;
  }
  
  public final void zzc()
  {
    this.zzg = zza;
    this.zzh = false;
    this.zzb = this.zzd;
    this.zzc = this.zze;
    zzk();
  }
  
  public final void zzd()
  {
    this.zzh = true;
    zzl();
  }
  
  public final void zzf()
  {
    zzc();
    this.zzf = zza;
    this.zzd = zzdp.zza;
    zzdp localzzdp = zzdp.zza;
    this.zze = localzzdp;
    this.zzb = localzzdp;
    this.zzc = localzzdp;
    zzm();
  }
  
  public boolean zzg()
  {
    return this.zze != zzdp.zza;
  }
  
  public boolean zzh()
  {
    return (this.zzh) && (this.zzg == zza);
  }
  
  protected zzdp zzi(zzdp paramzzdp)
    throws zzdq
  {
    throw null;
  }
  
  protected final ByteBuffer zzj(int paramInt)
  {
    if (this.zzf.capacity() < paramInt) {
      this.zzf = ByteBuffer.allocateDirect(paramInt).order(ByteOrder.nativeOrder());
    } else {
      this.zzf.clear();
    }
    ByteBuffer localByteBuffer = this.zzf;
    this.zzg = localByteBuffer;
    return localByteBuffer;
  }
  
  protected void zzk() {}
  
  protected void zzl() {}
  
  protected void zzm() {}
  
  protected final boolean zzn()
  {
    return this.zzg.hasRemaining();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzds.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */