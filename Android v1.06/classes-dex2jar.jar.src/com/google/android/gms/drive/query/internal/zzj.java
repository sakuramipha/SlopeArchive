package com.google.android.gms.drive.query.internal;

import com.google.android.gms.drive.metadata.MetadataField;
import com.google.android.gms.drive.metadata.zzb;
import java.util.List;

public abstract interface zzj<F>
{
  public abstract <T> F zza(zzb<T> paramzzb, T paramT);
  
  public abstract <T> F zza(zzx paramzzx, MetadataField<T> paramMetadataField, T paramT);
  
  public abstract F zza(zzx paramzzx, List<F> paramList);
  
  public abstract F zza(F paramF);
  
  public abstract F zzbj();
  
  public abstract F zzbk();
  
  public abstract <T> F zzc(MetadataField<T> paramMetadataField, T paramT);
  
  public abstract F zze(MetadataField<?> paramMetadataField);
  
  public abstract F zzi(String paramString);
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\drive\query\internal\zzj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */