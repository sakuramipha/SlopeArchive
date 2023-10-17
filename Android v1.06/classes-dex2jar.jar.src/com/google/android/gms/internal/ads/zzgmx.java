package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public abstract class zzgmx<MessageType extends zzgmx<MessageType, BuilderType>, BuilderType extends zzgmw<MessageType, BuilderType>>
  implements zzgqg
{
  protected int zza = 0;
  
  protected static void zzav(Iterable paramIterable, List paramList)
  {
    Object localObject = zzgpg.zzd;
    Objects.requireNonNull(paramIterable);
    int j;
    int i;
    if ((paramIterable instanceof zzgpo))
    {
      localObject = ((zzgpo)paramIterable).zzh();
      paramIterable = (zzgpo)paramList;
      j = paramList.size();
      localObject = ((List)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramList = ((Iterator)localObject).next();
        if (paramList == null)
        {
          i = paramIterable.size();
          paramList = new StringBuilder();
          paramList.append("Element at index ");
          paramList.append(i - j);
          paramList.append(" is null.");
          paramList = paramList.toString();
          i = paramIterable.size();
          for (;;)
          {
            i--;
            if (i < j) {
              break;
            }
            paramIterable.remove(i);
          }
          throw new NullPointerException(paramList);
        }
        if ((paramList instanceof zzgno)) {
          paramIterable.zzi((zzgno)paramList);
        } else {
          paramIterable.add((String)paramList);
        }
      }
    }
    if (!(paramIterable instanceof zzgqn))
    {
      if ((paramList instanceof ArrayList)) {
        ((ArrayList)paramList).ensureCapacity(paramList.size() + paramIterable.size());
      }
      j = paramList.size();
      paramIterable = paramIterable.iterator();
      while (paramIterable.hasNext())
      {
        localObject = paramIterable.next();
        if (localObject == null)
        {
          i = paramList.size();
          paramIterable = new StringBuilder();
          paramIterable.append("Element at index ");
          paramIterable.append(i - j);
          paramIterable.append(" is null.");
          paramIterable = paramIterable.toString();
          i = paramList.size();
          for (;;)
          {
            i--;
            if (i < j) {
              break;
            }
            paramList.remove(i);
          }
          throw new NullPointerException(paramIterable);
        }
        paramList.add(localObject);
      }
      return;
    }
    paramList.addAll(paramIterable);
  }
  
  int zzat(zzgqz paramzzgqz)
  {
    throw null;
  }
  
  public final zzgno zzau()
  {
    try
    {
      int i = zzaz();
      Object localObject1 = zzgno.zzb;
      localObject2 = new byte[i];
      localObject1 = zzgod.zzC((byte[])localObject2, 0, i);
      zzaW((zzgod)localObject1);
      ((zzgod)localObject1).zzD();
      localObject1 = new zzgnk((byte[])localObject2);
      return (zzgno)localObject1;
    }
    catch (IOException localIOException)
    {
      Object localObject2 = getClass().getName();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Serializing ");
      localStringBuilder.append((String)localObject2);
      localStringBuilder.append(" to a ByteString threw an IOException (should never happen).");
      throw new RuntimeException(localStringBuilder.toString(), localIOException);
    }
  }
  
  public final void zzaw(OutputStream paramOutputStream)
    throws IOException
  {
    int j = zzaz();
    int i = zzgod.zzf;
    i = j;
    if (j > 4096) {
      i = 4096;
    }
    paramOutputStream = new zzgob(paramOutputStream, i);
    zzaW(paramOutputStream);
    paramOutputStream.zzI();
  }
  
  public final byte[] zzax()
  {
    try
    {
      int i = zzaz();
      byte[] arrayOfByte = new byte[i];
      localObject = zzgod.zzC(arrayOfByte, 0, i);
      zzaW((zzgod)localObject);
      ((zzgod)localObject).zzD();
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      String str = getClass().getName();
      Object localObject = new StringBuilder();
      ((StringBuilder)localObject).append("Serializing ");
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append(" to a byte array threw an IOException (should never happen).");
      throw new RuntimeException(((StringBuilder)localObject).toString(), localIOException);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgmx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */