package com.google.android.gms.internal.ads;

import android.util.Base64OutputStream;
import java.io.IOException;
import java.text.Normalizer;
import java.text.Normalizer.Form;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

public final class zzavk
{
  private final zzauz zza;
  private final int zzb;
  private String zzc;
  private final int zzd;
  
  public zzavk(int paramInt1, int paramInt2, int paramInt3)
  {
    this.zzb = paramInt1;
    if (paramInt2 <= 64)
    {
      paramInt1 = paramInt2;
      if (paramInt2 >= 0) {}
    }
    else
    {
      paramInt1 = 64;
    }
    if (paramInt3 <= 0) {
      this.zzd = 1;
    } else {
      this.zzd = paramInt3;
    }
    this.zza = new zzavi(paramInt1);
  }
  
  public final String zza(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    Collections.sort(paramArrayList2, new zzavj(this));
    HashSet localHashSet = new HashSet();
    Object localObject1;
    for (int j = 0; j < paramArrayList2.size(); j++)
    {
      String[] arrayOfString = Normalizer.normalize((CharSequence)paramArrayList1.get(((zzauy)paramArrayList2.get(j)).zze()), Normalizer.Form.NFKC).toLowerCase(Locale.US).split("\n");
      if (arrayOfString.length != 0) {
        for (int k = 0; k < arrayOfString.length; k++)
        {
          Object localObject3 = arrayOfString[k];
          Object localObject2 = localObject3;
          int i;
          int m;
          int n;
          if (((String)localObject3).contains("'"))
          {
            localObject1 = new StringBuilder((String)localObject3);
            i = 1;
            m = 0;
            for (;;)
            {
              int i1 = i + 2;
              if (i1 > ((StringBuilder)localObject1).length()) {
                break;
              }
              n = i;
              if (((StringBuilder)localObject1).charAt(i) == '\'')
              {
                if (((StringBuilder)localObject1).charAt(i - 1) != ' ')
                {
                  m = i + 1;
                  if (((((StringBuilder)localObject1).charAt(m) == 's') || (((StringBuilder)localObject1).charAt(m) == 'S')) && ((i1 == ((StringBuilder)localObject1).length()) || (((StringBuilder)localObject1).charAt(i1) == ' ')))
                  {
                    ((StringBuilder)localObject1).insert(i, ' ');
                    i = i1;
                    break label244;
                  }
                }
                ((StringBuilder)localObject1).setCharAt(i, ' ');
                label244:
                m = 1;
                n = i;
              }
              i = n + 1;
            }
            if (m != 0) {
              localObject1 = ((StringBuilder)localObject1).toString();
            } else {
              localObject1 = null;
            }
            localObject2 = localObject3;
            if (localObject1 != null)
            {
              this.zzc = ((String)localObject1);
              localObject2 = localObject1;
            }
          }
          localObject3 = zzavd.zzb((String)localObject2, true);
          if (localObject3.length >= this.zzd)
          {
            for (i = 0; i < localObject3.length; i++)
            {
              localObject1 = "";
              for (m = 0; m < this.zzd; m++)
              {
                n = i + m;
                if (n >= localObject3.length) {
                  break label423;
                }
                localObject2 = localObject1;
                if (m > 0) {
                  localObject2 = ((String)localObject1).concat(" ");
                }
                localObject1 = ((String)localObject2).concat(String.valueOf(localObject3[n]));
              }
              localHashSet.add(localObject1);
              if (localHashSet.size() >= this.zzb) {
                break label450;
              }
            }
            label423:
            if (localHashSet.size() >= this.zzb) {
              break label450;
            }
          }
        }
      }
    }
    label450:
    paramArrayList1 = new zzavb();
    paramArrayList2 = localHashSet.iterator();
    for (;;)
    {
      if (paramArrayList2.hasNext())
      {
        localObject1 = (String)paramArrayList2.next();
        try
        {
          localObject1 = this.zza.zzb((String)localObject1);
          paramArrayList1.zzb.write((byte[])localObject1);
        }
        catch (IOException paramArrayList2)
        {
          zzbzt.zzh("Error while writing hash to byteStream", paramArrayList2);
        }
      }
    }
    return paramArrayList1.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzavk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */