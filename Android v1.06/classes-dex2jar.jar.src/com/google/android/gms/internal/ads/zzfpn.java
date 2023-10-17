package com.google.android.gms.internal.ads;

import javax.annotation.CheckForNull;

public enum zzfpn
{
  private static final zzfpn[] zzC;
  private final String zzD;
  
  static
  {
    zzfpn localzzfpn5 = new zzfpn("JAVA_VERSION", 0, "java.version");
    zza = localzzfpn5;
    zzfpn localzzfpn18 = new zzfpn("JAVA_VENDOR", 1, "java.vendor");
    zzb = localzzfpn18;
    zzfpn localzzfpn24 = new zzfpn("JAVA_VENDOR_URL", 2, "java.vendor.url");
    zzc = localzzfpn24;
    zzfpn localzzfpn2 = new zzfpn("JAVA_HOME", 3, "java.home");
    zzd = localzzfpn2;
    zzfpn localzzfpn9 = new zzfpn("JAVA_VM_SPECIFICATION_VERSION", 4, "java.vm.specification.version");
    zze = localzzfpn9;
    zzfpn localzzfpn15 = new zzfpn("JAVA_VM_SPECIFICATION_VENDOR", 5, "java.vm.specification.vendor");
    zzf = localzzfpn15;
    zzfpn localzzfpn3 = new zzfpn("JAVA_VM_SPECIFICATION_NAME", 6, "java.vm.specification.name");
    zzg = localzzfpn3;
    zzfpn localzzfpn14 = new zzfpn("JAVA_VM_VERSION", 7, "java.vm.version");
    zzh = localzzfpn14;
    zzfpn localzzfpn20 = new zzfpn("JAVA_VM_VENDOR", 8, "java.vm.vendor");
    zzi = localzzfpn20;
    zzfpn localzzfpn12 = new zzfpn("JAVA_VM_NAME", 9, "java.vm.name");
    zzj = localzzfpn12;
    zzfpn localzzfpn25 = new zzfpn("JAVA_SPECIFICATION_VERSION", 10, "java.specification.version");
    zzk = localzzfpn25;
    zzfpn localzzfpn1 = new zzfpn("JAVA_SPECIFICATION_VENDOR", 11, "java.specification.vendor");
    zzl = localzzfpn1;
    zzfpn localzzfpn6 = new zzfpn("JAVA_SPECIFICATION_NAME", 12, "java.specification.name");
    zzm = localzzfpn6;
    zzfpn localzzfpn17 = new zzfpn("JAVA_CLASS_VERSION", 13, "java.class.version");
    zzn = localzzfpn17;
    zzfpn localzzfpn13 = new zzfpn("JAVA_CLASS_PATH", 14, "java.class.path");
    zzo = localzzfpn13;
    zzfpn localzzfpn26 = new zzfpn("JAVA_LIBRARY_PATH", 15, "java.library.path");
    zzp = localzzfpn26;
    zzfpn localzzfpn10 = new zzfpn("JAVA_IO_TMPDIR", 16, "java.io.tmpdir");
    zzq = localzzfpn10;
    zzfpn localzzfpn21 = new zzfpn("JAVA_COMPILER", 17, "java.compiler");
    zzr = localzzfpn21;
    zzfpn localzzfpn8 = new zzfpn("JAVA_EXT_DIRS", 18, "java.ext.dirs");
    zzs = localzzfpn8;
    zzfpn localzzfpn11 = new zzfpn("OS_NAME", 19, "os.name");
    zzt = localzzfpn11;
    zzfpn localzzfpn4 = new zzfpn("OS_ARCH", 20, "os.arch");
    zzu = localzzfpn4;
    zzfpn localzzfpn28 = new zzfpn("OS_VERSION", 21, "os.version");
    zzv = localzzfpn28;
    zzfpn localzzfpn22 = new zzfpn("FILE_SEPARATOR", 22, "file.separator");
    zzw = localzzfpn22;
    zzfpn localzzfpn19 = new zzfpn("PATH_SEPARATOR", 23, "path.separator");
    zzx = localzzfpn19;
    zzfpn localzzfpn27 = new zzfpn("LINE_SEPARATOR", 24, "line.separator");
    zzy = localzzfpn27;
    zzfpn localzzfpn16 = new zzfpn("USER_NAME", 25, "user.name");
    zzz = localzzfpn16;
    zzfpn localzzfpn7 = new zzfpn("USER_HOME", 26, "user.home");
    zzA = localzzfpn7;
    zzfpn localzzfpn23 = new zzfpn("USER_DIR", 27, "user.dir");
    zzB = localzzfpn23;
    zzC = new zzfpn[] { localzzfpn5, localzzfpn18, localzzfpn24, localzzfpn2, localzzfpn9, localzzfpn15, localzzfpn3, localzzfpn14, localzzfpn20, localzzfpn12, localzzfpn25, localzzfpn1, localzzfpn6, localzzfpn17, localzzfpn13, localzzfpn26, localzzfpn10, localzzfpn21, localzzfpn8, localzzfpn11, localzzfpn4, localzzfpn28, localzzfpn22, localzzfpn19, localzzfpn27, localzzfpn16, localzzfpn7, localzzfpn23 };
  }
  
  private zzfpn(String paramString1)
  {
    this.zzD = paramString1;
  }
  
  public final String toString()
  {
    String str2 = this.zzD;
    String str1 = System.getProperty(str2);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str2);
    localStringBuilder.append("=");
    localStringBuilder.append(str1);
    return localStringBuilder.toString();
  }
  
  @CheckForNull
  public final String zza()
  {
    return System.getProperty(this.zzD);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfpn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */