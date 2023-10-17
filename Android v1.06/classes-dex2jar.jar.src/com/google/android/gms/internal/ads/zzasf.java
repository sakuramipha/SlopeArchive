package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.PackageManager.OnChecksumsReadyListener;
import android.os.Build;
import android.os.Build.VERSION;
import com.google.android.gms.ads.internal.client.zzba;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;

public final class zzasf
  extends zzatf
{
  private static final zzatg zzi = new zzatg();
  private final Context zzj;
  
  public zzasf(zzarr paramzzarr, String paramString1, String paramString2, zzano paramzzano, int paramInt1, int paramInt2, Context paramContext, zzanh paramzzanh)
  {
    super(paramzzarr, "nvmQ1oBnYa1ILuQMJvjx1Mgo4XB5M+iT4lATd49U3XYe7vyBu0LOBGvU5w3i5cNm", "wZRBY7DIvhHC8r92vSELjU6e4pNwFbBY03stSUuM3+c=", paramzzano, paramInt1, 27);
    this.zzj = paramContext;
  }
  
  private final String zzc()
  {
    try
    {
      if (this.zzb.zzl() != null) {
        this.zzb.zzl().get();
      }
      Object localObject = this.zzb.zzc();
      if ((localObject != null) && (((zzaol)localObject).zzaj()))
      {
        localObject = ((zzaol)localObject).zzh();
        return (String)localObject;
      }
    }
    catch (InterruptedException|ExecutionException localInterruptedException)
    {
      for (;;) {}
    }
    return null;
  }
  
  protected final void zza()
    throws IllegalAccessException, InvocationTargetException
  {
    synchronized (zzi.zza(this.zzj.getPackageName()))
    {
      Object localObject1 = (zzapc)???.get();
      if ((localObject1 == null) || (zzaru.zzd(((zzapc)localObject1).zza)) || (((zzapc)localObject1).zza.equals("E")) || (((zzapc)localObject1).zza.equals("0000000000000000000000000000000000000000000000000000000000000000")))
      {
        int i;
        if (!zzaru.zzd(null))
        {
          i = 5;
        }
        else
        {
          if (!zzaru.zzd(null)) {
            localObject1 = Boolean.valueOf(false);
          } else {
            localObject1 = Boolean.valueOf(false);
          }
          ((Boolean)localObject1).booleanValue();
          i = 3;
        }
        boolean bool;
        if (i == 3) {
          bool = true;
        } else {
          bool = false;
        }
        localObject1 = zzbbk.zzce;
        Boolean localBoolean = (Boolean)zzba.zzc().zzb((zzbbc)localObject1);
        localObject1 = zzbbk.zzcd;
        if (((Boolean)zzba.zzc().zzb((zzbbc)localObject1)).booleanValue()) {
          localObject1 = zzb();
        } else {
          localObject1 = null;
        }
        localObject4 = localObject1;
        if (localBoolean.booleanValue())
        {
          localObject4 = localObject1;
          if (this.zzb.zzp())
          {
            localObject4 = localObject1;
            if (zzaru.zzd((String)localObject1)) {
              localObject4 = zzc();
            }
          }
        }
        localObject4 = (String)this.zzf.invoke(null, new Object[] { this.zzj, Boolean.valueOf(bool), localObject4 });
        localObject1 = new com/google/android/gms/internal/ads/zzapc;
        ((zzapc)localObject1).<init>((String)localObject4);
        if ((zzaru.zzd(((zzapc)localObject1).zza)) || (((zzapc)localObject1).zza.equals("E")))
        {
          i--;
          if (i != 3)
          {
            if (i == 4) {
              throw null;
            }
          }
          else
          {
            localObject4 = zzc();
            if (!zzaru.zzd((String)localObject4)) {
              ((zzapc)localObject1).zza = ((String)localObject4);
            }
          }
        }
        ???.set(localObject1);
      }
      localObject1 = (zzapc)???.get();
      Object localObject4 = this.zze;
      if (localObject1 != null) {}
      try
      {
        this.zze.zzx(((zzapc)localObject1).zza);
        this.zze.zzX(((zzapc)localObject1).zzb);
        this.zze.zzZ(((zzapc)localObject1).zzc);
        this.zze.zzi(((zzapc)localObject1).zzd);
        this.zze.zzw(((zzapc)localObject1).zze);
        return;
      }
      finally {}
    }
  }
  
  protected final String zzb()
  {
    Object localObject1 = null;
    try
    {
      Object localObject3 = CertificateFactory.getInstance("X.509");
      Object localObject2 = zzbbk.zzcf;
      Object localObject4 = zzaru.zzf((String)zzba.zzc().zzb((zzbbc)localObject2));
      localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      Object localObject5 = new java/io/ByteArrayInputStream;
      ((ByteArrayInputStream)localObject5).<init>((byte[])localObject4);
      ((List)localObject2).add(((CertificateFactory)localObject3).generateCertificate((InputStream)localObject5));
      if (!Build.TYPE.equals("user"))
      {
        localObject4 = zzbbk.zzcg;
        localObject5 = zzaru.zzf((String)zzba.zzc().zzb((zzbbc)localObject4));
        localObject4 = new java/io/ByteArrayInputStream;
        ((ByteArrayInputStream)localObject4).<init>((byte[])localObject5);
        ((List)localObject2).add(((CertificateFactory)localObject3).generateCertificate((InputStream)localObject4));
      }
      localObject5 = this.zzj;
      localObject3 = ((Context)localObject5).getPackageName();
      this.zzb.zzk();
      if ((Build.VERSION.SDK_INT > 30) || (Build.VERSION.CODENAME.equals("S")))
      {
        localObject4 = zzfwk.zzf();
        PackageManager localPackageManager = ((Context)localObject5).getPackageManager();
        localObject5 = new com/google/android/gms/internal/ads/zzath;
        ((zzath)localObject5).<init>((zzfwk)localObject4);
        localPackageManager.requestChecksums((String)localObject3, false, 8, (List)localObject2, (PackageManager.OnChecksumsReadyListener)localObject5);
        localObject2 = (String)((zzfwk)localObject4).get();
        localObject1 = localObject2;
      }
    }
    catch (CertificateEncodingException|PackageManager.NameNotFoundException|ExecutionException|InterruptedException|CertificateException|NoClassDefFoundError localCertificateEncodingException)
    {
      for (;;) {}
    }
    return (String)localObject1;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzasf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */