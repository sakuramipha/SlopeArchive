package com.google.android.gms.internal.drive;

public enum zzks
{
  private static final zzks[] zzte;
  private final Class<?> zztb;
  private final Class<?> zztc;
  private final Object zztd;
  
  static
  {
    zzks localzzks3 = new zzks("VOID", 0, Void.class, Void.class, null);
    zzsr = localzzks3;
    zzks localzzks1 = new zzks("INT", 1, Integer.TYPE, Integer.class, Integer.valueOf(0));
    zzss = localzzks1;
    zzks localzzks8 = new zzks("LONG", 2, Long.TYPE, Long.class, Long.valueOf(0L));
    zzst = localzzks8;
    zzks localzzks7 = new zzks("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0F));
    zzsu = localzzks7;
    zzks localzzks5 = new zzks("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0D));
    zzsv = localzzks5;
    zzks localzzks4 = new zzks("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.valueOf(false));
    zzsw = localzzks4;
    zzks localzzks6 = new zzks("STRING", 6, String.class, String.class, "");
    zzsx = localzzks6;
    zzks localzzks10 = new zzks("BYTE_STRING", 7, zzjc.class, zzjc.class, zzjc.zznq);
    zzsy = localzzks10;
    zzks localzzks9 = new zzks("ENUM", 8, Integer.TYPE, Integer.class, null);
    zzsz = localzzks9;
    zzks localzzks2 = new zzks("MESSAGE", 9, Object.class, Object.class, null);
    zzta = localzzks2;
    zzte = new zzks[] { localzzks3, localzzks1, localzzks8, localzzks7, localzzks5, localzzks4, localzzks6, localzzks10, localzzks9, localzzks2 };
  }
  
  private zzks(Class<?> paramClass1, Class<?> paramClass2, Object paramObject)
  {
    this.zztb = paramClass1;
    this.zztc = paramClass2;
    this.zztd = paramObject;
  }
  
  public final Class<?> zzdo()
  {
    return this.zztc;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzks.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */