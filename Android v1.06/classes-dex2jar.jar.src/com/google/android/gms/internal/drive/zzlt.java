package com.google.android.gms.internal.drive;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

final class zzlt
{
  static String zza(zzlq paramzzlq, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("# ");
    localStringBuilder.append(paramString);
    zza(paramzzlq, localStringBuilder, 0);
    return localStringBuilder.toString();
  }
  
  private static void zza(zzlq paramzzlq, StringBuilder paramStringBuilder, int paramInt)
  {
    HashMap localHashMap2 = new HashMap();
    HashMap localHashMap1 = new HashMap();
    Object localObject2 = new TreeSet();
    for (localObject3 : paramzzlq.getClass().getDeclaredMethods())
    {
      localHashMap1.put(((Method)localObject3).getName(), localObject3);
      if (((Method)localObject3).getParameterTypes().length == 0)
      {
        localHashMap2.put(((Method)localObject3).getName(), localObject3);
        if (((Method)localObject3).getName().startsWith("get")) {
          ((Set)localObject2).add(((Method)localObject3).getName());
        }
      }
    }
    Object localObject3 = ((Set)localObject2).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      localObject2 = (String)((Iterator)localObject3).next();
      Object localObject4 = ((String)localObject2).replaceFirst("get", "");
      boolean bool1 = ((String)localObject4).endsWith("List");
      boolean bool2 = true;
      Object localObject5;
      if ((bool1) && (!((String)localObject4).endsWith("OrBuilderList")) && (!((String)localObject4).equals("List")))
      {
        ??? = String.valueOf(((String)localObject4).substring(0, 1).toLowerCase());
        localObject5 = String.valueOf(((String)localObject4).substring(1, ((String)localObject4).length() - 4));
        if (((String)localObject5).length() != 0) {
          ??? = ((String)???).concat((String)localObject5);
        } else {
          ??? = new String((String)???);
        }
        localObject5 = (Method)localHashMap2.get(localObject2);
        if ((localObject5 != null) && (((Method)localObject5).getReturnType().equals(List.class)))
        {
          zza(paramStringBuilder, paramInt, zzo((String)???), zzkk.zza((Method)localObject5, paramzzlq, new Object[0]));
          continue;
        }
      }
      if ((((String)localObject4).endsWith("Map")) && (!((String)localObject4).equals("Map")))
      {
        localObject5 = String.valueOf(((String)localObject4).substring(0, 1).toLowerCase());
        ??? = String.valueOf(((String)localObject4).substring(1, ((String)localObject4).length() - 3));
        if (((String)???).length() != 0) {
          ??? = ((String)localObject5).concat((String)???);
        } else {
          ??? = new String((String)localObject5);
        }
        localObject2 = (Method)localHashMap2.get(localObject2);
        if ((localObject2 != null) && (((Method)localObject2).getReturnType().equals(Map.class)) && (!((Method)localObject2).isAnnotationPresent(Deprecated.class)) && (Modifier.isPublic(((Method)localObject2).getModifiers())))
        {
          zza(paramStringBuilder, paramInt, zzo((String)???), zzkk.zza((Method)localObject2, paramzzlq, new Object[0]));
          continue;
        }
      }
      ??? = String.valueOf(localObject4);
      if (((String)???).length() != 0) {
        ??? = "set".concat((String)???);
      } else {
        ??? = new String("set");
      }
      if ((Method)localHashMap1.get(???) != null) {
        if (((String)localObject4).endsWith("Bytes"))
        {
          ??? = String.valueOf(((String)localObject4).substring(0, ((String)localObject4).length() - 5));
          if (((String)???).length() != 0) {
            ??? = "get".concat((String)???);
          } else {
            ??? = new String("get");
          }
          if (localHashMap2.containsKey(???)) {}
        }
        else
        {
          ??? = String.valueOf(((String)localObject4).substring(0, 1).toLowerCase());
          localObject2 = String.valueOf(((String)localObject4).substring(1));
          if (((String)localObject2).length() != 0) {
            ??? = ((String)???).concat((String)localObject2);
          } else {
            ??? = new String((String)???);
          }
          localObject2 = String.valueOf(localObject4);
          if (((String)localObject2).length() != 0) {
            localObject2 = "get".concat((String)localObject2);
          } else {
            localObject2 = new String("get");
          }
          localObject5 = (Method)localHashMap2.get(localObject2);
          localObject2 = String.valueOf(localObject4);
          if (((String)localObject2).length() != 0) {
            localObject2 = "has".concat((String)localObject2);
          } else {
            localObject2 = new String("has");
          }
          localObject2 = (Method)localHashMap2.get(localObject2);
          if (localObject5 != null)
          {
            localObject4 = zzkk.zza((Method)localObject5, paramzzlq, new Object[0]);
            if (localObject2 == null)
            {
              if ((localObject4 instanceof Boolean)) {
                if (((Boolean)localObject4).booleanValue()) {}
              }
              for (;;)
              {
                bool1 = true;
                break;
                label868:
                label892:
                label959:
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          bool1 = false;
                          break label981;
                          if (!(localObject4 instanceof Integer)) {
                            break;
                          }
                        } while (((Integer)localObject4).intValue() != 0);
                        break;
                        if (!(localObject4 instanceof Float)) {
                          break label868;
                        }
                      } while (((Float)localObject4).floatValue() != 0.0F);
                      break;
                      if (!(localObject4 instanceof Double)) {
                        break label892;
                      }
                    } while (((Double)localObject4).doubleValue() != 0.0D);
                    break;
                    if ((localObject4 instanceof String))
                    {
                      bool1 = localObject4.equals("");
                      break label981;
                    }
                    if ((localObject4 instanceof zzjc))
                    {
                      bool1 = localObject4.equals(zzjc.zznq);
                      break label981;
                    }
                    if (!(localObject4 instanceof zzlq)) {
                      break label959;
                    }
                  } while (localObject4 != ((zzlq)localObject4).zzda());
                  break;
                } while ((!(localObject4 instanceof Enum)) || (((Enum)localObject4).ordinal() != 0));
              }
              label981:
              if (!bool1) {
                bool1 = bool2;
              } else {
                bool1 = false;
              }
            }
            else
            {
              bool1 = ((Boolean)zzkk.zza((Method)localObject2, paramzzlq, new Object[0])).booleanValue();
            }
            if (bool1) {
              zza(paramStringBuilder, paramInt, zzo((String)???), localObject4);
            }
          }
        }
      }
    }
    if ((paramzzlq instanceof zzkk.zzc))
    {
      ??? = ((zzkk.zzc)paramzzlq).zzrw.iterator();
      if (((Iterator)???).hasNext())
      {
        ((Map.Entry)((Iterator)???).next()).getKey();
        throw new NoSuchMethodError();
      }
    }
    paramzzlq = (zzkk)paramzzlq;
    if (paramzzlq.zzrq != null) {
      paramzzlq.zzrq.zza(paramStringBuilder, paramInt);
    }
  }
  
  static final void zza(StringBuilder paramStringBuilder, int paramInt, String paramString, Object paramObject)
  {
    if ((paramObject instanceof List))
    {
      paramObject = ((List)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        zza(paramStringBuilder, paramInt, paramString, ((Iterator)paramObject).next());
      }
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramObject = ((Map)paramObject).entrySet().iterator();
      while (((Iterator)paramObject).hasNext()) {
        zza(paramStringBuilder, paramInt, paramString, (Map.Entry)((Iterator)paramObject).next());
      }
      return;
    }
    paramStringBuilder.append('\n');
    int j = 0;
    int k = 0;
    for (int i = 0; i < paramInt; i++) {
      paramStringBuilder.append(' ');
    }
    paramStringBuilder.append(paramString);
    if ((paramObject instanceof String))
    {
      paramStringBuilder.append(": \"");
      paramStringBuilder.append(zzmt.zzc(zzjc.zzk((String)paramObject)));
      paramStringBuilder.append('"');
      return;
    }
    if ((paramObject instanceof zzjc))
    {
      paramStringBuilder.append(": \"");
      paramStringBuilder.append(zzmt.zzc((zzjc)paramObject));
      paramStringBuilder.append('"');
      return;
    }
    if ((paramObject instanceof zzkk))
    {
      paramStringBuilder.append(" {");
      zza((zzkk)paramObject, paramStringBuilder, paramInt + 2);
      paramStringBuilder.append("\n");
      for (i = k; i < paramInt; i++) {
        paramStringBuilder.append(' ');
      }
      paramStringBuilder.append("}");
      return;
    }
    if ((paramObject instanceof Map.Entry))
    {
      paramStringBuilder.append(" {");
      paramString = (Map.Entry)paramObject;
      i = paramInt + 2;
      zza(paramStringBuilder, i, "key", paramString.getKey());
      zza(paramStringBuilder, i, "value", paramString.getValue());
      paramStringBuilder.append("\n");
      for (i = j; i < paramInt; i++) {
        paramStringBuilder.append(' ');
      }
      paramStringBuilder.append("}");
      return;
    }
    paramStringBuilder.append(": ");
    paramStringBuilder.append(paramObject.toString());
  }
  
  private static final String zzo(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    for (int i = 0; i < paramString.length(); i++)
    {
      char c = paramString.charAt(i);
      if (Character.isUpperCase(c)) {
        localStringBuilder.append("_");
      }
      localStringBuilder.append(Character.toLowerCase(c));
    }
    return localStringBuilder.toString();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\drive\zzlt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */