package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public final class zzceo
  extends zzcbt
  implements zzgz, zzlv
{
  public static final int zza = 0;
  private final Context zzb;
  private final zzcdz zzc;
  private final zzwv zzd;
  private final zzccb zze;
  private final WeakReference zzf;
  private final zzur zzg;
  private zzil zzh;
  private ByteBuffer zzi;
  private boolean zzj;
  private zzcbs zzk;
  private int zzl;
  private int zzm;
  private long zzn;
  private final String zzo;
  private final int zzp;
  private final Object zzq = new Object();
  private Integer zzr;
  private final ArrayList zzs;
  private volatile zzceb zzt;
  private final Set zzu = new HashSet();
  
  public zzceo(Context paramContext, zzccb paramzzccb, zzccc paramzzccc, Integer paramInteger)
  {
    this.zzb = paramContext;
    this.zze = paramzzccb;
    this.zzr = paramInteger;
    this.zzf = new WeakReference(paramzzccc);
    paramInteger = new zzcdz();
    this.zzc = paramInteger;
    zzwv localzzwv = new zzwv(paramContext);
    this.zzd = localzzwv;
    if (zze.zzc()) {
      zze.zza("SimpleExoPlayerAdapter initialize ".concat(toString()));
    }
    zzD().incrementAndGet();
    zzli localzzli = new zzli(paramContext, new zzcek(this));
    localzzli.zzb(localzzwv);
    localzzli.zza(paramInteger);
    paramInteger = localzzli.zzc();
    this.zzh = paramInteger;
    paramInteger.zzz(this);
    boolean bool = false;
    this.zzl = 0;
    this.zzn = 0L;
    this.zzm = 0;
    this.zzs = new ArrayList();
    paramInteger = null;
    this.zzt = null;
    if (paramzzccc != null) {
      paramInteger = paramzzccc.zzbl();
    }
    this.zzo = ((String)zzfov.zzd(paramInteger).zzb(""));
    int i;
    if (paramzzccc != null) {
      i = paramzzccc.zzf();
    } else {
      i = 0;
    }
    this.zzp = i;
    paramContext = zzt.zzp().zzc(paramContext, paramzzccc.zzn().zza);
    if ((this.zzj) && (this.zzi.limit() > 0))
    {
      paramContext = new byte[this.zzi.limit()];
      this.zzi.get(paramContext);
      paramContext = new zzced(paramContext);
    }
    else
    {
      paramzzccc = zzbbk.zzbR;
      if (((Boolean)zzba.zzc().zzb(paramzzccc)).booleanValue())
      {
        paramzzccc = zzbbk.zzbJ;
        if (((Boolean)zzba.zzc().zzb(paramzzccc)).booleanValue()) {}
      }
      else
      {
        if (paramzzccb.zzj) {
          break label370;
        }
      }
      bool = true;
      label370:
      if (paramzzccb.zzm) {
        paramContext = new zzcef(this, paramContext, bool);
      } else if (paramzzccb.zzi > 0) {
        paramContext = new zzceg(this, paramContext, bool);
      } else {
        paramContext = new zzceh(this, paramContext, bool);
      }
      if (paramzzccb.zzj) {
        paramzzccb = new zzcei(this, paramContext);
      } else {
        paramzzccb = paramContext;
      }
      paramzzccc = this.zzi;
      paramContext = paramzzccb;
      if (paramzzccc != null)
      {
        paramContext = paramzzccb;
        if (paramzzccc.limit() > 0)
        {
          paramContext = new byte[this.zzi.limit()];
          this.zzi.get(paramContext);
          paramContext = new zzcej(paramzzccb, paramContext);
        }
      }
    }
    paramzzccb = zzbbk.zzo;
    if (((Boolean)zzba.zzc().zzb(paramzzccb)).booleanValue()) {
      paramzzccb = zzcem.zza;
    } else {
      paramzzccb = zzcen.zza;
    }
    this.zzg = new zzur(paramContext, new zzuq(paramzzccb));
  }
  
  private final boolean zzad()
  {
    return (this.zzt != null) && (this.zzt.zzq());
  }
  
  public final void finalize()
  {
    zzD().decrementAndGet();
    if (zze.zzc()) {
      zze.zza("SimpleExoPlayerAdapter finalize ".concat(toString()));
    }
  }
  
  public final long zzA()
  {
    if (!zzad()) {
      return this.zzl;
    }
    return 0L;
  }
  
  public final long zzB()
  {
    if (!zzad()) {}
    for (;;)
    {
      synchronized (this.zzq)
      {
        long l3;
        long l1;
        Map.Entry localEntry;
        if (!this.zzs.isEmpty())
        {
          l3 = this.zzn;
          Object localObject2 = ((zzgu)this.zzs.remove(0)).zze();
          long l2 = 0L;
          l1 = l2;
          if (localObject2 != null)
          {
            localObject2 = ((Map)localObject2).entrySet().iterator();
            l1 = l2;
            if (((Iterator)localObject2).hasNext())
            {
              localEntry = (Map.Entry)((Iterator)localObject2).next();
              if (localEntry == null) {
                continue;
              }
            }
          }
        }
        try
        {
          if ((localEntry.getKey() == null) || (!zzfof.zzc("content-length", (CharSequence)localEntry.getKey())) || (localEntry.getValue() == null) || (((List)localEntry.getValue()).get(0) == null)) {
            continue;
          }
          l1 = Long.parseLong((String)((List)localEntry.getValue()).get(0));
          this.zzn = (l3 + l1);
        }
        catch (NumberFormatException localNumberFormatException) {}
        return this.zzn;
      }
      return this.zzt.zzl();
    }
  }
  
  public final Integer zzC()
  {
    return this.zzr;
  }
  
  public final void zzF(Uri[] paramArrayOfUri, String paramString)
  {
    zzG(paramArrayOfUri, paramString, ByteBuffer.allocate(0), false);
  }
  
  public final void zzG(Uri[] paramArrayOfUri, String paramString, ByteBuffer paramByteBuffer, boolean paramBoolean)
  {
    if (this.zzh != null)
    {
      this.zzi = paramByteBuffer;
      this.zzj = paramBoolean;
      int i = paramArrayOfUri.length;
      if (i == 1)
      {
        paramArrayOfUri = zzaa(paramArrayOfUri[0]);
      }
      else
      {
        paramString = new zztn[i];
        for (i = 0; i < paramArrayOfUri.length; i++) {
          paramString[i] = zzaa(paramArrayOfUri[i]);
        }
        paramArrayOfUri = new zzud(false, false, paramString);
      }
      this.zzh.zzB(paramArrayOfUri);
      this.zzh.zzp();
      zzE().incrementAndGet();
    }
  }
  
  public final void zzH()
  {
    zzil localzzil = this.zzh;
    if (localzzil != null)
    {
      localzzil.zzA(this);
      this.zzh.zzq();
      this.zzh = null;
      zzE().decrementAndGet();
    }
  }
  
  public final void zzI(long paramLong)
  {
    zzm localzzm = (zzm)this.zzh;
    localzzm.zza(localzzm.zzd(), paramLong, 5, false);
  }
  
  public final void zzJ(int paramInt)
  {
    this.zzc.zzk(paramInt);
  }
  
  public final void zzK(int paramInt)
  {
    this.zzc.zzl(paramInt);
  }
  
  public final void zzL(zzcbs paramzzcbs)
  {
    this.zzk = paramzzcbs;
  }
  
  public final void zzM(int paramInt)
  {
    this.zzc.zzm(paramInt);
  }
  
  public final void zzN(int paramInt)
  {
    this.zzc.zzn(paramInt);
  }
  
  public final void zzO(boolean paramBoolean)
  {
    this.zzh.zzr(paramBoolean);
  }
  
  public final void zzP(Integer paramInteger)
  {
    this.zzr = paramInteger;
  }
  
  public final void zzQ(boolean paramBoolean)
  {
    if (this.zzh != null) {
      for (int i = 0;; i++)
      {
        this.zzh.zzy();
        if (i >= 2) {
          break;
        }
        zzwv localzzwv = this.zzd;
        zzwh localzzwh = localzzwv.zzc().zzc();
        localzzwh.zzo(i, paramBoolean ^ true);
        localzzwv.zzj(localzzwh);
      }
    }
  }
  
  public final void zzR(int paramInt)
  {
    Iterator localIterator = this.zzu.iterator();
    while (localIterator.hasNext())
    {
      zzcdy localzzcdy = (zzcdy)((WeakReference)localIterator.next()).get();
      if (localzzcdy != null) {
        localzzcdy.zzm(paramInt);
      }
    }
  }
  
  public final void zzS(Surface paramSurface, boolean paramBoolean)
  {
    zzil localzzil = this.zzh;
    if (localzzil != null) {
      localzzil.zzs(paramSurface);
    }
  }
  
  public final void zzT(float paramFloat, boolean paramBoolean)
  {
    zzil localzzil = this.zzh;
    if (localzzil != null) {
      localzzil.zzt(paramFloat);
    }
  }
  
  public final void zzU()
  {
    this.zzh.zzu();
  }
  
  public final boolean zzV()
  {
    return this.zzh != null;
  }
  
  public final void zza(zzfx paramzzfx, zzgc paramzzgc, boolean paramBoolean, int paramInt)
  {
    this.zzl += paramInt;
  }
  
  final zztn zzaa(Uri paramUri)
  {
    Object localObject = new zzat();
    ((zzat)localObject).zzb(paramUri);
    localObject = ((zzat)localObject).zzc();
    paramUri = this.zzg;
    paramUri.zza(this.zze.zzg);
    return paramUri.zzb((zzbq)localObject);
  }
  
  public final void zzb(zzfx paramzzfx, zzgc paramzzgc, boolean paramBoolean) {}
  
  public final void zzc(zzfx paramzzfx, zzgc paramzzgc, boolean paramBoolean) {}
  
  public final void zzd(zzfx paramzzfx, zzgc arg2, boolean paramBoolean)
  {
    if ((paramzzfx instanceof zzgu)) {
      synchronized (this.zzq)
      {
        this.zzs.add((zzgu)paramzzfx);
        return;
      }
    }
    if ((paramzzfx instanceof zzceb))
    {
      this.zzt = ((zzceb)paramzzfx);
      paramzzfx = (zzccc)this.zzf.get();
      ??? = zzbbk.zzbJ;
      if ((((Boolean)zzba.zzc().zzb(???)).booleanValue()) && (paramzzfx != null) && (this.zzt.zzn()))
      {
        ??? = new HashMap();
        ???.put("gcacheHit", String.valueOf(this.zzt.zzp()));
        ???.put("gcacheDownloaded", String.valueOf(this.zzt.zzo()));
        zzs.zza.post(new zzcel(paramzzfx, ???));
      }
    }
  }
  
  public final void zze(zzlt paramzzlt, zzam paramzzam, zzht paramzzht)
  {
    paramzzlt = (zzccc)this.zzf.get();
    paramzzht = zzbbk.zzbJ;
    if ((((Boolean)zzba.zzc().zzb(paramzzht)).booleanValue()) && (paramzzlt != null) && (paramzzam != null))
    {
      paramzzht = new HashMap();
      String str = paramzzam.zzl;
      if (str != null) {
        paramzzht.put("audioMime", str);
      }
      str = paramzzam.zzm;
      if (str != null) {
        paramzzht.put("audioSampleMime", str);
      }
      paramzzam = paramzzam.zzj;
      if (paramzzam != null) {
        paramzzht.put("audioCodec", paramzzam);
      }
      paramzzlt.zzd("onMetadataEvent", paramzzht);
    }
  }
  
  public final void zzh(zzlt paramzzlt, int paramInt, long paramLong)
  {
    this.zzm += paramInt;
  }
  
  public final void zzj(zzlt paramzzlt, zztc paramzztc, zzth paramzzth, IOException paramIOException, boolean paramBoolean)
  {
    paramzzlt = this.zzk;
    if (paramzzlt != null)
    {
      if (this.zze.zzk)
      {
        paramzzlt.zzl("onLoadException", paramIOException);
        return;
      }
      paramzzlt.zzk("onLoadError", paramIOException);
    }
  }
  
  public final void zzk(zzlt paramzzlt, int paramInt)
  {
    paramzzlt = this.zzk;
    if (paramzzlt != null) {
      paramzzlt.zzm(paramInt);
    }
  }
  
  public final void zzl(zzlt paramzzlt, zzcg paramzzcg)
  {
    paramzzlt = this.zzk;
    if (paramzzlt != null) {
      paramzzlt.zzk("onPlayerError", paramzzcg);
    }
  }
  
  public final void zzn(zzlt paramzzlt, Object paramObject, long paramLong)
  {
    paramzzlt = this.zzk;
    if (paramzzlt != null) {
      paramzzlt.zzv();
    }
  }
  
  public final void zzp(zzlt paramzzlt, zzam paramzzam, zzht paramzzht)
  {
    paramzzlt = (zzccc)this.zzf.get();
    paramzzht = zzbbk.zzbJ;
    if ((((Boolean)zzba.zzc().zzb(paramzzht)).booleanValue()) && (paramzzlt != null) && (paramzzam != null))
    {
      paramzzht = new HashMap();
      paramzzht.put("frameRate", String.valueOf(paramzzam.zzt));
      paramzzht.put("bitRate", String.valueOf(paramzzam.zzi));
      int i = paramzzam.zzr;
      int j = paramzzam.zzs;
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append(i);
      ((StringBuilder)localObject).append("x");
      ((StringBuilder)localObject).append(j);
      paramzzht.put("resolution", ((StringBuilder)localObject).toString());
      localObject = paramzzam.zzl;
      if (localObject != null) {
        paramzzht.put("videoMime", localObject);
      }
      localObject = paramzzam.zzm;
      if (localObject != null) {
        paramzzht.put("videoSampleMime", localObject);
      }
      paramzzam = paramzzam.zzj;
      if (paramzzam != null) {
        paramzzht.put("videoCodec", paramzzam);
      }
      paramzzlt.zzd("onMetadataEvent", paramzzht);
    }
  }
  
  public final void zzq(zzlt paramzzlt, zzdn paramzzdn)
  {
    paramzzlt = this.zzk;
    if (paramzzlt != null) {
      paramzzlt.zzD(paramzzdn.zzc, paramzzdn.zzd);
    }
  }
  
  public final int zzr()
  {
    return this.zzm;
  }
  
  public final int zzt()
  {
    return this.zzh.zzf();
  }
  
  public final long zzv()
  {
    return this.zzh.zzi();
  }
  
  public final long zzw()
  {
    return this.zzl;
  }
  
  public final long zzx()
  {
    if (!zzad()) {
      return 0L;
    }
    if (!this.zzt.zzp()) {
      return 0L;
    }
    return Math.min(this.zzl, this.zzt.zzk());
  }
  
  public final long zzy()
  {
    return this.zzh.zzk();
  }
  
  public final long zzz()
  {
    return this.zzh.zzl();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzceo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */