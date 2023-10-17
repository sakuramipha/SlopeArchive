package androidx.work;

public enum NetworkType
{
  private static final NetworkType[] $VALUES;
  
  static
  {
    NetworkType localNetworkType3 = new NetworkType("NOT_REQUIRED", 0);
    NOT_REQUIRED = localNetworkType3;
    NetworkType localNetworkType5 = new NetworkType("CONNECTED", 1);
    CONNECTED = localNetworkType5;
    NetworkType localNetworkType6 = new NetworkType("UNMETERED", 2);
    UNMETERED = localNetworkType6;
    NetworkType localNetworkType1 = new NetworkType("NOT_ROAMING", 3);
    NOT_ROAMING = localNetworkType1;
    NetworkType localNetworkType2 = new NetworkType("METERED", 4);
    METERED = localNetworkType2;
    NetworkType localNetworkType4 = new NetworkType("TEMPORARILY_UNMETERED", 5);
    TEMPORARILY_UNMETERED = localNetworkType4;
    $VALUES = new NetworkType[] { localNetworkType3, localNetworkType5, localNetworkType6, localNetworkType1, localNetworkType2, localNetworkType4 };
  }
  
  private NetworkType() {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\work\NetworkType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */