package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPInputStream;

public final class zzgk
  extends zzfr
  implements zzgu
{
  private final boolean zzb;
  private final int zzc;
  private final int zzd;
  private final String zze;
  private final zzgt zzf;
  private final zzgt zzg;
  private zzgc zzh;
  private HttpURLConnection zzi;
  private InputStream zzj;
  private boolean zzk;
  private int zzl;
  private long zzm;
  private long zzn;
  
  @Deprecated
  public zzgk()
  {
    this(null, 8000, 8000, false, null, null, false);
  }
  
  private zzgk(String paramString, int paramInt1, int paramInt2, boolean paramBoolean1, zzgt paramzzgt, zzfpa paramzzfpa, boolean paramBoolean2)
  {
    super(true);
    this.zze = paramString;
    this.zzc = paramInt1;
    this.zzd = paramInt2;
    this.zzb = paramBoolean1;
    this.zzf = paramzzgt;
    this.zzg = new zzgt();
  }
  
  private final HttpURLConnection zzk(URL paramURL, int paramInt, byte[] paramArrayOfByte, long paramLong1, long paramLong2, boolean paramBoolean1, boolean paramBoolean2, Map paramMap)
    throws IOException
  {
    paramArrayOfByte = (HttpURLConnection)paramURL.openConnection();
    paramArrayOfByte.setConnectTimeout(this.zzc);
    paramArrayOfByte.setReadTimeout(this.zzd);
    paramURL = new HashMap();
    paramURL.putAll(this.zzf.zza());
    paramURL.putAll(this.zzg.zza());
    paramURL.putAll(paramMap);
    paramURL = paramURL.entrySet().iterator();
    while (paramURL.hasNext())
    {
      paramMap = (Map.Entry)paramURL.next();
      paramArrayOfByte.setRequestProperty((String)paramMap.getKey(), (String)paramMap.getValue());
    }
    long l = paramLong1;
    if (paramLong1 == 0L)
    {
      if (paramLong2 == -1L) {
        paramURL = null;
      } else {
        l = 0L;
      }
    }
    else
    {
      paramURL = new StringBuilder();
      paramURL.append("bytes=");
      paramURL.append(l);
      paramURL.append("-");
      if (paramLong2 != -1L) {
        paramURL.append(l + paramLong2 - 1L);
      }
      paramURL = paramURL.toString();
    }
    if (paramURL != null) {
      paramArrayOfByte.setRequestProperty("Range", paramURL);
    }
    paramURL = this.zze;
    if (paramURL != null) {
      paramArrayOfByte.setRequestProperty("User-Agent", paramURL);
    }
    if (true != paramBoolean1) {
      paramURL = "identity";
    } else {
      paramURL = "gzip";
    }
    paramArrayOfByte.setRequestProperty("Accept-Encoding", paramURL);
    paramArrayOfByte.setInstanceFollowRedirects(paramBoolean2);
    paramArrayOfByte.setDoOutput(false);
    paramInt = zzgc.zzj;
    paramArrayOfByte.setRequestMethod("GET");
    paramArrayOfByte.connect();
    return paramArrayOfByte;
  }
  
  private final URL zzl(URL paramURL, String paramString, zzgc paramzzgc)
    throws zzgq
  {
    if (paramString != null) {
      try
      {
        Object localObject = new URL(paramURL, paramString);
        paramString = ((URL)localObject).getProtocol();
        if ((!"https".equals(paramString)) && (!"http".equals(paramString))) {
          throw new zzgq("Unsupported protocol redirect: ".concat(String.valueOf(paramString)), paramzzgc, 2001, 1);
        }
        if ((!this.zzb) && (!paramString.equals(paramURL.getProtocol())))
        {
          paramURL = paramURL.getProtocol();
          localObject = new StringBuilder();
          ((StringBuilder)localObject).append("Disallowed cross-protocol redirect (");
          ((StringBuilder)localObject).append(paramURL);
          ((StringBuilder)localObject).append(" to ");
          ((StringBuilder)localObject).append(paramString);
          ((StringBuilder)localObject).append(")");
          throw new zzgq(((StringBuilder)localObject).toString(), paramzzgc, 2001, 1);
        }
        return (URL)localObject;
      }
      catch (MalformedURLException paramURL)
      {
        throw new zzgq(paramURL, paramzzgc, 2001, 1);
      }
    }
    throw new zzgq("Null location redirect", paramzzgc, 2001, 1);
  }
  
  private final void zzm()
  {
    HttpURLConnection localHttpURLConnection = this.zzi;
    if (localHttpURLConnection != null)
    {
      try
      {
        localHttpURLConnection.disconnect();
      }
      catch (Exception localException)
      {
        zzer.zzc("DefaultHttpDataSource", "Unexpected error while disconnecting", localException);
      }
      this.zzi = null;
    }
  }
  
  public final int zza(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
    throws zzgq
  {
    int j = -1;
    if (paramInt2 == 0) {
      paramInt1 = 0;
    }
    try
    {
      long l = this.zzm;
      int i = paramInt2;
      if (l != -1L)
      {
        l -= this.zzn;
        if (l == 0L) {
          paramInt1 = j;
        } else {
          i = (int)Math.min(paramInt2, l);
        }
      }
      else
      {
        localObject = this.zzj;
        paramInt2 = zzfn.zza;
        paramInt1 = ((InputStream)localObject).read(paramArrayOfByte, paramInt1, i);
        if (paramInt1 == -1)
        {
          paramInt1 = j;
        }
        else
        {
          this.zzn += paramInt1;
          zzg(paramInt1);
        }
      }
      return paramInt1;
    }
    catch (IOException paramArrayOfByte)
    {
      Object localObject = this.zzh;
      paramInt1 = zzfn.zza;
      throw zzgq.zza(paramArrayOfByte, (zzgc)localObject, 2);
    }
  }
  
  public final long zzb(zzgc paramzzgc)
    throws zzgq
  {
    this.zzh = paramzzgc;
    this.zzn = 0L;
    this.zzm = 0L;
    zzi(paramzzgc);
    try
    {
      Object localObject1 = new java/net/URL;
      ((URL)localObject1).<init>(paramzzgc.zza.toString());
      int i = paramzzgc.zzb;
      Object localObject4 = paramzzgc.zzc;
      long l1 = paramzzgc.zzf;
      long l2 = paramzzgc.zzg;
      boolean bool = paramzzgc.zza(1);
      if (!this.zzb) {
        localObject1 = zzk((URL)localObject1, 1, null, l1, l2, bool, true, paramzzgc.zzd);
      } else {
        i = 0;
      }
      for (;;)
      {
        int j = i + 1;
        Object localObject5;
        Object localObject3;
        if (i <= 20)
        {
          localObject4 = zzk((URL)localObject1, 1, null, l1, l2, bool, false, paramzzgc.zzd);
          i = ((HttpURLConnection)localObject4).getResponseCode();
          localObject5 = ((HttpURLConnection)localObject4).getHeaderField("Location");
          if ((i != 300) && (i != 301) && (i != 302) && (i != 303) && (i != 307) && (i != 308))
          {
            localObject1 = localObject4;
            this.zzi = ((HttpURLConnection)localObject1);
            this.zzl = ((HttpURLConnection)localObject1).getResponseCode();
            String str = ((HttpURLConnection)localObject1).getResponseMessage();
            i = this.zzl;
            l2 = -1L;
            if ((i >= 200) && (i <= 299))
            {
              ((HttpURLConnection)localObject1).getContentType();
              long l3;
              if (this.zzl == 200)
              {
                l3 = paramzzgc.zzf;
                l1 = l3;
                if (l3 != 0L) {}
              }
              else
              {
                l1 = 0L;
              }
              bool = "gzip".equalsIgnoreCase(((HttpURLConnection)localObject1).getHeaderField("Content-Encoding"));
              if (!bool)
              {
                l3 = paramzzgc.zzg;
                if (l3 != -1L)
                {
                  this.zzm = l3;
                }
                else
                {
                  l3 = zzgv.zza(((HttpURLConnection)localObject1).getHeaderField("Content-Length"), ((HttpURLConnection)localObject1).getHeaderField("Content-Range"));
                  if (l3 != -1L) {
                    l2 = l3 - l1;
                  }
                  this.zzm = l2;
                }
              }
              else
              {
                this.zzm = paramzzgc.zzg;
              }
              try
              {
                this.zzj = ((HttpURLConnection)localObject1).getInputStream();
                if (bool)
                {
                  localObject1 = new java/util/zip/GZIPInputStream;
                  ((GZIPInputStream)localObject1).<init>(this.zzj);
                  this.zzj = ((InputStream)localObject1);
                }
                this.zzk = true;
                zzj(paramzzgc);
                if (l1 != 0L) {}
                try
                {
                  localObject4 = new byte['က'];
                  while (l1 > 0L)
                  {
                    i = (int)Math.min(l1, 4096L);
                    localObject1 = this.zzj;
                    j = zzfn.zza;
                    i = ((InputStream)localObject1).read((byte[])localObject4, 0, i);
                    if (!Thread.currentThread().isInterrupted())
                    {
                      if (i != -1)
                      {
                        l1 -= i;
                        zzg(i);
                      }
                      else
                      {
                        localObject1 = new com/google/android/gms/internal/ads/zzgq;
                        ((zzgq)localObject1).<init>(paramzzgc, 2008, 1);
                        throw ((Throwable)localObject1);
                      }
                    }
                    else
                    {
                      localObject1 = new com/google/android/gms/internal/ads/zzgq;
                      localObject4 = new java/io/InterruptedIOException;
                      ((InterruptedIOException)localObject4).<init>();
                      ((zzgq)localObject1).<init>((IOException)localObject4, paramzzgc, 2000, 1);
                      throw ((Throwable)localObject1);
                    }
                  }
                  return this.zzm;
                }
                catch (IOException localIOException1)
                {
                  zzm();
                  if ((localIOException1 instanceof zzgq)) {
                    throw ((zzgq)localIOException1);
                  }
                  throw new zzgq(localIOException1, paramzzgc, 2000, 1);
                }
                localObject5 = localIOException2.getHeaderFields();
              }
              catch (IOException localIOException2)
              {
                zzm();
                throw new zzgq(localIOException2, paramzzgc, 2000, 1);
              }
            }
            if (this.zzl == 416)
            {
              l1 = zzgv.zzb(localIOException2.getHeaderField("Content-Range"));
              if (paramzzgc.zzf == l1)
              {
                this.zzk = true;
                zzj(paramzzgc);
                l1 = paramzzgc.zzg;
                if (l1 != -1L) {
                  return l1;
                }
                return 0L;
              }
            }
            Object localObject2 = localIOException2.getErrorStream();
            if (localObject2 != null) {}
            try
            {
              i = zzfn.zza;
              localObject4 = new byte['က'];
              ByteArrayOutputStream localByteArrayOutputStream = new java/io/ByteArrayOutputStream;
              localByteArrayOutputStream.<init>();
              for (;;)
              {
                i = ((InputStream)localObject2).read((byte[])localObject4);
                if (i == -1) {
                  break;
                }
                localByteArrayOutputStream.write((byte[])localObject4, 0, i);
              }
              localObject2 = localByteArrayOutputStream.toByteArray();
            }
            catch (IOException localIOException3)
            {
              localObject3 = zzfn.zzf;
            }
            localObject2 = zzfn.zzf;
            zzm();
            if (this.zzl == 416) {
              localObject4 = new zzfy(2008);
            } else {
              localObject4 = null;
            }
            throw new zzgs(this.zzl, str, (IOException)localObject4, (Map)localObject5, paramzzgc, (byte[])localObject3);
          }
        }
        try
        {
          ((HttpURLConnection)localObject4).disconnect();
          localObject3 = zzl((URL)localObject3, (String)localObject5, paramzzgc);
          i = j;
        }
        catch (IOException localIOException4)
        {
          break label910;
        }
      }
      localObject3 = new com/google/android/gms/internal/ads/zzgq;
      localObject4 = new java/net/NoRouteToHostException;
      localObject5 = new java/lang/StringBuilder;
      ((StringBuilder)localObject5).<init>();
      ((StringBuilder)localObject5).append("Too many redirects: ");
      ((StringBuilder)localObject5).append(j);
      ((NoRouteToHostException)localObject4).<init>(((StringBuilder)localObject5).toString());
      ((zzgq)localObject3).<init>((IOException)localObject4, paramzzgc, 2001, 1);
      throw ((Throwable)localObject3);
    }
    catch (IOException localIOException5) {}
    label910:
    zzm();
    throw zzgq.zza(localIOException5, paramzzgc, 1);
  }
  
  public final Uri zzc()
  {
    HttpURLConnection localHttpURLConnection = this.zzi;
    if (localHttpURLConnection == null) {
      return null;
    }
    return Uri.parse(localHttpURLConnection.getURL().toString());
  }
  
  public final void zzd()
    throws zzgq
  {
    for (;;)
    {
      try
      {
        localInputStream = this.zzj;
        if (localInputStream != null)
        {
          l = this.zzm;
          if (l == -1L) {
            l = -1L;
          } else {
            l -= this.zzn;
          }
          localObject2 = this.zzi;
          if (localObject2 != null)
          {
            i = zzfn.zza;
            i = zzfn.zza;
            if (i <= 20) {}
          }
        }
      }
      finally
      {
        InputStream localInputStream;
        long l;
        Object localObject2;
        int i;
        Object localObject3;
        this.zzj = null;
        zzm();
        if (this.zzk)
        {
          this.zzk = false;
          zzh();
        }
      }
      try
      {
        localObject2 = ((HttpURLConnection)localObject2).getInputStream();
        if (l == -1L ? ((InputStream)localObject2).read() != -1 : l > 2048L)
        {
          localObject3 = localObject2.getClass().getName();
          if (("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(localObject3)) || ("com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(localObject3)))
          {
            localObject3 = localObject2.getClass().getSuperclass();
            Objects.requireNonNull(localObject3);
            localObject3 = ((Class)localObject3).getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
            ((Method)localObject3).setAccessible(true);
            ((Method)localObject3).invoke(localObject2, new Object[0]);
          }
        }
      }
      catch (Exception localException)
      {
        continue;
      }
      try
      {
        localInputStream.close();
      }
      catch (IOException localIOException)
      {
        localObject3 = new com/google/android/gms/internal/ads/zzgq;
        localObject2 = this.zzh;
        i = zzfn.zza;
        ((zzgq)localObject3).<init>(localIOException, (zzgc)localObject2, 2000, 3);
        throw ((Throwable)localObject3);
      }
    }
    this.zzj = null;
    zzm();
    if (this.zzk)
    {
      this.zzk = false;
      zzh();
    }
  }
  
  public final Map zze()
  {
    HttpURLConnection localHttpURLConnection = this.zzi;
    if (localHttpURLConnection == null) {
      return zzfru.zzd();
    }
    return new zzgi(localHttpURLConnection.getHeaderFields());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */