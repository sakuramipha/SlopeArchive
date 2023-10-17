package com.google.android.gms.internal.common;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

public final class zzx
{
  private final zzo zza;
  private final boolean zzb;
  private final zzu zzc;
  
  private zzx(zzu paramzzu, boolean paramBoolean, zzo paramzzo, int paramInt, byte[] paramArrayOfByte)
  {
    this.zzc = paramzzu;
    this.zzb = paramBoolean;
    this.zza = paramzzo;
  }
  
  public static zzx zzc(zzo paramzzo)
  {
    return new zzx(new zzu(paramzzo), false, zzn.zza, Integer.MAX_VALUE, null);
  }
  
  private final Iterator<String> zzh(CharSequence paramCharSequence)
  {
    return new zzt(this.zzc, this, paramCharSequence);
  }
  
  public final zzx zzb()
  {
    return new zzx(this.zzc, true, this.zza, Integer.MAX_VALUE, null);
  }
  
  public final Iterable<String> zzd(CharSequence paramCharSequence)
  {
    return new zzv(this, paramCharSequence);
  }
  
  public final List<String> zzf(CharSequence paramCharSequence)
  {
    Objects.requireNonNull(paramCharSequence);
    paramCharSequence = zzh(paramCharSequence);
    ArrayList localArrayList = new ArrayList();
    while (paramCharSequence.hasNext()) {
      localArrayList.add((String)paramCharSequence.next());
    }
    return Collections.unmodifiableList(localArrayList);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\common\zzx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */