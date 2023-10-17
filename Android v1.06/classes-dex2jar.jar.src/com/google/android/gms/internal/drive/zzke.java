package com.google.android.gms.internal.drive;

import java.lang.reflect.Type;

public enum zzke
{
  private static final zzke[] zzrb;
  private static final Type[] zzrc;
  private static final zzke[] zzrd;
  private final int id;
  private final zzks zzqx;
  private final zzkg zzqy;
  private final Class<?> zzqz;
  private final boolean zzra;
  
  static
  {
    zzke localzzke42 = new zzke("DOUBLE", 0, 0, zzkg.zzrg, zzks.zzsv);
    zzoy = localzzke42;
    zzke localzzke13 = new zzke("FLOAT", 1, 1, zzkg.zzrg, zzks.zzsu);
    zzoz = localzzke13;
    zzke localzzke17 = new zzke("INT64", 2, 2, zzkg.zzrg, zzks.zzst);
    zzpa = localzzke17;
    zzke localzzke4 = new zzke("UINT64", 3, 3, zzkg.zzrg, zzks.zzst);
    zzpb = localzzke4;
    zzke localzzke33 = new zzke("INT32", 4, 4, zzkg.zzrg, zzks.zzss);
    zzpc = localzzke33;
    zzke localzzke36 = new zzke("FIXED64", 5, 5, zzkg.zzrg, zzks.zzst);
    zzpd = localzzke36;
    zzke localzzke35 = new zzke("FIXED32", 6, 6, zzkg.zzrg, zzks.zzss);
    zzpe = localzzke35;
    zzke localzzke38 = new zzke("BOOL", 7, 7, zzkg.zzrg, zzks.zzsw);
    zzpf = localzzke38;
    zzke localzzke34 = new zzke("STRING", 8, 8, zzkg.zzrg, zzks.zzsx);
    zzpg = localzzke34;
    zzke localzzke16 = new zzke("MESSAGE", 9, 9, zzkg.zzrg, zzks.zzta);
    zzph = localzzke16;
    zzke localzzke12 = new zzke("BYTES", 10, 10, zzkg.zzrg, zzks.zzsy);
    zzpi = localzzke12;
    zzke localzzke21 = new zzke("UINT32", 11, 11, zzkg.zzrg, zzks.zzss);
    zzpj = localzzke21;
    zzke localzzke32 = new zzke("ENUM", 12, 12, zzkg.zzrg, zzks.zzsz);
    zzpk = localzzke32;
    zzke localzzke44 = new zzke("SFIXED32", 13, 13, zzkg.zzrg, zzks.zzss);
    zzpl = localzzke44;
    zzke localzzke48 = new zzke("SFIXED64", 14, 14, zzkg.zzrg, zzks.zzst);
    zzpm = localzzke48;
    zzke localzzke22 = new zzke("SINT32", 15, 15, zzkg.zzrg, zzks.zzss);
    zzpn = localzzke22;
    zzke localzzke20 = new zzke("SINT64", 16, 16, zzkg.zzrg, zzks.zzst);
    zzpo = localzzke20;
    zzke localzzke9 = new zzke("GROUP", 17, 17, zzkg.zzrg, zzks.zzta);
    zzpp = localzzke9;
    zzke localzzke25 = new zzke("DOUBLE_LIST", 18, 18, zzkg.zzrh, zzks.zzsv);
    zzpq = localzzke25;
    zzke localzzke1 = new zzke("FLOAT_LIST", 19, 19, zzkg.zzrh, zzks.zzsu);
    zzpr = localzzke1;
    zzke localzzke40 = new zzke("INT64_LIST", 20, 20, zzkg.zzrh, zzks.zzst);
    zzps = localzzke40;
    zzke localzzke11 = new zzke("UINT64_LIST", 21, 21, zzkg.zzrh, zzks.zzst);
    zzpt = localzzke11;
    zzke localzzke5 = new zzke("INT32_LIST", 22, 22, zzkg.zzrh, zzks.zzss);
    zzpu = localzzke5;
    zzke localzzke8 = new zzke("FIXED64_LIST", 23, 23, zzkg.zzrh, zzks.zzst);
    zzpv = localzzke8;
    zzke localzzke15 = new zzke("FIXED32_LIST", 24, 24, zzkg.zzrh, zzks.zzss);
    zzpw = localzzke15;
    zzke localzzke47 = new zzke("BOOL_LIST", 25, 25, zzkg.zzrh, zzks.zzsw);
    zzpx = localzzke47;
    zzke localzzke29 = new zzke("STRING_LIST", 26, 26, zzkg.zzrh, zzks.zzsx);
    zzpy = localzzke29;
    zzke localzzke18 = new zzke("MESSAGE_LIST", 27, 27, zzkg.zzrh, zzks.zzta);
    zzpz = localzzke18;
    zzke localzzke39 = new zzke("BYTES_LIST", 28, 28, zzkg.zzrh, zzks.zzsy);
    zzqa = localzzke39;
    zzke localzzke30 = new zzke("UINT32_LIST", 29, 29, zzkg.zzrh, zzks.zzss);
    zzqb = localzzke30;
    zzke localzzke49 = new zzke("ENUM_LIST", 30, 30, zzkg.zzrh, zzks.zzsz);
    zzqc = localzzke49;
    zzke localzzke10 = new zzke("SFIXED32_LIST", 31, 31, zzkg.zzrh, zzks.zzss);
    zzqd = localzzke10;
    zzke localzzke24 = new zzke("SFIXED64_LIST", 32, 32, zzkg.zzrh, zzks.zzst);
    zzqe = localzzke24;
    zzke localzzke28 = new zzke("SINT32_LIST", 33, 33, zzkg.zzrh, zzks.zzss);
    zzqf = localzzke28;
    zzke localzzke27 = new zzke("SINT64_LIST", 34, 34, zzkg.zzrh, zzks.zzst);
    zzqg = localzzke27;
    zzke localzzke41 = new zzke("DOUBLE_LIST_PACKED", 35, 35, zzkg.zzri, zzks.zzsv);
    zzqh = localzzke41;
    zzke localzzke19 = new zzke("FLOAT_LIST_PACKED", 36, 36, zzkg.zzri, zzks.zzsu);
    zzqi = localzzke19;
    zzke localzzke23 = new zzke("INT64_LIST_PACKED", 37, 37, zzkg.zzri, zzks.zzst);
    zzqj = localzzke23;
    zzke localzzke2 = new zzke("UINT64_LIST_PACKED", 38, 38, zzkg.zzri, zzks.zzst);
    zzqk = localzzke2;
    zzke localzzke31 = new zzke("INT32_LIST_PACKED", 39, 39, zzkg.zzri, zzks.zzss);
    zzql = localzzke31;
    zzke localzzke14 = new zzke("FIXED64_LIST_PACKED", 40, 40, zzkg.zzri, zzks.zzst);
    zzqm = localzzke14;
    zzke localzzke7 = new zzke("FIXED32_LIST_PACKED", 41, 41, zzkg.zzri, zzks.zzss);
    zzqn = localzzke7;
    zzke localzzke45 = new zzke("BOOL_LIST_PACKED", 42, 42, zzkg.zzri, zzks.zzsw);
    zzqo = localzzke45;
    zzke localzzke37 = new zzke("UINT32_LIST_PACKED", 43, 43, zzkg.zzri, zzks.zzss);
    zzqp = localzzke37;
    zzke localzzke3 = new zzke("ENUM_LIST_PACKED", 44, 44, zzkg.zzri, zzks.zzsz);
    zzqq = localzzke3;
    Object localObject = new zzke("SFIXED32_LIST_PACKED", 45, 45, zzkg.zzri, zzks.zzss);
    zzqr = (zzke)localObject;
    zzke localzzke43 = new zzke("SFIXED64_LIST_PACKED", 46, 46, zzkg.zzri, zzks.zzst);
    zzqs = localzzke43;
    zzke localzzke50 = new zzke("SINT32_LIST_PACKED", 47, 47, zzkg.zzri, zzks.zzss);
    zzqt = localzzke50;
    zzke localzzke26 = new zzke("SINT64_LIST_PACKED", 48, 48, zzkg.zzri, zzks.zzst);
    zzqu = localzzke26;
    zzke localzzke6 = new zzke("GROUP_LIST", 49, 49, zzkg.zzrh, zzks.zzta);
    zzqv = localzzke6;
    zzke localzzke46 = new zzke("MAP", 50, 50, zzkg.zzrj, zzks.zzsr);
    zzqw = localzzke46;
    int i = 0;
    zzrd = new zzke[] { localzzke42, localzzke13, localzzke17, localzzke4, localzzke33, localzzke36, localzzke35, localzzke38, localzzke34, localzzke16, localzzke12, localzzke21, localzzke32, localzzke44, localzzke48, localzzke22, localzzke20, localzzke9, localzzke25, localzzke1, localzzke40, localzzke11, localzzke5, localzzke8, localzzke15, localzzke47, localzzke29, localzzke18, localzzke39, localzzke30, localzzke49, localzzke10, localzzke24, localzzke28, localzzke27, localzzke41, localzzke19, localzzke23, localzzke2, localzzke31, localzzke14, localzzke7, localzzke45, localzzke37, localzzke3, localObject, localzzke43, localzzke50, localzzke26, localzzke6, localzzke46 };
    zzrc = new Type[0];
    localObject = values();
    zzrb = new zzke[localObject.length];
    int j = localObject.length;
    while (i < j)
    {
      localzzke1 = localObject[i];
      zzrb[localzzke1.id] = localzzke1;
      i++;
    }
  }
  
  private zzke(int paramInt, zzkg paramzzkg, zzks paramzzks)
  {
    this.id = paramInt;
    this.zzqy = paramzzkg;
    this.zzqx = paramzzks;
    ??? = zzkf.zzre[paramzzkg.ordinal()];
    boolean bool = true;
    if (??? != 1)
    {
      if (??? != 2) {
        this.zzqz = null;
      } else {
        this.zzqz = paramzzks.zzdo();
      }
    }
    else {
      this.zzqz = paramzzks.zzdo();
    }
    if (paramzzkg == zzkg.zzrg)
    {
      ??? = zzkf.zzrf[paramzzks.ordinal()];
      if ((??? != 1) && (??? != 2) && (??? != 3)) {}
    }
    else
    {
      bool = false;
    }
    this.zzra = bool;
  }
  
  public final int id()
  {
    return this.id;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzke.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */