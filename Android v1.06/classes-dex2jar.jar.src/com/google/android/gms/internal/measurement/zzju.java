package com.google.android.gms.internal.measurement;

public enum zzju
{
  private static final zzju[] zzZ;
  private static final zzju[] zzaa;
  private final zzkn zzab;
  private final int zzac;
  private final Class zzad;
  
  static
  {
    zzju localzzju48 = new zzju("DOUBLE", 0, 0, 1, zzkn.zze);
    zza = localzzju48;
    zzju localzzju34 = new zzju("FLOAT", 1, 1, 1, zzkn.zzd);
    zzb = localzzju34;
    zzju localzzju2 = new zzju("INT64", 2, 2, 1, zzkn.zzc);
    zzc = localzzju2;
    zzju localzzju26 = new zzju("UINT64", 3, 3, 1, zzkn.zzc);
    zzd = localzzju26;
    zzju localzzju33 = new zzju("INT32", 4, 4, 1, zzkn.zzb);
    zze = localzzju33;
    zzju localzzju9 = new zzju("FIXED64", 5, 5, 1, zzkn.zzc);
    zzf = localzzju9;
    zzju localzzju15 = new zzju("FIXED32", 6, 6, 1, zzkn.zzb);
    zzg = localzzju15;
    zzju localzzju27 = new zzju("BOOL", 7, 7, 1, zzkn.zzf);
    zzh = localzzju27;
    zzju localzzju13 = new zzju("STRING", 8, 8, 1, zzkn.zzg);
    zzi = localzzju13;
    zzju localzzju18 = new zzju("MESSAGE", 9, 9, 1, zzkn.zzj);
    zzj = localzzju18;
    zzju localzzju35 = new zzju("BYTES", 10, 10, 1, zzkn.zzh);
    zzk = localzzju35;
    zzju localzzju38 = new zzju("UINT32", 11, 11, 1, zzkn.zzb);
    zzl = localzzju38;
    zzju localzzju43 = new zzju("ENUM", 12, 12, 1, zzkn.zzi);
    zzm = localzzju43;
    zzju localzzju50 = new zzju("SFIXED32", 13, 13, 1, zzkn.zzb);
    zzn = localzzju50;
    zzju localzzju1 = new zzju("SFIXED64", 14, 14, 1, zzkn.zzc);
    zzo = localzzju1;
    zzju localzzju22 = new zzju("SINT32", 15, 15, 1, zzkn.zzb);
    zzp = localzzju22;
    zzju localzzju29 = new zzju("SINT64", 16, 16, 1, zzkn.zzc);
    zzq = localzzju29;
    zzju localzzju8 = new zzju("GROUP", 17, 17, 1, zzkn.zzj);
    zzr = localzzju8;
    zzju localzzju28 = new zzju("DOUBLE_LIST", 18, 18, 2, zzkn.zze);
    zzs = localzzju28;
    zzju localzzju4 = new zzju("FLOAT_LIST", 19, 19, 2, zzkn.zzd);
    zzt = localzzju4;
    zzju localzzju16 = new zzju("INT64_LIST", 20, 20, 2, zzkn.zzc);
    zzu = localzzju16;
    zzju localzzju12 = new zzju("UINT64_LIST", 21, 21, 2, zzkn.zzc);
    zzv = localzzju12;
    zzju localzzju20 = new zzju("INT32_LIST", 22, 22, 2, zzkn.zzb);
    zzw = localzzju20;
    zzju localzzju44 = new zzju("FIXED64_LIST", 23, 23, 2, zzkn.zzc);
    zzx = localzzju44;
    zzju localzzju41 = new zzju("FIXED32_LIST", 24, 24, 2, zzkn.zzb);
    zzy = localzzju41;
    zzju localzzju32 = new zzju("BOOL_LIST", 25, 25, 2, zzkn.zzf);
    zzz = localzzju32;
    zzju localzzju5 = new zzju("STRING_LIST", 26, 26, 2, zzkn.zzg);
    zzA = localzzju5;
    Object localObject = new zzju("MESSAGE_LIST", 27, 27, 2, zzkn.zzj);
    zzB = (zzju)localObject;
    zzju localzzju3 = new zzju("BYTES_LIST", 28, 28, 2, zzkn.zzh);
    zzC = localzzju3;
    zzju localzzju42 = new zzju("UINT32_LIST", 29, 29, 2, zzkn.zzb);
    zzD = localzzju42;
    zzju localzzju30 = new zzju("ENUM_LIST", 30, 30, 2, zzkn.zzi);
    zzE = localzzju30;
    zzju localzzju31 = new zzju("SFIXED32_LIST", 31, 31, 2, zzkn.zzb);
    zzF = localzzju31;
    zzju localzzju39 = new zzju("SFIXED64_LIST", 32, 32, 2, zzkn.zzc);
    zzG = localzzju39;
    zzju localzzju21 = new zzju("SINT32_LIST", 33, 33, 2, zzkn.zzb);
    zzH = localzzju21;
    zzju localzzju25 = new zzju("SINT64_LIST", 34, 34, 2, zzkn.zzc);
    zzI = localzzju25;
    zzju localzzju49 = new zzju("DOUBLE_LIST_PACKED", 35, 35, 3, zzkn.zze);
    zzJ = localzzju49;
    zzju localzzju36 = new zzju("FLOAT_LIST_PACKED", 36, 36, 3, zzkn.zzd);
    zzK = localzzju36;
    zzju localzzju46 = new zzju("INT64_LIST_PACKED", 37, 37, 3, zzkn.zzc);
    zzL = localzzju46;
    zzju localzzju7 = new zzju("UINT64_LIST_PACKED", 38, 38, 3, zzkn.zzc);
    zzM = localzzju7;
    zzju localzzju40 = new zzju("INT32_LIST_PACKED", 39, 39, 3, zzkn.zzb);
    zzN = localzzju40;
    zzju localzzju24 = new zzju("FIXED64_LIST_PACKED", 40, 40, 3, zzkn.zzc);
    zzO = localzzju24;
    zzju localzzju17 = new zzju("FIXED32_LIST_PACKED", 41, 41, 3, zzkn.zzb);
    zzP = localzzju17;
    zzju localzzju14 = new zzju("BOOL_LIST_PACKED", 42, 42, 3, zzkn.zzf);
    zzQ = localzzju14;
    zzju localzzju19 = new zzju("UINT32_LIST_PACKED", 43, 43, 3, zzkn.zzb);
    zzR = localzzju19;
    zzju localzzju45 = new zzju("ENUM_LIST_PACKED", 44, 44, 3, zzkn.zzi);
    zzS = localzzju45;
    zzju localzzju10 = new zzju("SFIXED32_LIST_PACKED", 45, 45, 3, zzkn.zzb);
    zzT = localzzju10;
    zzju localzzju6 = new zzju("SFIXED64_LIST_PACKED", 46, 46, 3, zzkn.zzc);
    zzU = localzzju6;
    zzju localzzju11 = new zzju("SINT32_LIST_PACKED", 47, 47, 3, zzkn.zzb);
    zzV = localzzju11;
    zzju localzzju47 = new zzju("SINT64_LIST_PACKED", 48, 48, 3, zzkn.zzc);
    zzW = localzzju47;
    zzju localzzju23 = new zzju("GROUP_LIST", 49, 49, 2, zzkn.zzj);
    zzX = localzzju23;
    zzju localzzju37 = new zzju("MAP", 50, 50, 4, zzkn.zza);
    zzY = localzzju37;
    zzaa = new zzju[] { localzzju48, localzzju34, localzzju2, localzzju26, localzzju33, localzzju9, localzzju15, localzzju27, localzzju13, localzzju18, localzzju35, localzzju38, localzzju43, localzzju50, localzzju1, localzzju22, localzzju29, localzzju8, localzzju28, localzzju4, localzzju16, localzzju12, localzzju20, localzzju44, localzzju41, localzzju32, localzzju5, localObject, localzzju3, localzzju42, localzzju30, localzzju31, localzzju39, localzzju21, localzzju25, localzzju49, localzzju36, localzzju46, localzzju7, localzzju40, localzzju24, localzzju17, localzzju14, localzzju19, localzzju45, localzzju10, localzzju6, localzzju11, localzzju47, localzzju23, localzzju37 };
    localObject = values();
    int j = localObject.length;
    zzZ = new zzju[j];
    for (int i = 0; i < j; i++)
    {
      localzzju1 = localObject[i];
      zzZ[localzzju1.zzac] = localzzju1;
    }
  }
  
  private zzju(int paramInt2, int paramInt3, zzkn paramzzkn)
  {
    this.zzac = paramInt2;
    this.zzab = paramzzkn;
    paramString = zzkn.zza;
    paramInt1 = paramInt3 - 1;
    if (paramInt1 != 1)
    {
      if (paramInt1 != 3) {
        this.zzad = null;
      } else {
        this.zzad = paramzzkn.zza();
      }
    }
    else {
      this.zzad = paramzzkn.zza();
    }
    if (paramInt3 == 1) {
      paramzzkn.ordinal();
    }
  }
  
  public final int zza()
  {
    return this.zzac;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzju.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */