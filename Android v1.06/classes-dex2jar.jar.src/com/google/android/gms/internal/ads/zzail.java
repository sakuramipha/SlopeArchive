package com.google.android.gms.internal.ads;

final class zzail
{
  private final zzabr zza;
  private boolean zzb;
  private boolean zzc;
  private boolean zzd;
  private int zze;
  private int zzf;
  private long zzg;
  private long zzh;
  
  public zzail(zzabr paramzzabr)
  {
    this.zza = paramzzabr;
  }
  
  public final void zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (this.zzc)
    {
      int i = this.zzf;
      int j = paramInt1 + 1 - i;
      if (j < paramInt2)
      {
        boolean bool;
        if ((paramArrayOfByte[j] & 0xC0) >> 6 == 0) {
          bool = true;
        } else {
          bool = false;
        }
        this.zzd = bool;
        this.zzc = false;
        return;
      }
      this.zzf = (i + (paramInt2 - paramInt1));
    }
  }
  
  public final void zzb(long paramLong, int paramInt, boolean paramBoolean)
  {
    if ((this.zze == 182) && (paramBoolean) && (this.zzb))
    {
      long l2 = this.zzh;
      if (l2 != -9223372036854775807L)
      {
        long l1 = this.zzg;
        int i = this.zzd;
        this.zza.zzs(l2, i, (int)(paramLong - l1), paramInt, null);
      }
    }
    if (this.zze != 179) {
      this.zzg = paramLong;
    }
  }
  
  public final void zzc(int paramInt, long paramLong)
  {
    this.zze = paramInt;
    this.zzd = false;
    boolean bool2 = true;
    int i = paramInt;
    if (paramInt != 182) {
      if (paramInt == 179)
      {
        i = 179;
      }
      else
      {
        bool1 = false;
        break label50;
      }
    }
    boolean bool1 = true;
    paramInt = i;
    label50:
    this.zzb = bool1;
    if (paramInt == 182) {
      bool1 = bool2;
    } else {
      bool1 = false;
    }
    this.zzc = bool1;
    this.zzf = 0;
    this.zzh = paramLong;
  }
  
  public final void zzd()
  {
    this.zzb = false;
    this.zzc = false;
    this.zzd = false;
    this.zze = -1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzail.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */