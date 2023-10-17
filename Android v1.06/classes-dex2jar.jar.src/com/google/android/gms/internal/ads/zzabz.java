package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

public final class zzabz
  implements zzaao
{
  public static final zzaav zza = zzaby.zza;
  private static final int[] zzb = { 13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1 };
  private static final int[] zzc;
  private static final byte[] zzd = "#!AMR\n".getBytes(zzfol.zzc);
  private static final byte[] zze = "#!AMR-WB\n".getBytes(zzfol.zzc);
  private static final int zzf = arrayOfInt[8];
  private final byte[] zzg = new byte[1];
  private boolean zzh;
  private long zzi;
  private int zzj;
  private int zzk;
  private boolean zzl;
  private int zzm = -1;
  private int zzn;
  private long zzo;
  private zzaar zzp;
  private zzabr zzq;
  private zzabn zzr;
  private boolean zzs;
  
  static
  {
    int[] arrayOfInt = new int[16];
    int[] tmp105_104 = arrayOfInt;
    tmp105_104[0] = 18;
    int[] tmp110_105 = tmp105_104;
    tmp110_105[1] = 24;
    int[] tmp115_110 = tmp110_105;
    tmp115_110[2] = 33;
    int[] tmp120_115 = tmp115_110;
    tmp120_115[3] = 37;
    int[] tmp125_120 = tmp120_115;
    tmp125_120[4] = 41;
    int[] tmp130_125 = tmp125_120;
    tmp130_125[5] = 47;
    int[] tmp135_130 = tmp130_125;
    tmp135_130[6] = 51;
    int[] tmp141_135 = tmp135_130;
    tmp141_135[7] = 59;
    int[] tmp147_141 = tmp141_135;
    tmp147_141[8] = 61;
    int[] tmp153_147 = tmp147_141;
    tmp153_147[9] = 6;
    int[] tmp159_153 = tmp153_147;
    tmp159_153[10] = 1;
    int[] tmp164_159 = tmp159_153;
    tmp164_159[11] = 1;
    int[] tmp169_164 = tmp164_159;
    tmp169_164[12] = 1;
    int[] tmp174_169 = tmp169_164;
    tmp174_169[13] = 1;
    int[] tmp179_174 = tmp174_169;
    tmp179_174[14] = 1;
    int[] tmp184_179 = tmp179_174;
    tmp184_179[15] = 1;
    tmp184_179;
    zzc = arrayOfInt;
    int i = zzfn.zza;
  }
  
  public zzabz()
  {
    this(0);
  }
  
  public zzabz(int paramInt) {}
  
  @RequiresNonNull({"trackOutput"})
  private final int zze(zzaap paramzzaap)
    throws IOException
  {
    int k = this.zzk;
    if (k == 0) {}
    try
    {
      paramzzaap.zzj();
      Object localObject = this.zzg;
      ((zzaae)paramzzaap).zzm((byte[])localObject, 0, 1, false);
      int i = this.zzg[0];
      if ((i & 0x83) <= 0)
      {
        boolean bool = this.zzh;
        i = i >> 3 & 0xF;
        if (((bool) && ((i < 10) || (i > 13))) || ((!bool) && ((i < 12) || (i > 14))))
        {
          if (bool) {
            i = zzc[i];
          } else {
            i = zzb[i];
          }
          this.zzj = i;
          this.zzk = i;
          k = this.zzm;
          int j = k;
          if (k == -1)
          {
            this.zzm = i;
            j = i;
          }
          k = i;
          if (j == i)
          {
            this.zzn += 1;
            k = i;
          }
          i = zzabp.zza(this.zzq, paramzzaap, k, true);
          if (i == -1) {
            return -1;
          }
          i = this.zzk - i;
          this.zzk = i;
          if (i > 0) {
            return 0;
          }
          this.zzq.zzs(this.zzi, 1, this.zzj, 0, null);
          this.zzi += 20000L;
          return 0;
        }
        paramzzaap = "WB";
        if (true != bool) {
          paramzzaap = "NB";
        }
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append("Illegal AMR ");
        ((StringBuilder)localObject).append(paramzzaap);
        ((StringBuilder)localObject).append(" frame type ");
        ((StringBuilder)localObject).append(i);
        throw zzce.zza(((StringBuilder)localObject).toString(), null);
      }
      paramzzaap = new java/lang/StringBuilder;
      paramzzaap.<init>();
      paramzzaap.append("Invalid padding bits for frame header ");
      paramzzaap.append(i);
      throw zzce.zza(paramzzaap.toString(), null);
    }
    catch (EOFException paramzzaap) {}
    return -1;
  }
  
  private static boolean zzf(zzaap paramzzaap, byte[] paramArrayOfByte)
    throws IOException
  {
    paramzzaap.zzj();
    int i = paramArrayOfByte.length;
    byte[] arrayOfByte = new byte[i];
    ((zzaae)paramzzaap).zzm(arrayOfByte, 0, i, false);
    return Arrays.equals(arrayOfByte, paramArrayOfByte);
  }
  
  private final boolean zzg(zzaap paramzzaap)
    throws IOException
  {
    byte[] arrayOfByte = zzd;
    int i;
    if (zzf(paramzzaap, arrayOfByte))
    {
      this.zzh = false;
      i = arrayOfByte.length;
      ((zzaae)paramzzaap).zzo(i, false);
      return true;
    }
    arrayOfByte = zze;
    if (zzf(paramzzaap, arrayOfByte))
    {
      this.zzh = true;
      i = arrayOfByte.length;
      ((zzaae)paramzzaap).zzo(i, false);
      return true;
    }
    return false;
  }
  
  public final int zza(zzaap paramzzaap, zzabk paramzzabk)
    throws IOException
  {
    zzdy.zzb(this.zzq);
    int i = zzfn.zza;
    if ((paramzzaap.zzf() == 0L) && (!zzg(paramzzaap))) {
      throw zzce.zza("Could not find AMR header.", null);
    }
    if (!this.zzs)
    {
      this.zzs = true;
      boolean bool = this.zzh;
      if (true != bool) {
        paramzzabk = "audio/3gpp";
      } else {
        paramzzabk = "audio/amr-wb";
      }
      if (true != bool) {
        i = 8000;
      } else {
        i = 16000;
      }
      zzabr localzzabr = this.zzq;
      zzak localzzak = new zzak();
      localzzak.zzS(paramzzabk);
      localzzak.zzL(zzf);
      localzzak.zzw(1);
      localzzak.zzT(i);
      localzzabr.zzk(localzzak.zzY());
    }
    i = zze(paramzzaap);
    if (this.zzl) {
      return i;
    }
    paramzzaap = new zzabm(-9223372036854775807L, 0L);
    this.zzr = paramzzaap;
    this.zzp.zzN(paramzzaap);
    this.zzl = true;
    return i;
  }
  
  public final void zzb(zzaar paramzzaar)
  {
    this.zzp = paramzzaar;
    this.zzq = paramzzaar.zzv(0, 1);
    paramzzaar.zzC();
  }
  
  public final void zzc(long paramLong1, long paramLong2)
  {
    this.zzi = 0L;
    this.zzj = 0;
    this.zzk = 0;
    this.zzo = 0L;
  }
  
  public final boolean zzd(zzaap paramzzaap)
    throws IOException
  {
    return zzg(paramzzaap);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzabz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */