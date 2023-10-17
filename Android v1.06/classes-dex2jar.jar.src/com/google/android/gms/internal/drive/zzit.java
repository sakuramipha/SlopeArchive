package com.google.android.gms.internal.drive;

import java.io.IOException;

public abstract class zzit<MessageType extends zzit<MessageType, BuilderType>, BuilderType extends zziu<MessageType, BuilderType>>
  implements zzlq
{
  private static boolean zznf = false;
  protected int zzne = 0;
  
  public final byte[] toByteArray()
  {
    try
    {
      localObject2 = new byte[zzcx()];
      localObject1 = zzjr.zzb((byte[])localObject2);
      zzb((zzjr)localObject1);
      ((zzjr)localObject1).zzcb();
      return (byte[])localObject2;
    }
    catch (IOException localIOException)
    {
      Object localObject2 = getClass().getName();
      Object localObject1 = new StringBuilder(String.valueOf(localObject2).length() + 62 + "byte array".length());
      ((StringBuilder)localObject1).append("Serializing ");
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(" to a ");
      ((StringBuilder)localObject1).append("byte array");
      ((StringBuilder)localObject1).append(" threw an IOException (should never happen).");
      throw new RuntimeException(((StringBuilder)localObject1).toString(), localIOException);
    }
  }
  
  public final zzjc zzbl()
  {
    try
    {
      localObject = zzjc.zzu(zzcx());
      zzb(((zzjk)localObject).zzby());
      localObject = ((zzjk)localObject).zzbx();
      return (zzjc)localObject;
    }
    catch (IOException localIOException)
    {
      String str = getClass().getName();
      Object localObject = new StringBuilder(String.valueOf(str).length() + 62 + "ByteString".length());
      ((StringBuilder)localObject).append("Serializing ");
      ((StringBuilder)localObject).append(str);
      ((StringBuilder)localObject).append(" to a ");
      ((StringBuilder)localObject).append("ByteString");
      ((StringBuilder)localObject).append(" threw an IOException (should never happen).");
      throw new RuntimeException(((StringBuilder)localObject).toString(), localIOException);
    }
  }
  
  int zzbm()
  {
    throw new UnsupportedOperationException();
  }
  
  void zzo(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzit.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */