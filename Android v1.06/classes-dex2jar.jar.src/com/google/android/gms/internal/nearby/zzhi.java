package com.google.android.gms.internal.nearby;

import android.os.ParcelUuid;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.common.util.Hex;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

public final class zzhi
{
  private static final ParcelUuid zza = ParcelUuid.fromString("00000000-0000-1000-8000-00805F9B34FB");
  private final int zzb;
  private final List<ParcelUuid> zzc;
  private final SparseArray<byte[]> zzd;
  private final Map<ParcelUuid, byte[]> zze;
  private final int zzf;
  private final String zzg;
  private final byte[] zzh;
  
  private zzhi(List<ParcelUuid> paramList, SparseArray<byte[]> paramSparseArray, Map<ParcelUuid, byte[]> paramMap, int paramInt1, int paramInt2, String paramString, byte[] paramArrayOfByte)
  {
    this.zzc = paramList;
    this.zzd = paramSparseArray;
    this.zze = paramMap;
    this.zzg = paramString;
    this.zzb = paramInt1;
    this.zzf = paramInt2;
    this.zzh = paramArrayOfByte;
  }
  
  public static zzhi zza(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    SparseArray localSparseArray = new SparseArray();
    HashMap localHashMap = new HashMap();
    int k = 0;
    int j = -1;
    Object localObject = null;
    int i = Integer.MIN_VALUE;
    try
    {
      while (k < paramArrayOfByte.length)
      {
        int n = k + 1;
        k = paramArrayOfByte[k] & 0xFF;
        if (k == 0) {
          break;
        }
        int m = k - 1;
        k = n + 1;
        n = paramArrayOfByte[n] & 0xFF;
        if (n != 22)
        {
          if (n != 255) {
            switch (n)
            {
            default: 
              break;
            case 10: 
              i = paramArrayOfByte[k];
              break;
            case 8: 
            case 9: 
              localObject = new String(zzc(paramArrayOfByte, k, m));
              break;
            case 6: 
            case 7: 
              zzb(paramArrayOfByte, k, m, 16, localArrayList);
              break;
            case 4: 
            case 5: 
              zzb(paramArrayOfByte, k, m, 4, localArrayList);
              break;
            case 2: 
            case 3: 
              zzb(paramArrayOfByte, k, m, 2, localArrayList);
              break;
            case 1: 
              j = paramArrayOfByte[k] & 0xFF;
              break;
            }
          } else {
            localSparseArray.put(((paramArrayOfByte[(k + 1)] & 0xFF) << 8) + (0xFF & paramArrayOfByte[k]), zzc(paramArrayOfByte, k + 2, m - 2));
          }
        }
        else {
          localHashMap.put(zzd(zzc(paramArrayOfByte, k, 2)), zzc(paramArrayOfByte, k + 2, m - 2));
        }
        k = m + k;
      }
      if (true == localArrayList.isEmpty()) {
        localArrayList = null;
      }
      localObject = new zzhi(localArrayList, localSparseArray, localHashMap, j, i, (String)localObject, paramArrayOfByte);
      return (zzhi)localObject;
    }
    catch (Exception localException)
    {
      paramArrayOfByte = String.valueOf(Arrays.toString(paramArrayOfByte));
      if (paramArrayOfByte.length() != 0) {
        paramArrayOfByte = "Unable to parse scan record: ".concat(paramArrayOfByte);
      } else {
        paramArrayOfByte = new String("Unable to parse scan record: ");
      }
      Log.w("BleRecord", paramArrayOfByte, localException);
    }
    return null;
  }
  
  private static int zzb(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, List<ParcelUuid> paramList)
  {
    while (paramInt2 > 0)
    {
      paramList.add(zzd(zzc(paramArrayOfByte, paramInt1, paramInt3)));
      paramInt2 -= paramInt3;
      paramInt1 += paramInt3;
    }
    return paramInt1;
  }
  
  private static byte[] zzc(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, paramInt2);
    return arrayOfByte;
  }
  
  private static ParcelUuid zzd(byte[] paramArrayOfByte)
  {
    int i = paramArrayOfByte.length;
    if ((i != 2) && (i != 4) && (i != 16))
    {
      paramArrayOfByte = new StringBuilder(38);
      paramArrayOfByte.append("uuidBytes length invalid - ");
      paramArrayOfByte.append(i);
      throw new IllegalArgumentException(paramArrayOfByte.toString());
    }
    if (i == 16)
    {
      paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte).order(ByteOrder.LITTLE_ENDIAN);
      return new ParcelUuid(new UUID(paramArrayOfByte.getLong(8), paramArrayOfByte.getLong(0)));
    }
    long l1;
    if (i == 2)
    {
      l1 = (paramArrayOfByte[0] & 0xFF) + ((paramArrayOfByte[1] & 0xFF) << 8);
    }
    else
    {
      long l3 = paramArrayOfByte[0] & 0xFF;
      long l2 = (paramArrayOfByte[1] & 0xFF) << 8;
      l1 = (paramArrayOfByte[2] & 0xFF) << 16;
      l1 = ((paramArrayOfByte[3] & 0xFF) << 24) + (l3 + l2 + l1);
    }
    paramArrayOfByte = zza;
    return new ParcelUuid(new UUID(paramArrayOfByte.getUuid().getMostSignificantBits() + (l1 << 32), paramArrayOfByte.getUuid().getLeastSignificantBits()));
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof zzhi)) {
      return false;
    }
    paramObject = (zzhi)paramObject;
    return Arrays.equals(this.zzh, ((zzhi)paramObject).zzh);
  }
  
  public final int hashCode()
  {
    return Arrays.hashCode(this.zzh);
  }
  
  public final String toString()
  {
    int k = this.zzb;
    String str = String.valueOf(this.zzc);
    Object localObject3 = this.zzd;
    StringBuilder localStringBuilder = new StringBuilder();
    int i = ((SparseArray)localObject3).size();
    Object localObject2 = "{}";
    int j = 0;
    Object localObject1;
    if (i <= 0)
    {
      localObject1 = "{}";
    }
    else
    {
      localStringBuilder.append('{');
      for (i = 0; i < ((SparseArray)localObject3).size(); i++)
      {
        if (i > 0) {
          localStringBuilder.append(", ");
        }
        int m = ((SparseArray)localObject3).keyAt(i);
        localObject1 = (byte[])((SparseArray)localObject3).valueAt(i);
        localStringBuilder.append(m);
        localStringBuilder.append('=');
        if (localObject1 == null) {
          localObject1 = null;
        } else {
          localObject1 = Hex.bytesToStringUppercase((byte[])localObject1);
        }
        localStringBuilder.append((String)localObject1);
      }
      localStringBuilder.append('}');
      localObject1 = localStringBuilder.toString();
    }
    localObject3 = this.zze;
    localStringBuilder = new StringBuilder();
    if (((Map)localObject3).keySet().size() > 0)
    {
      localStringBuilder.append('{');
      localObject3 = ((Map)localObject3).entrySet().iterator();
      for (i = j; ((Iterator)localObject3).hasNext(); i++)
      {
        localObject2 = (Map.Entry)((Iterator)localObject3).next();
        if (i > 0) {
          localStringBuilder.append(", ");
        }
        localStringBuilder.append(((Map.Entry)localObject2).getKey());
        localStringBuilder.append('=');
        localObject2 = (byte[])((Map.Entry)localObject2).getValue();
        if (localObject2 == null) {
          localObject2 = null;
        } else {
          localObject2 = Hex.bytesToStringUppercase((byte[])localObject2);
        }
        localStringBuilder.append((String)localObject2);
      }
      localStringBuilder.append('}');
      localObject2 = localStringBuilder.toString();
    }
    i = this.zzf;
    localObject3 = this.zzg;
    localStringBuilder = new StringBuilder(String.valueOf(str).length() + 139 + String.valueOf(localObject1).length() + String.valueOf(localObject2).length() + String.valueOf(localObject3).length());
    localStringBuilder.append("BleRecord [mAdvertiseFlags=");
    localStringBuilder.append(k);
    localStringBuilder.append(", mServiceUuids=");
    localStringBuilder.append(str);
    localStringBuilder.append(", mManufacturerSpecificData=");
    localStringBuilder.append((String)localObject1);
    localStringBuilder.append(", mServiceData=");
    localStringBuilder.append((String)localObject2);
    localStringBuilder.append(", mTxPowerLevel=");
    localStringBuilder.append(i);
    localStringBuilder.append(", mDeviceName=");
    localStringBuilder.append((String)localObject3);
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\nearby\zzhi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */