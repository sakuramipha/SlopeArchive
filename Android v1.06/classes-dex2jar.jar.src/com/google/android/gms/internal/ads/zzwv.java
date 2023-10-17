package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class zzwv
  extends zzxa
{
  public static final int zzb = 0;
  private static final zzfta zzc = zzfta.zzb(zzwb.zza);
  private static final zzfta zzd = zzfta.zzb(zzwc.zza);
  public final Context zza;
  private final Object zze = new Object();
  private final boolean zzf;
  private zzwj zzg;
  private zzwo zzh;
  private zzk zzi;
  private final zzvq zzj;
  
  @Deprecated
  public zzwv() {}
  
  public zzwv(Context paramContext)
  {
    Context localContext;
    if (paramContext != null) {
      localContext = paramContext.getApplicationContext();
    } else {
      localContext = null;
    }
    this.zza = localContext;
    this.zzj = localzzvq;
    this.zzg = localzzwj;
    this.zzi = zzk.zza;
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramContext != null)
    {
      bool1 = bool2;
      if (zzfn.zzD(paramContext)) {
        bool1 = true;
      }
    }
    this.zzf = bool1;
    if ((!bool1) && (paramContext != null) && (zzfn.zza >= 32)) {
      this.zzh = zzwo.zza(paramContext);
    }
    if ((this.zzg.zzP) && (paramContext == null)) {
      zzer.zze("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
    }
  }
  
  protected static int zza(zzam paramzzam, String paramString, boolean paramBoolean)
  {
    if ((!TextUtils.isEmpty(paramString)) && (paramString.equals(paramzzam.zzd))) {
      return 4;
    }
    paramString = zzf(paramString);
    paramzzam = zzf(paramzzam.zzd);
    if ((paramzzam != null) && (paramString != null))
    {
      if ((!paramzzam.startsWith(paramString)) && (!paramString.startsWith(paramzzam)))
      {
        int i = zzfn.zza;
        if (paramzzam.split("-", 2)[0].equals(paramString.split("-", 2)[0])) {
          return 2;
        }
        return 0;
      }
      return 3;
    }
    if ((paramBoolean) && (paramzzam == null)) {
      return 1;
    }
    return 0;
  }
  
  protected static String zzf(String paramString)
  {
    if ((!TextUtils.isEmpty(paramString)) && (!TextUtils.equals(paramString, "und"))) {
      return paramString;
    }
    return null;
  }
  
  protected static boolean zzm(int paramInt, boolean paramBoolean)
  {
    paramInt &= 0x7;
    boolean bool = false;
    if (paramInt != 4)
    {
      if (!paramBoolean) {
        return bool;
      }
      if (paramInt != 3) {
        return false;
      }
    }
    bool = true;
    return bool;
  }
  
  private static void zzs(zzvk paramzzvk, zzde paramzzde, Map paramMap)
  {
    int i = 0;
    while (i < paramzzvk.zzc)
    {
      paramMap = paramzzvk.zzb(i);
      if ((zzdb)paramzzde.zzB.get(paramMap) == null) {
        i++;
      } else {
        throw null;
      }
    }
  }
  
  private final void zzt()
  {
    synchronized (this.zze)
    {
      boolean bool = this.zzg.zzP;
      int j = 0;
      int i = j;
      if (bool)
      {
        i = j;
        if (!this.zzf)
        {
          i = j;
          if (zzfn.zza >= 32)
          {
            zzwo localzzwo = this.zzh;
            i = j;
            if (localzzwo != null)
            {
              i = j;
              if (localzzwo.zzg()) {
                i = 1;
              }
            }
          }
        }
      }
      if (i != 0) {
        zzr();
      }
      return;
    }
  }
  
  private static final Pair zzu(int paramInt, zzwz paramzzwz, int[][][] paramArrayOfInt, zzwq paramzzwq, Comparator paramComparator)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < 2; i++) {
      if (paramInt == paramzzwz.zzc(i))
      {
        zzvk localzzvk = paramzzwz.zzd(i);
        for (int j = 0; j < localzzvk.zzc; j++)
        {
          zzcz localzzcz = localzzvk.zzb(j);
          List localList = paramzzwq.zza(i, localzzcz, paramArrayOfInt[i][j]);
          int k = localzzcz.zzb;
          boolean[] arrayOfBoolean = new boolean[1];
          for (k = 0;; k++)
          {
            int m = localzzcz.zzb;
            if (k > 0) {
              break;
            }
            zzwr localzzwr1 = (zzwr)localList.get(k);
            m = localzzwr1.zzb();
            if ((arrayOfBoolean[k] == 0) && (m != 0))
            {
              Object localObject;
              if (m == 1)
              {
                localObject = zzfrr.zzm(localzzwr1);
              }
              else
              {
                localObject = new ArrayList();
                ((List)localObject).add(localzzwr1);
                for (m = k + 1;; m++)
                {
                  int n = localzzcz.zzb;
                  if (m > 0) {
                    break;
                  }
                  zzwr localzzwr2 = (zzwr)localList.get(m);
                  if ((localzzwr2.zzb() == 2) && (localzzwr1.zzc(localzzwr2)))
                  {
                    ((List)localObject).add(localzzwr2);
                    arrayOfBoolean[m] = true;
                  }
                }
              }
              localArrayList.add(localObject);
            }
          }
        }
      }
    }
    if (localArrayList.isEmpty()) {
      return null;
    }
    paramArrayOfInt = (List)Collections.max(localArrayList, paramComparator);
    paramzzwz = new int[paramArrayOfInt.size()];
    for (paramInt = 0; paramInt < paramArrayOfInt.size(); paramInt++) {
      paramzzwz[paramInt] = ((zzwr)paramArrayOfInt.get(paramInt)).zzc;
    }
    paramArrayOfInt = (zzwr)paramArrayOfInt.get(0);
    return Pair.create(new zzww(paramArrayOfInt.zzb, paramzzwz, 0), Integer.valueOf(paramArrayOfInt.zza));
  }
  
  protected final Pair zzb(zzwz paramzzwz, int[][][] paramArrayOfInt, int[] paramArrayOfInt1, zztl arg4, zzcx paramzzcx)
    throws zzia
  {
    synchronized (this.zze)
    {
      zzwj localzzwj = this.zzg;
      if ((localzzwj.zzP) && (zzfn.zza >= 32))
      {
        paramzzcx = this.zzh;
        if (paramzzcx != null)
        {
          localObject1 = Looper.myLooper();
          zzdy.zzb(localObject1);
          paramzzcx.zzb(this, (Looper)localObject1);
        }
      }
      zzww[] arrayOfzzww = new zzww[2];
      paramArrayOfInt1 = zzu(2, paramzzwz, paramArrayOfInt, new zzvx(localzzwj, paramArrayOfInt1), zzvy.zza);
      if (paramArrayOfInt1 != null) {
        arrayOfzzww[((Integer)paramArrayOfInt1.second).intValue()] = ((zzww)paramArrayOfInt1.first);
      }
      for (int i = 0; i < 2; i++) {
        if ((paramzzwz.zzc(i) == 2) && (paramzzwz.zzd(i).zzc > 0))
        {
          bool = true;
          break label160;
        }
      }
      boolean bool = false;
      label160:
      paramArrayOfInt1 = zzu(1, paramzzwz, paramArrayOfInt, new zzvv(this, localzzwj, bool), zzvw.zza);
      if (paramArrayOfInt1 != null) {
        arrayOfzzww[((Integer)paramArrayOfInt1.second).intValue()] = ((zzww)paramArrayOfInt1.first);
      }
      if (paramArrayOfInt1 == null) {
        paramArrayOfInt1 = null;
      } else {
        paramArrayOfInt1 = ((zzww)paramArrayOfInt1.first).zza.zzb(((zzww)paramArrayOfInt1.first).zzb[0]).zzd;
      }
      paramArrayOfInt1 = zzu(3, paramzzwz, paramArrayOfInt, new zzvz(localzzwj, paramArrayOfInt1), zzwa.zza);
      if (paramArrayOfInt1 != null) {
        arrayOfzzww[((Integer)paramArrayOfInt1.second).intValue()] = ((zzww)paramArrayOfInt1.first);
      }
      Object localObject2;
      for (int j = 0; j < 2; j++)
      {
        i = paramzzwz.zzc(j);
        if ((i != 2) && (i != 1) && (i != 3))
        {
          zzvk localzzvk = paramzzwz.zzd(j);
          int[][] arrayOfInt = paramArrayOfInt[j];
          int k = 0;
          ??? = null;
          int m = 0;
          paramArrayOfInt1 = null;
          while (k < localzzvk.zzc)
          {
            localObject2 = localzzvk.zzb(k);
            int[] arrayOfInt1 = arrayOfInt[k];
            i = 0;
            for (;;)
            {
              int n = ((zzcz)localObject2).zzb;
              if (i > 0) {
                break;
              }
              localObject1 = paramArrayOfInt1;
              paramzzcx = ???;
              n = m;
              if (zzm(arrayOfInt1[i], localzzwj.zzQ))
              {
                zzwe localzzwe = new zzwe(((zzcz)localObject2).zzb(i), arrayOfInt1[i]);
                if (paramArrayOfInt1 != null)
                {
                  localObject1 = paramArrayOfInt1;
                  paramzzcx = ???;
                  n = m;
                  if (localzzwe.zza(paramArrayOfInt1) <= 0) {}
                }
                else
                {
                  n = i;
                  localObject1 = localzzwe;
                  paramzzcx = (zzcx)localObject2;
                }
              }
              i++;
              paramArrayOfInt1 = (int[])localObject1;
              ??? = paramzzcx;
              m = n;
            }
            k++;
          }
          if (??? == null) {
            paramArrayOfInt1 = null;
          } else {
            paramArrayOfInt1 = new zzww(???, new int[] { m }, 0);
          }
          arrayOfzzww[j] = paramArrayOfInt1;
        }
      }
      paramArrayOfInt = new HashMap();
      for (i = 0; i < 2; i++) {
        zzs(paramzzwz.zzd(i), localzzwj, paramArrayOfInt);
      }
      zzs(paramzzwz.zze(), localzzwj, paramArrayOfInt);
      i = 0;
      while (i < 2) {
        if ((zzdb)paramArrayOfInt.get(Integer.valueOf(paramzzwz.zzc(i))) == null) {
          i++;
        } else {
          throw null;
        }
      }
      for (i = 0; i < 2; i++)
      {
        paramArrayOfInt = paramzzwz.zzd(i);
        if (localzzwj.zzg(i, paramArrayOfInt))
        {
          if ((localzzwj.zze(i, paramArrayOfInt) != null) && (null.length != 0)) {
            paramArrayOfInt = new zzww(paramArrayOfInt.zzb(0), null, 0);
          } else {
            paramArrayOfInt = null;
          }
          arrayOfzzww[i] = paramArrayOfInt;
        }
      }
      for (i = 0; i < 2; i++)
      {
        j = paramzzwz.zzc(i);
        if ((!localzzwj.zzf(i)) && (!localzzwj.zzC.contains(Integer.valueOf(j)))) {
          continue;
        }
        arrayOfzzww[i] = null;
      }
      ??? = this.zzj;
      Object localObject1 = zzp();
      paramzzcx = zzvr.zzf(arrayOfzzww);
      paramArrayOfInt1 = new zzwx[2];
      for (i = 0; i < 2; i++)
      {
        localObject2 = arrayOfzzww[i];
        if (localObject2 != null)
        {
          paramArrayOfInt = ((zzww)localObject2).zzb;
          j = paramArrayOfInt.length;
          if (j != 0)
          {
            if (j == 1) {
              paramArrayOfInt = new zzwy(((zzww)localObject2).zza, paramArrayOfInt[0], 0, 0, null);
            } else {
              paramArrayOfInt = ???.zza(((zzww)localObject2).zza, paramArrayOfInt, 0, (zzxl)localObject1, (zzfrr)paramzzcx.get(i));
            }
            paramArrayOfInt1[i] = paramArrayOfInt;
          }
        }
      }
      ??? = new zzlg[2];
      for (i = 0; i < 2; i++)
      {
        j = paramzzwz.zzc(i);
        if ((!localzzwj.zzf(i)) && (!localzzwj.zzC.contains(Integer.valueOf(j))) && ((paramzzwz.zzc(i) == -2) || (paramArrayOfInt1[i] != null))) {
          paramArrayOfInt = zzlg.zza;
        } else {
          paramArrayOfInt = null;
        }
        ???[i] = paramArrayOfInt;
      }
      bool = localzzwj.zzR;
      return Pair.create(???, paramArrayOfInt1);
    }
  }
  
  public final zzwj zzc()
  {
    synchronized (this.zze)
    {
      zzwj localzzwj = this.zzg;
      return localzzwj;
    }
  }
  
  public final void zzh()
  {
    synchronized (this.zze)
    {
      if (zzfn.zza >= 32)
      {
        zzwo localzzwo = this.zzh;
        if (localzzwo != null) {
          localzzwo.zzc();
        }
      }
      super.zzh();
      return;
    }
  }
  
  public final void zzi(zzk paramzzk)
  {
    synchronized (this.zze)
    {
      boolean bool = this.zzi.equals(paramzzk);
      this.zzi = paramzzk;
      if ((bool ^ true)) {
        zzt();
      }
      return;
    }
  }
  
  public final void zzj(zzwh arg1)
  {
    zzwj localzzwj = new zzwj(???, null);
    synchronized (this.zze)
    {
      boolean bool = this.zzg.equals(localzzwj);
      this.zzg = localzzwj;
      if ((bool ^ true))
      {
        if ((localzzwj.zzP) && (this.zza == null)) {
          zzer.zze("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        zzr();
      }
      return;
    }
  }
  
  public final boolean zzl()
  {
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzwv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */