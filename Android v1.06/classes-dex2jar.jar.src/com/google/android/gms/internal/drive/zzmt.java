package com.google.android.gms.internal.drive;

final class zzmt
{
  static String zzc(zzjc paramzzjc)
  {
    zzmu localzzmu = new zzmu(paramzzjc);
    paramzzjc = new StringBuilder(localzzmu.size());
    for (int i = 0; i < localzzmu.size(); i++)
    {
      int j = localzzmu.zzs(i);
      if (j != 34)
      {
        if (j != 39)
        {
          if (j != 92) {
            switch (j)
            {
            default: 
              if ((j >= 32) && (j <= 126))
              {
                paramzzjc.append((char)j);
              }
              else
              {
                paramzzjc.append('\\');
                paramzzjc.append((char)((j >>> 6 & 0x3) + 48));
                paramzzjc.append((char)((j >>> 3 & 0x7) + 48));
                paramzzjc.append((char)((j & 0x7) + 48));
              }
              break;
            case 13: 
              paramzzjc.append("\\r");
              break;
            case 12: 
              paramzzjc.append("\\f");
              break;
            case 11: 
              paramzzjc.append("\\v");
              break;
            case 10: 
              paramzzjc.append("\\n");
              break;
            case 9: 
              paramzzjc.append("\\t");
              break;
            case 8: 
              paramzzjc.append("\\b");
              break;
            case 7: 
              paramzzjc.append("\\a");
              break;
            }
          } else {
            paramzzjc.append("\\\\");
          }
        }
        else {
          paramzzjc.append("\\'");
        }
      }
      else {
        paramzzjc.append("\\\"");
      }
    }
    return paramzzjc.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzmt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */