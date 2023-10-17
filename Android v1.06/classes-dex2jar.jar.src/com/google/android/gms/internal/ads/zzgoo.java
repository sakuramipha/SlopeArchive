package com.google.android.gms.internal.ads;

public enum zzgoo
{
  private static final zzgoo[] zzZ;
  private static final zzgoo[] zzaa;
  private final zzgpk zzab;
  private final int zzac;
  private final Class zzad;
  
  static
  {
    zzgoo localzzgoo11 = new zzgoo("DOUBLE", 0, 0, 1, zzgpk.zze);
    zza = localzzgoo11;
    zzgoo localzzgoo26 = new zzgoo("FLOAT", 1, 1, 1, zzgpk.zzd);
    zzb = localzzgoo26;
    zzgoo localzzgoo32 = new zzgoo("INT64", 2, 2, 1, zzgpk.zzc);
    zzc = localzzgoo32;
    zzgoo localzzgoo9 = new zzgoo("UINT64", 3, 3, 1, zzgpk.zzc);
    zzd = localzzgoo9;
    zzgoo localzzgoo15 = new zzgoo("INT32", 4, 4, 1, zzgpk.zzb);
    zze = localzzgoo15;
    zzgoo localzzgoo3 = new zzgoo("FIXED64", 5, 5, 1, zzgpk.zzc);
    zzf = localzzgoo3;
    Object localObject = new zzgoo("FIXED32", 6, 6, 1, zzgpk.zzb);
    zzg = (zzgoo)localObject;
    zzgoo localzzgoo34 = new zzgoo("BOOL", 7, 7, 1, zzgpk.zzf);
    zzh = localzzgoo34;
    zzgoo localzzgoo22 = new zzgoo("STRING", 8, 8, 1, zzgpk.zzg);
    zzi = localzzgoo22;
    zzgoo localzzgoo13 = new zzgoo("MESSAGE", 9, 9, 1, zzgpk.zzj);
    zzj = localzzgoo13;
    zzgoo localzzgoo17 = new zzgoo("BYTES", 10, 10, 1, zzgpk.zzh);
    zzk = localzzgoo17;
    zzgoo localzzgoo20 = new zzgoo("UINT32", 11, 11, 1, zzgpk.zzb);
    zzl = localzzgoo20;
    zzgoo localzzgoo12 = new zzgoo("ENUM", 12, 12, 1, zzgpk.zzi);
    zzm = localzzgoo12;
    zzgoo localzzgoo8 = new zzgoo("SFIXED32", 13, 13, 1, zzgpk.zzb);
    zzn = localzzgoo8;
    zzgoo localzzgoo6 = new zzgoo("SFIXED64", 14, 14, 1, zzgpk.zzc);
    zzo = localzzgoo6;
    zzgoo localzzgoo31 = new zzgoo("SINT32", 15, 15, 1, zzgpk.zzb);
    zzp = localzzgoo31;
    zzgoo localzzgoo35 = new zzgoo("SINT64", 16, 16, 1, zzgpk.zzc);
    zzq = localzzgoo35;
    zzgoo localzzgoo27 = new zzgoo("GROUP", 17, 17, 1, zzgpk.zzj);
    zzr = localzzgoo27;
    zzgoo localzzgoo5 = new zzgoo("DOUBLE_LIST", 18, 18, 2, zzgpk.zze);
    zzs = localzzgoo5;
    zzgoo localzzgoo38 = new zzgoo("FLOAT_LIST", 19, 19, 2, zzgpk.zzd);
    zzt = localzzgoo38;
    zzgoo localzzgoo50 = new zzgoo("INT64_LIST", 20, 20, 2, zzgpk.zzc);
    zzu = localzzgoo50;
    zzgoo localzzgoo40 = new zzgoo("UINT64_LIST", 21, 21, 2, zzgpk.zzc);
    zzv = localzzgoo40;
    zzgoo localzzgoo43 = new zzgoo("INT32_LIST", 22, 22, 2, zzgpk.zzb);
    zzw = localzzgoo43;
    zzgoo localzzgoo44 = new zzgoo("FIXED64_LIST", 23, 23, 2, zzgpk.zzc);
    zzx = localzzgoo44;
    zzgoo localzzgoo48 = new zzgoo("FIXED32_LIST", 24, 24, 2, zzgpk.zzb);
    zzy = localzzgoo48;
    zzgoo localzzgoo37 = new zzgoo("BOOL_LIST", 25, 25, 2, zzgpk.zzf);
    zzz = localzzgoo37;
    zzgoo localzzgoo2 = new zzgoo("STRING_LIST", 26, 26, 2, zzgpk.zzg);
    zzA = localzzgoo2;
    zzgoo localzzgoo45 = new zzgoo("MESSAGE_LIST", 27, 27, 2, zzgpk.zzj);
    zzB = localzzgoo45;
    zzgoo localzzgoo42 = new zzgoo("BYTES_LIST", 28, 28, 2, zzgpk.zzh);
    zzC = localzzgoo42;
    zzgoo localzzgoo23 = new zzgoo("UINT32_LIST", 29, 29, 2, zzgpk.zzb);
    zzD = localzzgoo23;
    zzgoo localzzgoo41 = new zzgoo("ENUM_LIST", 30, 30, 2, zzgpk.zzi);
    zzE = localzzgoo41;
    zzgoo localzzgoo24 = new zzgoo("SFIXED32_LIST", 31, 31, 2, zzgpk.zzb);
    zzF = localzzgoo24;
    zzgoo localzzgoo7 = new zzgoo("SFIXED64_LIST", 32, 32, 2, zzgpk.zzc);
    zzG = localzzgoo7;
    zzgoo localzzgoo46 = new zzgoo("SINT32_LIST", 33, 33, 2, zzgpk.zzb);
    zzH = localzzgoo46;
    zzgoo localzzgoo28 = new zzgoo("SINT64_LIST", 34, 34, 2, zzgpk.zzc);
    zzI = localzzgoo28;
    zzgoo localzzgoo39 = new zzgoo("DOUBLE_LIST_PACKED", 35, 35, 3, zzgpk.zze);
    zzJ = localzzgoo39;
    zzgoo localzzgoo1 = new zzgoo("FLOAT_LIST_PACKED", 36, 36, 3, zzgpk.zzd);
    zzK = localzzgoo1;
    zzgoo localzzgoo47 = new zzgoo("INT64_LIST_PACKED", 37, 37, 3, zzgpk.zzc);
    zzL = localzzgoo47;
    zzgoo localzzgoo25 = new zzgoo("UINT64_LIST_PACKED", 38, 38, 3, zzgpk.zzc);
    zzM = localzzgoo25;
    zzgoo localzzgoo4 = new zzgoo("INT32_LIST_PACKED", 39, 39, 3, zzgpk.zzb);
    zzN = localzzgoo4;
    zzgoo localzzgoo10 = new zzgoo("FIXED64_LIST_PACKED", 40, 40, 3, zzgpk.zzc);
    zzO = localzzgoo10;
    zzgoo localzzgoo30 = new zzgoo("FIXED32_LIST_PACKED", 41, 41, 3, zzgpk.zzb);
    zzP = localzzgoo30;
    zzgoo localzzgoo21 = new zzgoo("BOOL_LIST_PACKED", 42, 42, 3, zzgpk.zzf);
    zzQ = localzzgoo21;
    zzgoo localzzgoo29 = new zzgoo("UINT32_LIST_PACKED", 43, 43, 3, zzgpk.zzb);
    zzR = localzzgoo29;
    zzgoo localzzgoo16 = new zzgoo("ENUM_LIST_PACKED", 44, 44, 3, zzgpk.zzi);
    zzS = localzzgoo16;
    zzgoo localzzgoo18 = new zzgoo("SFIXED32_LIST_PACKED", 45, 45, 3, zzgpk.zzb);
    zzT = localzzgoo18;
    zzgoo localzzgoo19 = new zzgoo("SFIXED64_LIST_PACKED", 46, 46, 3, zzgpk.zzc);
    zzU = localzzgoo19;
    zzgoo localzzgoo36 = new zzgoo("SINT32_LIST_PACKED", 47, 47, 3, zzgpk.zzb);
    zzV = localzzgoo36;
    zzgoo localzzgoo49 = new zzgoo("SINT64_LIST_PACKED", 48, 48, 3, zzgpk.zzc);
    zzW = localzzgoo49;
    zzgoo localzzgoo14 = new zzgoo("GROUP_LIST", 49, 49, 2, zzgpk.zzj);
    zzX = localzzgoo14;
    zzgoo localzzgoo33 = new zzgoo("MAP", 50, 50, 4, zzgpk.zza);
    zzY = localzzgoo33;
    zzaa = new zzgoo[] { localzzgoo11, localzzgoo26, localzzgoo32, localzzgoo9, localzzgoo15, localzzgoo3, localObject, localzzgoo34, localzzgoo22, localzzgoo13, localzzgoo17, localzzgoo20, localzzgoo12, localzzgoo8, localzzgoo6, localzzgoo31, localzzgoo35, localzzgoo27, localzzgoo5, localzzgoo38, localzzgoo50, localzzgoo40, localzzgoo43, localzzgoo44, localzzgoo48, localzzgoo37, localzzgoo2, localzzgoo45, localzzgoo42, localzzgoo23, localzzgoo41, localzzgoo24, localzzgoo7, localzzgoo46, localzzgoo28, localzzgoo39, localzzgoo1, localzzgoo47, localzzgoo25, localzzgoo4, localzzgoo10, localzzgoo30, localzzgoo21, localzzgoo29, localzzgoo16, localzzgoo18, localzzgoo19, localzzgoo36, localzzgoo49, localzzgoo14, localzzgoo33 };
    localObject = values();
    int j = localObject.length;
    zzZ = new zzgoo[j];
    for (int i = 0; i < j; i++)
    {
      localzzgoo1 = localObject[i];
      zzZ[localzzgoo1.zzac] = localzzgoo1;
    }
  }
  
  private zzgoo(int paramInt2, int paramInt3, zzgpk paramzzgpk)
  {
    this.zzac = paramInt2;
    this.zzab = paramzzgpk;
    paramString = zzgpk.zza;
    paramInt1 = paramInt3 - 1;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 3) {
        this.zzad = null;
      } else {
        this.zzad = paramzzgpk.zza();
      }
    }
    else {
      this.zzad = paramzzgpk.zza();
    }
    if (paramInt3 == 1) {
      paramzzgpk.ordinal();
    }
  }
  
  public final int zza()
  {
    return this.zzac;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgoo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */