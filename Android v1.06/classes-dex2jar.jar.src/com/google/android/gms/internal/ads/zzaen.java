package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

public final class zzaen
  extends zzaef
{
  public static final Parcelable.Creator<zzaen> CREATOR = new zzaem();
  public final String zza;
  @Deprecated
  public final String zzb;
  public final zzfrr zzc;
  
  public zzaen(String paramString1, String paramString2, List paramList)
  {
    super(paramString1);
    zzdy.zzd(paramList.isEmpty() ^ true);
    this.zza = paramString2;
    paramString1 = zzfrr.zzj(paramList);
    this.zzc = paramString1;
    this.zzb = ((String)paramString1.get(0));
  }
  
  private static List zzb(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    try
    {
      if (paramString.length() >= 10)
      {
        localArrayList.add(Integer.valueOf(Integer.parseInt(paramString.substring(0, 4))));
        localArrayList.add(Integer.valueOf(Integer.parseInt(paramString.substring(5, 7))));
        localArrayList.add(Integer.valueOf(Integer.parseInt(paramString.substring(8, 10))));
      }
      else if (paramString.length() >= 7)
      {
        localArrayList.add(Integer.valueOf(Integer.parseInt(paramString.substring(0, 4))));
        localArrayList.add(Integer.valueOf(Integer.parseInt(paramString.substring(5, 7))));
      }
      else if (paramString.length() >= 4)
      {
        localArrayList.add(Integer.valueOf(Integer.parseInt(paramString.substring(0, 4))));
      }
      return localArrayList;
    }
    catch (NumberFormatException paramString) {}
    return new ArrayList();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if ((paramObject != null) && (getClass() == paramObject.getClass()))
    {
      paramObject = (zzaen)paramObject;
      if ((zzfn.zzB(this.zzf, ((zzaen)paramObject).zzf)) && (zzfn.zzB(this.zza, ((zzaen)paramObject).zza)) && (this.zzc.equals(((zzaen)paramObject).zzc))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    int j = this.zzf.hashCode();
    String str = this.zza;
    int i;
    if (str != null) {
      i = str.hashCode();
    } else {
      i = 0;
    }
    return ((j + 527) * 31 + i) * 31 + this.zzc.hashCode();
  }
  
  public final String toString()
  {
    String str1 = this.zzf;
    String str2 = this.zza;
    String str3 = String.valueOf(this.zzc);
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(str1);
    localStringBuilder.append(": description=");
    localStringBuilder.append(str2);
    localStringBuilder.append(": values=");
    localStringBuilder.append(str3);
    return localStringBuilder.toString();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.zzf);
    paramParcel.writeString(this.zza);
    paramParcel.writeStringArray((String[])this.zzc.toArray(new String[0]));
  }
  
  public final void zza(zzbu paramzzbu)
  {
    Object localObject = this.zzf;
    switch (((String)localObject).hashCode())
    {
    default: 
      break;
    case 2590194: 
      if (((String)localObject).equals("TYER")) {
        i = 11;
      }
      break;
    case 2583398: 
      if (((String)localObject).equals("TRCK")) {
        i = 9;
      }
      break;
    case 2581514: 
      if (((String)localObject).equals("TPE3")) {
        i = 19;
      }
      break;
    case 2581513: 
      if (((String)localObject).equals("TPE2")) {
        i = 5;
      }
      break;
    case 2581512: 
      if (((String)localObject).equals("TPE1")) {
        i = 3;
      }
      break;
    case 2575251: 
      if (((String)localObject).equals("TIT2")) {
        i = 1;
      }
      break;
    case 2571565: 
      if (((String)localObject).equals("TEXT")) {
        i = 21;
      }
      break;
    case 2570410: 
      if (((String)localObject).equals("TDRL")) {
        i = 15;
      }
      break;
    case 2570401: 
      if (((String)localObject).equals("TDRC")) {
        i = 14;
      }
      break;
    case 2569891: 
      if (((String)localObject).equals("TDAT")) {
        i = 13;
      }
      break;
    case 2569357: 
      if (((String)localObject).equals("TCOM")) {
        i = 17;
      }
      break;
    case 2567331: 
      if (((String)localObject).equals("TALB")) {
        i = 7;
      }
      break;
    case 83552: 
      if (((String)localObject).equals("TYE")) {
        i = 10;
      }
      break;
    case 83536: 
      if (((String)localObject).equals("TXT")) {
        i = 20;
      }
      break;
    case 83378: 
      if (((String)localObject).equals("TT2")) {
        i = 0;
      }
      break;
    case 83341: 
      if (((String)localObject).equals("TRK")) {
        i = 8;
      }
      break;
    case 83255: 
      if (((String)localObject).equals("TP3")) {
        i = 18;
      }
      break;
    case 83254: 
      if (((String)localObject).equals("TP2")) {
        i = 4;
      }
      break;
    case 83253: 
      if (((String)localObject).equals("TP1")) {
        i = 2;
      }
      break;
    case 82897: 
      if (((String)localObject).equals("TDA")) {
        i = 12;
      }
      break;
    case 82878: 
      if (((String)localObject).equals("TCM")) {
        i = 16;
      }
      break;
    case 82815: 
      if (((String)localObject).equals("TAL")) {
        i = 6;
      }
      break;
    }
    int i = -1;
    switch (i)
    {
    default: 
      break;
    case 20: 
    case 21: 
      paramzzbu.zzt((CharSequence)this.zzc.get(0));
      return;
    case 18: 
    case 19: 
      paramzzbu.zzg((CharSequence)this.zzc.get(0));
      return;
    case 16: 
    case 17: 
      paramzzbu.zzf((CharSequence)this.zzc.get(0));
      return;
    case 15: 
      localObject = zzb((String)this.zzc.get(0));
      i = ((List)localObject).size();
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3) {
            paramzzbu.zzm((Integer)((List)localObject).get(2));
          }
        }
        else {
          paramzzbu.zzn((Integer)((List)localObject).get(1));
        }
      }
      else
      {
        paramzzbu.zzo((Integer)((List)localObject).get(0));
        return;
      }
      break;
    case 14: 
      localObject = zzb((String)this.zzc.get(0));
      i = ((List)localObject).size();
      if (i != 1)
      {
        if (i != 2)
        {
          if (i == 3) {
            paramzzbu.zzj((Integer)((List)localObject).get(2));
          }
        }
        else {
          paramzzbu.zzk((Integer)((List)localObject).get(1));
        }
      }
      else
      {
        paramzzbu.zzl((Integer)((List)localObject).get(0));
        return;
      }
      break;
    }
    try
    {
      localObject = (String)this.zzc.get(0);
      i = Integer.parseInt(((String)localObject).substring(2, 4));
      int j = Integer.parseInt(((String)localObject).substring(0, 2));
      paramzzbu.zzk(Integer.valueOf(i));
      paramzzbu.zzj(Integer.valueOf(j));
      return;
    }
    catch (NumberFormatException|StringIndexOutOfBoundsException paramzzbu)
    {
      try
      {
        paramzzbu.zzl(Integer.valueOf(Integer.parseInt((String)this.zzc.get(0))));
        return;
        localObject = (String)this.zzc.get(0);
        i = zzfn.zza;
        localObject = ((String)localObject).split("/", -1);
        try
        {
          i = Integer.parseInt(localObject[0]);
          if (localObject.length > 1) {
            localObject = Integer.valueOf(Integer.parseInt(localObject[1]));
          } else {
            localObject = null;
          }
          paramzzbu.zzs(Integer.valueOf(i));
          paramzzbu.zzr((Integer)localObject);
          return;
        }
        catch (NumberFormatException paramzzbu)
        {
          for (;;) {}
        }
        paramzzbu.zzd((CharSequence)this.zzc.get(0));
        return;
        paramzzbu.zzc((CharSequence)this.zzc.get(0));
        return;
        paramzzbu.zze((CharSequence)this.zzc.get(0));
        return;
        paramzzbu.zzq((CharSequence)this.zzc.get(0));
        return;
        paramzzbu = paramzzbu;
      }
      catch (NumberFormatException paramzzbu)
      {
        for (;;) {}
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzaen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */