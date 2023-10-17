package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class zzamq
  implements zzamr
{
  private static final Logger zzb = Logger.getLogger(zzamq.class.getName());
  final ThreadLocal zza = new zzamp(this);
  
  public abstract zzamu zza(String paramString1, byte[] paramArrayOfByte, String paramString2);
  
  public final zzamu zzb(zzgva paramzzgva, zzamv paramzzamv)
    throws IOException
  {
    long l1 = paramzzgva.zzb();
    ((ByteBuffer)this.zza.get()).rewind().limit(8);
    int i;
    do
    {
      i = paramzzgva.zza((ByteBuffer)this.zza.get());
      if (i == 8) {
        break;
      }
    } while (i >= 0);
    paramzzgva.zze(l1);
    throw new EOFException();
    ((ByteBuffer)this.zza.get()).rewind();
    l1 = zzamt.zze((ByteBuffer)this.zza.get());
    Object localObject1 = null;
    if ((l1 < 8L) && (l1 > 1L))
    {
      localObject1 = zzb;
      paramzzamv = Level.SEVERE;
      paramzzgva = new StringBuilder(80);
      paramzzgva.append("Plausibility check failed: size < 8 (size = ");
      paramzzgva.append(l1);
      paramzzgva.append("). Stop parsing!");
      ((Logger)localObject1).logp(paramzzamv, "com.coremedia.iso.AbstractBoxParser", "parseBox", paramzzgva.toString());
      return null;
    }
    Object localObject2 = (ByteBuffer)this.zza.get();
    Object localObject3 = new byte[4];
    ((ByteBuffer)localObject2).get((byte[])localObject3);
    try
    {
      localObject3 = new String((byte[])localObject3, "ISO-8859-1");
      if (l1 == 1L)
      {
        ((ByteBuffer)this.zza.get()).limit(16);
        paramzzgva.zza((ByteBuffer)this.zza.get());
        ((ByteBuffer)this.zza.get()).position(8);
        l1 = zzamt.zzf((ByteBuffer)this.zza.get()) - 16L;
      }
      else if (l1 == 0L)
      {
        l1 = paramzzgva.zzc() - paramzzgva.zzb();
      }
      else
      {
        l1 -= 8L;
      }
      long l2 = l1;
      if ("uuid".equals(localObject3))
      {
        ((ByteBuffer)this.zza.get()).limit(((ByteBuffer)this.zza.get()).limit() + 16);
        paramzzgva.zza((ByteBuffer)this.zza.get());
        localObject1 = new byte[16];
        for (i = ((ByteBuffer)this.zza.get()).position() - 16; i < ((ByteBuffer)this.zza.get()).position(); i++) {
          localObject1[(i - (((ByteBuffer)this.zza.get()).position() - 16))] = ((ByteBuffer)this.zza.get()).get(i);
        }
        l2 = l1 - 16L;
      }
      if ((paramzzamv instanceof zzamu)) {
        localObject2 = ((zzamu)paramzzamv).zza();
      } else {
        localObject2 = "";
      }
      localObject1 = zza((String)localObject3, (byte[])localObject1, (String)localObject2);
      ((zzamu)localObject1).zzc(paramzzamv);
      ((ByteBuffer)this.zza.get()).rewind();
      ((zzamu)localObject1).zzb(paramzzgva, (ByteBuffer)this.zza.get(), l2, this);
      return (zzamu)localObject1;
    }
    catch (UnsupportedEncodingException paramzzgva)
    {
      throw new RuntimeException(paramzzgva);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzamq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */