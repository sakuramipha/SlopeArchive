package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.Objects;

final class zzpe
  extends zzds
{
  private int[] zzd;
  private int[] zze;
  
  public final void zze(ByteBuffer paramByteBuffer)
  {
    int[] arrayOfInt = this.zze;
    Objects.requireNonNull(arrayOfInt);
    int i = paramByteBuffer.position();
    int k = paramByteBuffer.limit();
    ByteBuffer localByteBuffer = zzj((k - i) / this.zzb.zze * this.zzc.zze);
    while (i < k)
    {
      int m = arrayOfInt.length;
      for (int j = 0; j < m; j++)
      {
        int n = arrayOfInt[j];
        localByteBuffer.putShort(paramByteBuffer.getShort(n + n + i));
      }
      i += this.zzb.zze;
    }
    paramByteBuffer.position(k);
    localByteBuffer.flip();
  }
  
  public final zzdp zzi(zzdp paramzzdp)
    throws zzdq
  {
    int[] arrayOfInt = this.zzd;
    if (arrayOfInt == null) {
      return zzdp.zza;
    }
    if (paramzzdp.zzd == 2)
    {
      int i;
      if (paramzzdp.zzc != arrayOfInt.length) {
        i = 1;
      } else {
        i = 0;
      }
      int k;
      for (int j = 0;; j++)
      {
        k = arrayOfInt.length;
        if (j >= k) {
          break label105;
        }
        k = arrayOfInt[j];
        if (k >= paramzzdp.zzc) {
          break;
        }
        if (k != j) {
          k = 1;
        } else {
          k = 0;
        }
        i |= k;
      }
      throw new zzdq("Unhandled input format:", paramzzdp);
      label105:
      if (i != 0) {
        paramzzdp = new zzdp(paramzzdp.zzb, k, 2);
      } else {
        paramzzdp = zzdp.zza;
      }
      return paramzzdp;
    }
    throw new zzdq("Unhandled input format:", paramzzdp);
  }
  
  protected final void zzk()
  {
    this.zze = this.zzd;
  }
  
  protected final void zzm()
  {
    this.zze = null;
    this.zzd = null;
  }
  
  public final void zzo(int[] paramArrayOfInt)
  {
    this.zzd = paramArrayOfInt;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzpe.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */