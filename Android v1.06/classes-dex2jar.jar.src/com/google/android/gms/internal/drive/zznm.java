package com.google.android.gms.internal.drive;

public enum zznm
{
  private static final zznm[] zzxo;
  private final zznr zzxm;
  private final int zzxn;
  
  static
  {
    zznm localzznm2 = new zznm("DOUBLE", 0, zznr.zzxs, 1);
    zzwu = localzznm2;
    zznm localzznm14 = new zznm("FLOAT", 1, zznr.zzxr, 5);
    zzwv = localzznm14;
    zznm localzznm11 = new zznm("INT64", 2, zznr.zzxq, 0);
    zzww = localzznm11;
    zznm localzznm5 = new zznm("UINT64", 3, zznr.zzxq, 0);
    zzwx = localzznm5;
    zznm localzznm1 = new zznm("INT32", 4, zznr.zzxp, 0);
    zzwy = localzznm1;
    zznm localzznm13 = new zznm("FIXED64", 5, zznr.zzxq, 1);
    zzwz = localzznm13;
    zznm localzznm12 = new zznm("FIXED32", 6, zznr.zzxp, 5);
    zzxa = localzznm12;
    zznm localzznm10 = new zznm("BOOL", 7, zznr.zzxt, 0);
    zzxb = localzznm10;
    zznn localzznn = new zznn("STRING", 8, zznr.zzxu, 2);
    zzxc = localzznn;
    zzno localzzno = new zzno("GROUP", 9, zznr.zzxx, 3);
    zzxd = localzzno;
    zznp localzznp = new zznp("MESSAGE", 10, zznr.zzxx, 2);
    zzxe = localzznp;
    zznq localzznq = new zznq("BYTES", 11, zznr.zzxv, 2);
    zzxf = localzznq;
    zznm localzznm4 = new zznm("UINT32", 12, zznr.zzxp, 0);
    zzxg = localzznm4;
    zznm localzznm6 = new zznm("ENUM", 13, zznr.zzxw, 0);
    zzxh = localzznm6;
    zznm localzznm9 = new zznm("SFIXED32", 14, zznr.zzxp, 5);
    zzxi = localzznm9;
    zznm localzznm7 = new zznm("SFIXED64", 15, zznr.zzxq, 1);
    zzxj = localzznm7;
    zznm localzznm3 = new zznm("SINT32", 16, zznr.zzxp, 0);
    zzxk = localzznm3;
    zznm localzznm8 = new zznm("SINT64", 17, zznr.zzxq, 0);
    zzxl = localzznm8;
    zzxo = new zznm[] { localzznm2, localzznm14, localzznm11, localzznm5, localzznm1, localzznm13, localzznm12, localzznm10, localzznn, localzzno, localzznp, localzznq, localzznm4, localzznm6, localzznm9, localzznm7, localzznm3, localzznm8 };
  }
  
  private zznm(zznr paramzznr, int paramInt)
  {
    this.zzxm = paramzznr;
    this.zzxn = paramInt;
  }
  
  public final zznr zzfj()
  {
    return this.zzxm;
  }
  
  public final int zzfk()
  {
    return this.zzxn;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zznm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */