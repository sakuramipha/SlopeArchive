package com.google.android.gms.drive.metadata.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.internal.drive.zzhs;
import com.google.android.gms.internal.drive.zzid;
import com.google.android.gms.internal.drive.zzif;
import com.google.android.gms.internal.drive.zzin;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class zzf
{
  private static final Map<String, MetadataField<?>> zzjf = new HashMap();
  private static final Map<String, zzg> zzjg = new HashMap();
  
  static
  {
    zzb(zzhs.zzjl);
    zzb(zzhs.zzkr);
    zzb(zzhs.zzki);
    zzb(zzhs.zzkp);
    zzb(zzhs.zzks);
    zzb(zzhs.zzjy);
    zzb(zzhs.zzjx);
    zzb(zzhs.zzjz);
    zzb(zzhs.zzka);
    zzb(zzhs.zzkb);
    zzb(zzhs.zzjv);
    zzb(zzhs.zzkd);
    zzb(zzhs.zzke);
    zzb(zzhs.zzkf);
    zzb(zzhs.zzkn);
    zzb(zzhs.zzjm);
    zzb(zzhs.zzkk);
    zzb(zzhs.zzjo);
    zzb(zzhs.zzjw);
    zzb(zzhs.zzjp);
    zzb(zzhs.zzjq);
    zzb(zzhs.zzjr);
    zzb(zzhs.zzjs);
    zzb(zzhs.zzkh);
    zzb(zzhs.zzkc);
    zzb(zzhs.zzkj);
    zzb(zzhs.zzkl);
    zzb(zzhs.zzkm);
    zzb(zzhs.zzko);
    zzb(zzhs.zzkt);
    zzb(zzhs.zzku);
    zzb(zzhs.zzju);
    zzb(zzhs.zzjt);
    zzb(zzhs.zzkq);
    zzb(zzhs.zzkg);
    zzb(zzhs.zzjn);
    zzb(zzhs.zzkv);
    zzb(zzhs.zzkw);
    zzb(zzhs.zzkx);
    zzb(zzhs.zzky);
    zzb(zzhs.zzkz);
    zzb(zzhs.zzla);
    zzb(zzhs.zzlb);
    zzb(zzif.zzld);
    zzb(zzif.zzlf);
    zzb(zzif.zzlg);
    zzb(zzif.zzlh);
    zzb(zzif.zzle);
    zzb(zzif.zzli);
    zzb(zzin.zzlk);
    zzb(zzin.zzll);
    zza(zzo.zzjk);
    zza(zzid.zzlc);
  }
  
  public static void zza(DataHolder paramDataHolder)
  {
    Iterator localIterator = zzjg.values().iterator();
    while (localIterator.hasNext()) {
      ((zzg)localIterator.next()).zzb(paramDataHolder);
    }
  }
  
  private static void zza(zzg paramzzg)
  {
    if (zzjg.put(paramzzg.zzbd(), paramzzg) == null) {
      return;
    }
    String str = paramzzg.zzbd();
    paramzzg = new StringBuilder(String.valueOf(str).length() + 46);
    paramzzg.append("A cleaner for key ");
    paramzzg.append(str);
    paramzzg.append(" has already been registered");
    throw new IllegalStateException(paramzzg.toString());
  }
  
  private static void zzb(MetadataField<?> paramMetadataField)
  {
    Map localMap = zzjf;
    if (localMap.containsKey(paramMetadataField.getName()))
    {
      paramMetadataField = String.valueOf(paramMetadataField.getName());
      if (paramMetadataField.length() != 0) {
        paramMetadataField = "Duplicate field name registered: ".concat(paramMetadataField);
      } else {
        paramMetadataField = new String("Duplicate field name registered: ");
      }
      throw new IllegalArgumentException(paramMetadataField);
    }
    localMap.put(paramMetadataField.getName(), paramMetadataField);
  }
  
  public static Collection<MetadataField<?>> zzbc()
  {
    return Collections.unmodifiableCollection(zzjf.values());
  }
  
  public static MetadataField<?> zzf(String paramString)
  {
    return (MetadataField)zzjf.get(paramString);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\metadata\internal\zzf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */