package androidx.core.location;

import android.location.GnssStatus;
import android.location.GpsStatus;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public abstract class GnssStatusCompat
{
  public static final int CONSTELLATION_BEIDOU = 5;
  public static final int CONSTELLATION_GALILEO = 6;
  public static final int CONSTELLATION_GLONASS = 3;
  public static final int CONSTELLATION_GPS = 1;
  public static final int CONSTELLATION_IRNSS = 7;
  public static final int CONSTELLATION_QZSS = 4;
  public static final int CONSTELLATION_SBAS = 2;
  public static final int CONSTELLATION_UNKNOWN = 0;
  
  public static GnssStatusCompat wrap(GnssStatus paramGnssStatus)
  {
    return new GnssStatusWrapper(paramGnssStatus);
  }
  
  public static GnssStatusCompat wrap(GpsStatus paramGpsStatus)
  {
    return new GpsStatusWrapper(paramGpsStatus);
  }
  
  public abstract float getAzimuthDegrees(int paramInt);
  
  public abstract float getBasebandCn0DbHz(int paramInt);
  
  public abstract float getCarrierFrequencyHz(int paramInt);
  
  public abstract float getCn0DbHz(int paramInt);
  
  public abstract int getConstellationType(int paramInt);
  
  public abstract float getElevationDegrees(int paramInt);
  
  public abstract int getSatelliteCount();
  
  public abstract int getSvid(int paramInt);
  
  public abstract boolean hasAlmanacData(int paramInt);
  
  public abstract boolean hasBasebandCn0DbHz(int paramInt);
  
  public abstract boolean hasCarrierFrequencyHz(int paramInt);
  
  public abstract boolean hasEphemerisData(int paramInt);
  
  public abstract boolean usedInFix(int paramInt);
  
  public static abstract class Callback
  {
    public void onFirstFix(int paramInt) {}
    
    public void onSatelliteStatusChanged(GnssStatusCompat paramGnssStatusCompat) {}
    
    public void onStarted() {}
    
    public void onStopped() {}
  }
  
  @Retention(RetentionPolicy.SOURCE)
  public static @interface ConstellationType {}
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\location\GnssStatusCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */