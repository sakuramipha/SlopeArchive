package com.google.android.gms.internal.drive;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

final class zzmj
  extends zzmi<FieldDescriptorType, Object>
{
  zzmj(int paramInt)
  {
    super(paramInt, null);
  }
  
  public final void zzbp()
  {
    if (!isImmutable())
    {
      for (int i = 0; i < zzer(); i++)
      {
        localObject = zzaw(i);
        if (((zzkd)((Map.Entry)localObject).getKey()).zzcs()) {
          ((Map.Entry)localObject).setValue(Collections.unmodifiableList((List)((Map.Entry)localObject).getValue()));
        }
      }
      Object localObject = zzes().iterator();
      while (((Iterator)localObject).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
        if (((zzkd)localEntry.getKey()).zzcs()) {
          localEntry.setValue(Collections.unmodifiableList((List)localEntry.getValue()));
        }
      }
    }
    super.zzbp();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzmj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */