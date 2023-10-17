package com.google.android.gms.drive.metadata;

import android.os.Bundle;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.drive.metadata.internal.MetadataBundle;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public abstract class zza<T>
  implements MetadataField<T>
{
  private final String fieldName;
  private final Set<String> zziw;
  private final Set<String> zzix;
  private final int zziy;
  
  protected zza(String paramString, int paramInt)
  {
    this.fieldName = ((String)Preconditions.checkNotNull(paramString, "fieldName"));
    this.zziw = Collections.singleton(paramString);
    this.zzix = Collections.emptySet();
    this.zziy = paramInt;
  }
  
  protected zza(String paramString, Collection<String> paramCollection1, Collection<String> paramCollection2, int paramInt)
  {
    this.fieldName = ((String)Preconditions.checkNotNull(paramString, "fieldName"));
    this.zziw = Collections.unmodifiableSet(new HashSet(paramCollection1));
    this.zzix = Collections.unmodifiableSet(new HashSet(paramCollection2));
    this.zziy = paramInt;
  }
  
  public final String getName()
  {
    return this.fieldName;
  }
  
  public String toString()
  {
    return this.fieldName;
  }
  
  public final T zza(Bundle paramBundle)
  {
    Preconditions.checkNotNull(paramBundle, "bundle");
    if (paramBundle.get(this.fieldName) != null) {
      return (T)zzb(paramBundle);
    }
    return null;
  }
  
  public final T zza(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    if (zzb(paramDataHolder, paramInt1, paramInt2)) {
      return (T)zzc(paramDataHolder, paramInt1, paramInt2);
    }
    return null;
  }
  
  protected abstract void zza(Bundle paramBundle, T paramT);
  
  public final void zza(DataHolder paramDataHolder, MetadataBundle paramMetadataBundle, int paramInt1, int paramInt2)
  {
    Preconditions.checkNotNull(paramDataHolder, "dataHolder");
    Preconditions.checkNotNull(paramMetadataBundle, "bundle");
    if (zzb(paramDataHolder, paramInt1, paramInt2)) {
      paramMetadataBundle.zzb(this, zzc(paramDataHolder, paramInt1, paramInt2));
    }
  }
  
  public final void zza(T paramT, Bundle paramBundle)
  {
    Preconditions.checkNotNull(paramBundle, "bundle");
    if (paramT == null)
    {
      paramBundle.putString(this.fieldName, null);
      return;
    }
    zza(paramBundle, paramT);
  }
  
  public final Collection<String> zzaz()
  {
    return this.zziw;
  }
  
  protected abstract T zzb(Bundle paramBundle);
  
  protected boolean zzb(DataHolder paramDataHolder, int paramInt1, int paramInt2)
  {
    Iterator localIterator = this.zziw.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((paramDataHolder.isClosed()) || (!paramDataHolder.hasColumn(str)) || (paramDataHolder.hasNull(str, paramInt1, paramInt2))) {
        return false;
      }
    }
    return true;
  }
  
  protected abstract T zzc(DataHolder paramDataHolder, int paramInt1, int paramInt2);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\metadata\zza.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */