package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;

public final class zzfu
  extends zzfr
{
  private final ContentResolver zza;
  private Uri zzb;
  private AssetFileDescriptor zzc;
  private FileInputStream zzd;
  private long zze;
  private boolean zzf;
  
  public zzfu(Context paramContext)
  {
    super(false);
    this.zza = paramContext.getContentResolver();
  }
  
  public final int zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws zzft
  {
    if (paramInt2 == 0) {
      return 0;
    }
    long l2 = this.zze;
    if (l2 != 0L)
    {
      int i = paramInt2;
      long l1;
      if (l2 != -1L) {
        l1 = paramInt2;
      }
      try
      {
        i = (int)Math.min(l2, l1);
        FileInputStream localFileInputStream = this.zzd;
        paramInt2 = zzfn.zza;
        paramInt1 = localFileInputStream.read(paramArrayOfByte, paramInt1, i);
        if (paramInt1 == -1) {
          return -1;
        }
        l1 = this.zze;
        if (l1 != -1L) {
          this.zze = (l1 - paramInt1);
        }
        zzg(paramInt1);
        return paramInt1;
      }
      catch (IOException paramArrayOfByte)
      {
        throw new zzft(paramArrayOfByte, 2000);
      }
    }
    return -1;
  }
  
  public final long zzb(zzgc paramzzgc)
    throws zzft
  {
    try
    {
      try
      {
        Object localObject2 = paramzzgc.zza;
        this.zzb = ((Uri)localObject2);
        zzi(paramzzgc);
        if ("content".equals(paramzzgc.zza.getScheme()))
        {
          localObject1 = new android/os/Bundle;
          ((Bundle)localObject1).<init>();
          ((Bundle)localObject1).putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
          localObject1 = this.zza.openTypedAssetFileDescriptor((Uri)localObject2, "*/*", (Bundle)localObject1);
        }
        else
        {
          localObject1 = this.zza.openAssetFileDescriptor((Uri)localObject2, "r");
        }
        this.zzc = ((AssetFileDescriptor)localObject1);
        if (localObject1 != null)
        {
          long l1 = ((AssetFileDescriptor)localObject1).getLength();
          localObject2 = new java/io/FileInputStream;
          ((FileInputStream)localObject2).<init>(((AssetFileDescriptor)localObject1).getFileDescriptor());
          this.zzd = ((FileInputStream)localObject2);
          boolean bool = l1 < -1L;
          if ((bool) && (paramzzgc.zzf > l1))
          {
            paramzzgc = new com/google/android/gms/internal/ads/zzft;
            paramzzgc.<init>(null, 2008);
            throw paramzzgc;
          }
          long l2 = ((AssetFileDescriptor)localObject1).getStartOffset();
          l2 = ((FileInputStream)localObject2).skip(paramzzgc.zzf + l2) - l2;
          if (l2 == paramzzgc.zzf)
          {
            if (!bool)
            {
              localObject1 = ((FileInputStream)localObject2).getChannel();
              l1 = ((FileChannel)localObject1).size();
              if (l1 == 0L)
              {
                this.zze = -1L;
                l1 = -1L;
              }
              else
              {
                l1 -= ((FileChannel)localObject1).position();
                this.zze = l1;
                if (l1 < 0L)
                {
                  paramzzgc = new com/google/android/gms/internal/ads/zzft;
                  paramzzgc.<init>(null, 2008);
                  throw paramzzgc;
                }
              }
            }
            else
            {
              l1 -= l2;
              this.zze = l1;
              if (l1 < 0L) {
                break label349;
              }
            }
            l2 = paramzzgc.zzg;
            if (l2 != -1L)
            {
              if (l1 == -1L) {
                l1 = l2;
              } else {
                l1 = Math.min(l1, l2);
              }
              this.zze = l1;
            }
            this.zzf = true;
            zzj(paramzzgc);
            l1 = paramzzgc.zzg;
            if (l1 != -1L) {
              return l1;
            }
            return this.zze;
            label349:
            paramzzgc = new com/google/android/gms/internal/ads/zzft;
            paramzzgc.<init>(null, 2008);
            throw paramzzgc;
          }
          paramzzgc = new com/google/android/gms/internal/ads/zzft;
          paramzzgc.<init>(null, 2008);
          throw paramzzgc;
        }
        Object localObject1 = new com/google/android/gms/internal/ads/zzft;
        paramzzgc = new java/io/IOException;
        String str = String.valueOf(localObject2);
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("Could not open file descriptor for: ");
        ((StringBuilder)localObject2).append(str);
        paramzzgc.<init>(((StringBuilder)localObject2).toString());
        try
        {
          ((zzft)localObject1).<init>(paramzzgc, 2000);
          throw ((Throwable)localObject1);
        }
        catch (IOException paramzzgc) {}
        i = 2000;
      }
      catch (IOException paramzzgc) {}
      int i;
      if (true == paramzzgc instanceof FileNotFoundException) {
        i = 2005;
      }
      throw new zzft(paramzzgc, i);
    }
    catch (zzft paramzzgc)
    {
      throw paramzzgc;
    }
  }
  
  public final Uri zzc()
  {
    return this.zzb;
  }
  
  /* Error */
  public final void zzd()
    throws zzft
  {
    // Byte code:
    //   0: aload_0
    //   1: aconst_null
    //   2: putfield 72	com/google/android/gms/internal/ads/zzfu:zzb	Landroid/net/Uri;
    //   5: aload_0
    //   6: getfield 47	com/google/android/gms/internal/ads/zzfu:zzd	Ljava/io/FileInputStream;
    //   9: astore_1
    //   10: aload_1
    //   11: ifnull +7 -> 18
    //   14: aload_1
    //   15: invokevirtual 183	java/io/FileInputStream:close	()V
    //   18: aload_0
    //   19: aconst_null
    //   20: putfield 47	com/google/android/gms/internal/ads/zzfu:zzd	Ljava/io/FileInputStream;
    //   23: aload_0
    //   24: getfield 117	com/google/android/gms/internal/ads/zzfu:zzc	Landroid/content/res/AssetFileDescriptor;
    //   27: astore_1
    //   28: aload_1
    //   29: ifnull +7 -> 36
    //   32: aload_1
    //   33: invokevirtual 184	android/content/res/AssetFileDescriptor:close	()V
    //   36: aload_0
    //   37: aconst_null
    //   38: putfield 117	com/google/android/gms/internal/ads/zzfu:zzc	Landroid/content/res/AssetFileDescriptor;
    //   41: aload_0
    //   42: getfield 155	com/google/android/gms/internal/ads/zzfu:zzf	Z
    //   45: ifeq +12 -> 57
    //   48: aload_0
    //   49: iconst_0
    //   50: putfield 155	com/google/android/gms/internal/ads/zzfu:zzf	Z
    //   53: aload_0
    //   54: invokevirtual 187	com/google/android/gms/internal/ads/zzfr:zzh	()V
    //   57: return
    //   58: astore_1
    //   59: goto +18 -> 77
    //   62: astore_2
    //   63: new 33	com/google/android/gms/internal/ads/zzft
    //   66: astore_1
    //   67: aload_1
    //   68: aload_2
    //   69: sipush 2000
    //   72: invokespecial 64	com/google/android/gms/internal/ads/zzft:<init>	(Ljava/io/IOException;I)V
    //   75: aload_1
    //   76: athrow
    //   77: aload_0
    //   78: aconst_null
    //   79: putfield 117	com/google/android/gms/internal/ads/zzfu:zzc	Landroid/content/res/AssetFileDescriptor;
    //   82: aload_0
    //   83: getfield 155	com/google/android/gms/internal/ads/zzfu:zzf	Z
    //   86: ifeq +12 -> 98
    //   89: aload_0
    //   90: iconst_0
    //   91: putfield 155	com/google/android/gms/internal/ads/zzfu:zzf	Z
    //   94: aload_0
    //   95: invokevirtual 187	com/google/android/gms/internal/ads/zzfr:zzh	()V
    //   98: aload_1
    //   99: athrow
    //   100: astore_2
    //   101: goto +18 -> 119
    //   104: astore_2
    //   105: new 33	com/google/android/gms/internal/ads/zzft
    //   108: astore_1
    //   109: aload_1
    //   110: aload_2
    //   111: sipush 2000
    //   114: invokespecial 64	com/google/android/gms/internal/ads/zzft:<init>	(Ljava/io/IOException;I)V
    //   117: aload_1
    //   118: athrow
    //   119: aload_0
    //   120: aconst_null
    //   121: putfield 47	com/google/android/gms/internal/ads/zzfu:zzd	Ljava/io/FileInputStream;
    //   124: aload_0
    //   125: getfield 117	com/google/android/gms/internal/ads/zzfu:zzc	Landroid/content/res/AssetFileDescriptor;
    //   128: astore_1
    //   129: aload_1
    //   130: ifnull +7 -> 137
    //   133: aload_1
    //   134: invokevirtual 184	android/content/res/AssetFileDescriptor:close	()V
    //   137: aload_0
    //   138: aconst_null
    //   139: putfield 117	com/google/android/gms/internal/ads/zzfu:zzc	Landroid/content/res/AssetFileDescriptor;
    //   142: aload_0
    //   143: getfield 155	com/google/android/gms/internal/ads/zzfu:zzf	Z
    //   146: ifeq +12 -> 158
    //   149: aload_0
    //   150: iconst_0
    //   151: putfield 155	com/google/android/gms/internal/ads/zzfu:zzf	Z
    //   154: aload_0
    //   155: invokevirtual 187	com/google/android/gms/internal/ads/zzfr:zzh	()V
    //   158: aload_2
    //   159: athrow
    //   160: astore_1
    //   161: goto +18 -> 179
    //   164: astore_1
    //   165: new 33	com/google/android/gms/internal/ads/zzft
    //   168: astore_2
    //   169: aload_2
    //   170: aload_1
    //   171: sipush 2000
    //   174: invokespecial 64	com/google/android/gms/internal/ads/zzft:<init>	(Ljava/io/IOException;I)V
    //   177: aload_2
    //   178: athrow
    //   179: aload_0
    //   180: aconst_null
    //   181: putfield 117	com/google/android/gms/internal/ads/zzfu:zzc	Landroid/content/res/AssetFileDescriptor;
    //   184: aload_0
    //   185: getfield 155	com/google/android/gms/internal/ads/zzfu:zzf	Z
    //   188: ifne +6 -> 194
    //   191: goto +12 -> 203
    //   194: aload_0
    //   195: iconst_0
    //   196: putfield 155	com/google/android/gms/internal/ads/zzfu:zzf	Z
    //   199: aload_0
    //   200: invokevirtual 187	com/google/android/gms/internal/ads/zzfr:zzh	()V
    //   203: aload_1
    //   204: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	205	0	this	zzfu
    //   9	24	1	localObject1	Object
    //   58	1	1	localObject2	Object
    //   66	68	1	localObject3	Object
    //   160	1	1	localObject4	Object
    //   164	40	1	localIOException1	IOException
    //   62	7	2	localIOException2	IOException
    //   100	1	2	localObject5	Object
    //   104	55	2	localIOException3	IOException
    //   168	10	2	localzzft	zzft
    // Exception table:
    //   from	to	target	type
    //   23	28	58	finally
    //   32	36	58	finally
    //   63	77	58	finally
    //   23	28	62	java/io/IOException
    //   32	36	62	java/io/IOException
    //   5	10	100	finally
    //   14	18	100	finally
    //   105	119	100	finally
    //   5	10	104	java/io/IOException
    //   14	18	104	java/io/IOException
    //   124	129	160	finally
    //   133	137	160	finally
    //   165	179	160	finally
    //   124	129	164	java/io/IOException
    //   133	137	164	java/io/IOException
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */