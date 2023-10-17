package com.google.android.gms.drive.metadata.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.drive.zzhs;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class MetadataBundle
  extends AbstractSafeParcelable
  implements ReflectedParcelable
{
  public static final Parcelable.Creator<MetadataBundle> CREATOR = new zzj();
  private static final GmsLogger zzbz = new GmsLogger("MetadataBundle", "");
  private final Bundle zzjh;
  
  MetadataBundle(Bundle paramBundle)
  {
    Object localObject = (Bundle)Preconditions.checkNotNull(paramBundle);
    this.zzjh = ((Bundle)localObject);
    ((Bundle)localObject).setClassLoader(getClass().getClassLoader());
    paramBundle = new ArrayList();
    Iterator localIterator = ((Bundle)localObject).keySet().iterator();
    int i;
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      i = 0;
      if (!bool) {
        break;
      }
      localObject = (String)localIterator.next();
      if (zzf.zzf((String)localObject) == null)
      {
        paramBundle.add(localObject);
        zzbz.wfmt("MetadataBundle", "Ignored unknown metadata field in bundle: %s", new Object[] { localObject });
      }
    }
    localObject = (ArrayList)paramBundle;
    int j = paramBundle.size();
    while (i < j)
    {
      localObject = paramBundle.get(i);
      i++;
      localObject = (String)localObject;
      this.zzjh.remove((String)localObject);
    }
  }
  
  public static <T> MetadataBundle zza(MetadataField<T> paramMetadataField, T paramT)
  {
    MetadataBundle localMetadataBundle = zzbe();
    localMetadataBundle.zzb(paramMetadataField, paramT);
    return localMetadataBundle;
  }
  
  public static MetadataBundle zzbe()
  {
    return new MetadataBundle(new Bundle());
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (paramObject.getClass() == getClass()))
    {
      paramObject = (MetadataBundle)paramObject;
      Object localObject = this.zzjh.keySet();
      if (!((Set)localObject).equals(((MetadataBundle)paramObject).zzjh.keySet())) {
        return false;
      }
      localObject = ((Set)localObject).iterator();
      while (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        if (!Objects.equal(this.zzjh.get(str), ((MetadataBundle)paramObject).zzjh.get(str))) {
          return false;
        }
      }
      return true;
    }
    return false;
  }
  
  public final int hashCode()
  {
    Iterator localIterator = this.zzjh.keySet().iterator();
    String str;
    for (int i = 1; localIterator.hasNext(); i = i * 31 + this.zzjh.get(str).hashCode()) {
      str = (String)localIterator.next();
    }
    return i;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = SafeParcelWriter.beginObjectHeader(paramParcel);
    SafeParcelWriter.writeBundle(paramParcel, 2, this.zzjh, false);
    SafeParcelWriter.finishObjectHeader(paramParcel, paramInt);
  }
  
  public final <T> T zza(MetadataField<T> paramMetadataField)
  {
    return (T)paramMetadataField.zza(this.zzjh);
  }
  
  public final void zza(Context paramContext)
  {
    BitmapTeleporter localBitmapTeleporter = (BitmapTeleporter)zza(zzhs.zzkq);
    if (localBitmapTeleporter != null) {
      localBitmapTeleporter.setTempDir(paramContext.getCacheDir());
    }
  }
  
  public final <T> void zzb(MetadataField<T> paramMetadataField, T paramT)
  {
    if (zzf.zzf(paramMetadataField.getName()) == null)
    {
      paramMetadataField = String.valueOf(paramMetadataField.getName());
      if (paramMetadataField.length() != 0) {
        paramMetadataField = "Unregistered field: ".concat(paramMetadataField);
      } else {
        paramMetadataField = new String("Unregistered field: ");
      }
      throw new IllegalArgumentException(paramMetadataField);
    }
    paramMetadataField.zza(paramT, this.zzjh);
  }
  
  public final MetadataBundle zzbf()
  {
    return new MetadataBundle(new Bundle(this.zzjh));
  }
  
  public final Set<MetadataField<?>> zzbg()
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator = this.zzjh.keySet().iterator();
    while (localIterator.hasNext()) {
      localHashSet.add(zzf.zzf((String)localIterator.next()));
    }
    return localHashSet;
  }
  
  public final <T> T zzc(MetadataField<T> paramMetadataField)
  {
    Object localObject = zza(paramMetadataField);
    this.zzjh.remove(paramMetadataField.getName());
    return (T)localObject;
  }
  
  public final boolean zzd(MetadataField<?> paramMetadataField)
  {
    return this.zzjh.containsKey(paramMetadataField.getName());
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\metadata\internal\MetadataBundle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */