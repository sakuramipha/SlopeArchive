package com.google.android.gms.games.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.drive.Contents;
import com.google.android.gms.games.video.VideoCapabilities;
import com.google.android.gms.internal.games_v2.zzc;

public abstract class zzal
  extends com.google.android.gms.internal.games_v2.zzb
  implements zzam
{
  public zzal()
  {
    super("com.google.android.gms.games.internal.IGamesCallbacks");
  }
  
  protected final boolean zza(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
    throws RemoteException
  {
    if (paramInt1 != 6001)
    {
      if (paramInt1 != 6002)
      {
        Object localObject1;
        if (paramInt1 != 12011)
        {
          if (paramInt1 != 12012)
          {
            if (paramInt1 != 13001)
            {
              if (paramInt1 != 13002)
              {
                if (paramInt1 != 19001)
                {
                  if (paramInt1 != 19002)
                  {
                    Object localObject2;
                    switch (paramInt1)
                    {
                    default: 
                      switch (paramInt1)
                      {
                      default: 
                        switch (paramInt1)
                        {
                        default: 
                          switch (paramInt1)
                          {
                          default: 
                            switch (paramInt1)
                            {
                            default: 
                              switch (paramInt1)
                              {
                              default: 
                                return false;
                              case 12017: 
                                DataHolder localDataHolder = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                                String str = paramParcel1.readString();
                                localObject2 = (Contents)zzc.zza(paramParcel1, Contents.CREATOR);
                                localObject1 = (Contents)zzc.zza(paramParcel1, Contents.CREATOR);
                                Contents localContents = (Contents)zzc.zza(paramParcel1, Contents.CREATOR);
                                zzc.zzb(paramParcel1);
                                zzo(localDataHolder, str, (Contents)localObject2, (Contents)localObject1, localContents);
                                break;
                              case 12016: 
                                localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                                zzc.zzb(paramParcel1);
                                break;
                              case 12015: 
                                paramParcel1.readInt();
                                localObject1 = (Bundle)zzc.zza(paramParcel1, Bundle.CREATOR);
                                zzc.zzb(paramParcel1);
                                break;
                              case 12014: 
                                localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                                zzc.zzb(paramParcel1);
                              }
                              break;
                            case 12008: 
                              localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                              zzc.zzb(paramParcel1);
                              break;
                            case 12007: 
                              localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                              zzc.zzb(paramParcel1);
                              break;
                            case 12006: 
                              localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                              zzc.zzb(paramParcel1);
                              break;
                            case 12005: 
                              localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                              zzc.zzb(paramParcel1);
                              zzn((DataHolder)localObject1);
                              break;
                            case 12004: 
                              localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                              localObject2 = (Contents)zzc.zza(paramParcel1, Contents.CREATOR);
                              zzc.zzb(paramParcel1);
                              zzq((DataHolder)localObject1, (Contents)localObject2);
                            }
                            break;
                          case 10006: 
                            localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                            zzc.zzb(paramParcel1);
                            break;
                          case 10005: 
                            paramParcel1.readInt();
                            localObject1 = (Bundle)zzc.zza(paramParcel1, Bundle.CREATOR);
                            zzc.zzb(paramParcel1);
                            break;
                          case 10004: 
                            localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                            zzc.zzb(paramParcel1);
                            break;
                          case 10003: 
                            localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                            zzc.zzb(paramParcel1);
                            break;
                          case 10002: 
                            paramParcel1.readString();
                            zzc.zzb(paramParcel1);
                            break;
                          case 10001: 
                            localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                            zzc.zzb(paramParcel1);
                          }
                          break;
                        case 8010: 
                          paramParcel1.readString();
                          zzc.zzb(paramParcel1);
                          break;
                        case 8009: 
                          paramParcel1.readString();
                          zzc.zzb(paramParcel1);
                          break;
                        case 8008: 
                          localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                          zzc.zzb(paramParcel1);
                          break;
                        case 8007: 
                          paramParcel1.readInt();
                          paramParcel1.readString();
                          zzc.zzb(paramParcel1);
                          break;
                        case 8006: 
                          localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                          zzc.zzb(paramParcel1);
                          break;
                        case 8005: 
                          localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                          zzc.zzb(paramParcel1);
                          break;
                        case 8004: 
                          localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                          zzc.zzb(paramParcel1);
                          break;
                        case 8003: 
                          localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                          zzc.zzb(paramParcel1);
                          break;
                        case 8002: 
                          paramParcel1.readInt();
                          localObject1 = (Bundle)zzc.zza(paramParcel1, Bundle.CREATOR);
                          zzc.zzb(paramParcel1);
                          break;
                        case 8001: 
                          localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                          zzc.zzb(paramParcel1);
                          zzh((DataHolder)localObject1);
                        }
                        break;
                      case 25004: 
                        localObject1 = (Status)zzc.zza(paramParcel1, Status.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 25003: 
                        localObject2 = (Status)zzc.zza(paramParcel1, Status.CREATOR);
                        localObject1 = paramParcel1.readString();
                        zzc.zzb(paramParcel1);
                        zzl((Status)localObject2, (String)localObject1);
                        break;
                      case 25002: 
                        paramParcel1.readString();
                        zzc.zzb(paramParcel1);
                        break;
                      case 24002: 
                        zzc.zzg(paramParcel1);
                        zzc.zzb(paramParcel1);
                        break;
                      case 23005: 
                        paramParcel1.readInt();
                        zzc.zzb(paramParcel1);
                        break;
                      case 23004: 
                        paramParcel1.readInt();
                        zzc.zzb(paramParcel1);
                        break;
                      case 23003: 
                        paramParcel1.readInt();
                        zzc.zzb(paramParcel1);
                        break;
                      case 23002: 
                        paramParcel1.readInt();
                        zzc.zzb(paramParcel1);
                        break;
                      case 23001: 
                        paramParcel1.readInt();
                        zzc.zzb(paramParcel1);
                        break;
                      case 20020: 
                        paramParcel1.readInt();
                        localObject1 = (Bundle)zzc.zza(paramParcel1, Bundle.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 20019: 
                        paramParcel1.readInt();
                        zzc.zzb(paramParcel1);
                        break;
                      case 20012: 
                        localObject1 = (Status)zzc.zza(paramParcel1, Status.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 20009: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 20008: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 20007: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 20006: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 20005: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 20004: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 20003: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 20002: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 20001: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 19010: 
                        paramParcel1.readInt();
                        zzc.zzb(paramParcel1);
                        break;
                      case 19009: 
                        paramParcel1.readInt();
                        zzc.zzb(paramParcel1);
                        break;
                      case 19008: 
                        paramParcel1.readInt();
                        zzc.zzb(paramParcel1);
                        break;
                      case 17002: 
                        paramParcel1.readInt();
                        zzc.zzb(paramParcel1);
                        break;
                      case 15001: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        zzi((DataHolder)localObject1);
                        break;
                      case 14001: 
                        localObject1 = (DataHolder[])paramParcel1.createTypedArray(DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 12001: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        zzr((DataHolder)localObject1);
                        break;
                      case 11001: 
                        paramParcel1.readInt();
                        localObject1 = (Bundle)zzc.zza(paramParcel1, Bundle.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 9001: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 5040: 
                        paramParcel1.readInt();
                        zzc.zzb(paramParcel1);
                        break;
                      case 5039: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 5038: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 5037: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 5036: 
                        paramParcel1.readInt();
                        zzc.zzb(paramParcel1);
                        break;
                      case 5035: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 5034: 
                        paramParcel1.readInt();
                        paramParcel1.readString();
                        zzc.zzg(paramParcel1);
                        zzc.zzb(paramParcel1);
                        break;
                      case 5033: 
                        paramParcel1.readInt();
                        paramParcel1.readInt();
                        paramParcel1.readString();
                        zzc.zzb(paramParcel1);
                        break;
                      case 5032: 
                        localObject1 = (com.google.android.gms.games.multiplayer.realtime.zzb)zzc.zza(paramParcel1, com.google.android.gms.games.multiplayer.realtime.zzb.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 5031: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        paramParcel1.createStringArray();
                        zzc.zzb(paramParcel1);
                        break;
                      case 5030: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        paramParcel1.createStringArray();
                        zzc.zzb(paramParcel1);
                        break;
                      case 5029: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        paramParcel1.createStringArray();
                        zzc.zzb(paramParcel1);
                        break;
                      case 5028: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        paramParcel1.createStringArray();
                        zzc.zzb(paramParcel1);
                        break;
                      case 5027: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        paramParcel1.createStringArray();
                        zzc.zzb(paramParcel1);
                        break;
                      case 5026: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        paramParcel1.createStringArray();
                        zzc.zzb(paramParcel1);
                        break;
                      case 5025: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 5024: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 5023: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 5022: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 5021: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 5020: 
                        paramParcel1.readInt();
                        paramParcel1.readString();
                        zzc.zzb(paramParcel1);
                        break;
                      case 5019: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 5018: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 5017: 
                        localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                        zzc.zzb(paramParcel1);
                        break;
                      case 5016: 
                        zzm();
                      }
                      break;
                    case 5011: 
                      localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                      zzc.zzb(paramParcel1);
                      break;
                    case 5010: 
                      localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                      zzc.zzb(paramParcel1);
                      break;
                    case 5009: 
                      localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                      zzc.zzb(paramParcel1);
                      break;
                    case 5008: 
                      localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                      zzc.zzb(paramParcel1);
                      zze((DataHolder)localObject1);
                      break;
                    case 5007: 
                      localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                      zzc.zzb(paramParcel1);
                      zzj((DataHolder)localObject1);
                      break;
                    case 5006: 
                      localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                      zzc.zzb(paramParcel1);
                      zzk((DataHolder)localObject1);
                      break;
                    case 5005: 
                      localObject2 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                      localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                      zzc.zzb(paramParcel1);
                      zzf((DataHolder)localObject2, (DataHolder)localObject1);
                      break;
                    case 5004: 
                      localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                      zzc.zzb(paramParcel1);
                      zzg((DataHolder)localObject1);
                      break;
                    case 5003: 
                      paramInt1 = paramParcel1.readInt();
                      localObject1 = paramParcel1.readString();
                      zzc.zzb(paramParcel1);
                      zzb(paramInt1, (String)localObject1);
                      break;
                    case 5002: 
                      localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
                      zzc.zzb(paramParcel1);
                      zzc((DataHolder)localObject1);
                      break;
                    case 5001: 
                      paramParcel1.readInt();
                      paramParcel1.readString();
                      zzc.zzb(paramParcel1);
                      break;
                    }
                  }
                  else
                  {
                    paramParcel1.readInt();
                    zzc.zzg(paramParcel1);
                    zzc.zzb(paramParcel1);
                  }
                }
                else
                {
                  paramParcel1.readInt();
                  localObject1 = (VideoCapabilities)zzc.zza(paramParcel1, VideoCapabilities.CREATOR);
                  zzc.zzb(paramParcel1);
                }
              }
              else
              {
                paramParcel1.readInt();
                zzc.zzb(paramParcel1);
              }
            }
            else
            {
              localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
              zzc.zzb(paramParcel1);
            }
          }
          else
          {
            paramInt1 = paramParcel1.readInt();
            localObject1 = paramParcel1.readString();
            zzc.zzb(paramParcel1);
            zzp(paramInt1, (String)localObject1);
          }
        }
        else
        {
          localObject1 = (DataHolder)zzc.zza(paramParcel1, DataHolder.CREATOR);
          zzc.zzb(paramParcel1);
          zzd((DataHolder)localObject1);
        }
      }
      else
      {
        paramParcel1.readString();
        zzc.zzb(paramParcel1);
      }
    }
    else
    {
      paramParcel1.readString();
      zzc.zzb(paramParcel1);
    }
    paramParcel2.writeNoException();
    return true;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\games\internal\zzal.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */