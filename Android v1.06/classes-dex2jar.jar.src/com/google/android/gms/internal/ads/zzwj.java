package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public final class zzwj
  extends zzde
{
  public static final zzwj zzD;
  @Deprecated
  public static final zzwj zzE;
  public static final zzn zzF = zzwf.zza;
  private static final String zzT;
  private static final String zzU;
  private static final String zzV;
  private static final String zzW;
  private static final String zzX;
  private static final String zzY;
  private static final String zzZ;
  private static final String zzaa;
  private static final String zzab;
  private static final String zzac;
  private static final String zzad;
  private static final String zzae;
  private static final String zzaf;
  private static final String zzag;
  private static final String zzah;
  private static final String zzai;
  private static final String zzaj;
  public final boolean zzG;
  public final boolean zzH;
  public final boolean zzI;
  public final boolean zzJ;
  public final boolean zzK;
  public final boolean zzL;
  public final boolean zzM;
  public final boolean zzN;
  public final boolean zzO;
  public final boolean zzP;
  public final boolean zzQ;
  public final boolean zzR;
  public final boolean zzS;
  private final SparseArray zzak;
  private final SparseBooleanArray zzal;
  
  static
  {
    zzwj localzzwj = new zzwj(new zzwh());
    zzD = localzzwj;
    zzE = localzzwj;
    zzT = Integer.toString(1000, 36);
    zzU = Integer.toString(1001, 36);
    zzV = Integer.toString(1002, 36);
    zzW = Integer.toString(1003, 36);
    zzX = Integer.toString(1004, 36);
    zzY = Integer.toString(1005, 36);
    zzZ = Integer.toString(1006, 36);
    zzaa = Integer.toString(1007, 36);
    zzab = Integer.toString(1008, 36);
    zzac = Integer.toString(1009, 36);
    zzad = Integer.toString(1010, 36);
    zzae = Integer.toString(1011, 36);
    zzaf = Integer.toString(1012, 36);
    zzag = Integer.toString(1013, 36);
    zzah = Integer.toString(1014, 36);
    zzai = Integer.toString(1015, 36);
    zzaj = Integer.toString(1016, 36);
  }
  
  private zzwj(zzwh paramzzwh)
  {
    super(paramzzwh);
    this.zzG = zzwh.zzu(paramzzwh);
    this.zzH = false;
    this.zzI = zzwh.zzq(paramzzwh);
    this.zzJ = false;
    this.zzK = zzwh.zzs(paramzzwh);
    this.zzL = false;
    this.zzM = false;
    this.zzN = false;
    this.zzO = false;
    this.zzP = zzwh.zzr(paramzzwh);
    this.zzQ = zzwh.zzt(paramzzwh);
    this.zzR = false;
    this.zzS = zzwh.zzp(paramzzwh);
    this.zzak = zzwh.zzm(paramzzwh);
    this.zzal = zzwh.zzn(paramzzwh);
  }
  
  public static zzwj zzd(Context paramContext)
  {
    return new zzwj(new zzwh(paramContext));
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      Object localObject1 = (zzwj)paramObject;
      if ((super.equals(localObject1)) && (this.zzG == ((zzwj)localObject1).zzG) && (this.zzI == ((zzwj)localObject1).zzI) && (this.zzK == ((zzwj)localObject1).zzK) && (this.zzP == ((zzwj)localObject1).zzP) && (this.zzQ == ((zzwj)localObject1).zzQ) && (this.zzS == ((zzwj)localObject1).zzS))
      {
        paramObject = this.zzal;
        Object localObject2 = ((zzwj)localObject1).zzal;
        int j = ((SparseBooleanArray)paramObject).size();
        if (((SparseBooleanArray)localObject2).size() == j)
        {
          for (int i = 0; i < j; i++) {
            if (((SparseBooleanArray)localObject2).indexOfKey(((SparseBooleanArray)paramObject).keyAt(i)) < 0) {
              break label353;
            }
          }
          paramObject = this.zzak;
          localObject1 = ((zzwj)localObject1).zzak;
          j = ((SparseArray)paramObject).size();
          if (((SparseArray)localObject1).size() == j)
          {
            for (i = 0; i < j; i++)
            {
              int k = ((SparseArray)localObject1).indexOfKey(((SparseArray)paramObject).keyAt(i));
              if (k < 0) {
                break label353;
              }
              Object localObject3 = (Map)((SparseArray)paramObject).valueAt(i);
              localObject2 = (Map)((SparseArray)localObject1).valueAt(k);
              k = ((Map)localObject3).size();
              if (((Map)localObject2).size() != k) {
                break label353;
              }
              Iterator localIterator = ((Map)localObject3).entrySet().iterator();
              while (localIterator.hasNext())
              {
                Map.Entry localEntry = (Map.Entry)localIterator.next();
                localObject3 = (zzvk)localEntry.getKey();
                if (!((Map)localObject2).containsKey(localObject3)) {
                  break label353;
                }
                if (!zzfn.zzB(localEntry.getValue(), ((Map)localObject2).get(localObject3))) {
                  break label353;
                }
              }
            }
            return true;
          }
        }
      }
    }
    label353:
    return false;
  }
  
  public final int hashCode()
  {
    return ((((((super.hashCode() + 31) * 31 + this.zzG) * 961 + this.zzI) * 961 + this.zzK) * 28629151 + this.zzP) * 31 + this.zzQ) * 961 + this.zzS;
  }
  
  public final zzwh zzc()
  {
    return new zzwh(this, null);
  }
  
  @Deprecated
  public final zzwl zze(int paramInt, zzvk paramzzvk)
  {
    Map localMap = (Map)this.zzak.get(paramInt);
    if (localMap != null) {
      return (zzwl)localMap.get(paramzzvk);
    }
    return null;
  }
  
  public final boolean zzf(int paramInt)
  {
    return this.zzal.get(paramInt);
  }
  
  @Deprecated
  public final boolean zzg(int paramInt, zzvk paramzzvk)
  {
    Map localMap = (Map)this.zzak.get(paramInt);
    return (localMap != null) && (localMap.containsKey(paramzzvk));
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzwj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */