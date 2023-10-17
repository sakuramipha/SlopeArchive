package com.google.android.gms.internal.drive;

 enum zzkg
{
  private static final zzkg[] zzrl;
  private final boolean zzrk;
  
  static
  {
    zzkg localzzkg3 = new zzkg("SCALAR", 0, false);
    zzrg = localzzkg3;
    zzkg localzzkg1 = new zzkg("VECTOR", 1, true);
    zzrh = localzzkg1;
    zzkg localzzkg4 = new zzkg("PACKED_VECTOR", 2, true);
    zzri = localzzkg4;
    zzkg localzzkg2 = new zzkg("MAP", 3, false);
    zzrj = localzzkg2;
    zzrl = new zzkg[] { localzzkg3, localzzkg1, localzzkg4, localzzkg2 };
  }
  
  private zzkg(boolean paramBoolean)
  {
    this.zzrk = paramBoolean;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzkg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */