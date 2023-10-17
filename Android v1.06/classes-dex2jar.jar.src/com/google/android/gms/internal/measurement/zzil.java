package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public abstract class zzil<MessageType extends zzil<MessageType, BuilderType>, BuilderType extends zzik<MessageType, BuilderType>>
  implements zzlj
{
  protected int zzb = 0;
  
  protected static void zzbw(Iterable paramIterable, List paramList)
  {
    zzkk.zze(paramIterable);
    Object localObject;
    int j;
    int i;
    if ((paramIterable instanceof zzkr))
    {
      localObject = ((zzkr)paramIterable).zzh();
      paramIterable = (zzkr)paramList;
      j = paramList.size();
      paramList = ((List)localObject).iterator();
      while (paramList.hasNext())
      {
        localObject = paramList.next();
        if (localObject == null)
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
        if ((localObject instanceof zzjb)) {
          paramIterable.zzi((zzjb)localObject);
        } else {
          paramIterable.add((String)localObject);
        }
      }
    }
    if (!(paramIterable instanceof zzlq))
    {
      if (((paramList instanceof ArrayList)) && ((paramIterable instanceof Collection))) {
        ((ArrayList)paramList).ensureCapacity(paramList.size() + ((Collection)paramIterable).size());
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
    paramList.addAll((Collection)paramIterable);
  }
  
  int zzbu()
  {
    throw null;
  }
  
  public final zzjb zzbv()
  {
    try
    {
      int i = zzbz();
      localObject1 = zzjb.zzb;
      localObject1 = new byte[i];
      localObject2 = zzjj.zzC((byte[])localObject1);
      zzbN((zzjj)localObject2);
      ((zzjj)localObject2).zzD();
      localObject1 = new zziy((byte[])localObject1);
      return (zzjb)localObject1;
    }
    catch (IOException localIOException)
    {
      Object localObject1 = getClass().getName();
      Object localObject2 = new StringBuilder();
      ((StringBuilder)localObject2).append("Serializing ");
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append(" to a ByteString threw an IOException (should never happen).");
      throw new RuntimeException(((StringBuilder)localObject2).toString(), localIOException);
    }
  }
  
  void zzbx(int paramInt)
  {
    throw null;
  }
  
  public final byte[] zzby()
  {
    try
    {
      byte[] arrayOfByte = new byte[zzbz()];
      localObject = zzjj.zzC(arrayOfByte);
      zzbN((zzjj)localObject);
      ((zzjj)localObject).zzD();
      return arrayOfByte;
    }
    catch (IOException localIOException)
    {
      Object localObject = getClass().getName();
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append("Serializing ");
      localStringBuilder.append((String)localObject);
      localStringBuilder.append(" to a byte array threw an IOException (should never happen).");
      throw new RuntimeException(localStringBuilder.toString(), localIOException);
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */