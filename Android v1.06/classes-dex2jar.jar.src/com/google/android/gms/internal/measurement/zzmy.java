package com.google.android.gms.internal.measurement;

final class zzmy
  extends zzmx
{
  final int zza(int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3)
  {
    while ((paramInt2 < paramInt3) && (paramArrayOfByte[paramInt2] >= 0)) {
      paramInt2++;
    }
    int i = 0;
    paramInt1 = paramInt2;
    if (paramInt2 >= paramInt3) {
      paramInt1 = i;
    }
    label266:
    label268:
    for (;;)
    {
      if (paramInt1 >= paramInt3)
      {
        paramInt1 = i;
      }
      else
      {
        paramInt2 = paramInt1 + 1;
        int j = paramArrayOfByte[paramInt1];
        paramInt1 = paramInt2;
        if (j >= 0) {
          break label268;
        }
        if (j < -32) {
          if (paramInt2 < paramInt3) {
            if (j >= -62)
            {
              paramInt1 = paramInt2 + 1;
              if (paramArrayOfByte[paramInt2] <= -65) {
                continue;
              }
            }
          }
        }
        for (;;)
        {
          paramInt1 = -1;
          break label266;
          paramInt1 = j;
          break label266;
          if (j < -16)
          {
            if (paramInt2 >= paramInt3 - 1)
            {
              paramInt1 = zzna.zza(paramArrayOfByte, paramInt2, paramInt3);
              break label266;
            }
            int k = paramInt2 + 1;
            paramInt1 = paramArrayOfByte[paramInt2];
            if ((paramInt1 > -65) || ((j == -32) && (paramInt1 < -96)) || ((j == -19) && (paramInt1 >= -96))) {
              continue;
            }
            paramInt1 = k + 1;
            if (paramArrayOfByte[k] <= -65) {
              break;
            }
            continue;
          }
          if (paramInt2 >= paramInt3 - 2)
          {
            paramInt1 = zzna.zza(paramArrayOfByte, paramInt2, paramInt3);
            break label266;
          }
          paramInt1 = paramInt2 + 1;
          paramInt2 = paramArrayOfByte[paramInt2];
          if ((paramInt2 <= -65) && ((j << 28) + (paramInt2 + 112) >> 30 == 0))
          {
            paramInt2 = paramInt1 + 1;
            if (paramArrayOfByte[paramInt1] <= -65)
            {
              paramInt1 = paramInt2 + 1;
              if (paramArrayOfByte[paramInt2] <= -65) {
                break label268;
              }
            }
          }
        }
      }
      return paramInt1;
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzmy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */