package com.google.android.gms.internal.ads;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

final class zzgqi
{
  private static final char[] zza;
  
  static
  {
    char[] arrayOfChar = new char[80];
    zza = arrayOfChar;
    Arrays.fill(arrayOfChar, ' ');
  }
  
  static String zza(zzgqg paramzzgqg, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("# ");
    localStringBuilder.append(paramString);
    zzd(paramzzgqg, localStringBuilder, 0);
    return localStringBuilder.toString();
  }
  
  static void zzb(StringBuilder paramStringBuilder, int paramInt, String paramString, Object paramObject)
  {
    if ((paramObject instanceof List))
    {
      paramObject = ((List)paramObject).iterator();
      while (((Iterator)paramObject).hasNext()) {
        zzb(paramStringBuilder, paramInt, paramString, ((Iterator)paramObject).next());
      }
      return;
    }
    if ((paramObject instanceof Map))
    {
      paramObject = ((Map)paramObject).entrySet().iterator();
      while (((Iterator)paramObject).hasNext()) {
        zzb(paramStringBuilder, paramInt, paramString, (Map.Entry)((Iterator)paramObject).next());
      }
      return;
    }
    paramStringBuilder.append('\n');
    zzc(paramInt, paramStringBuilder);
    Object localObject = paramString;
    int i;
    if (!paramString.isEmpty())
    {
      localObject = new StringBuilder();
      ((StringBuilder)localObject).append(Character.toLowerCase(paramString.charAt(0)));
      for (i = 1; i < paramString.length(); i++)
      {
        char c = paramString.charAt(i);
        if (Character.isUpperCase(c)) {
          ((StringBuilder)localObject).append("_");
        }
        ((StringBuilder)localObject).append(Character.toLowerCase(c));
      }
      localObject = ((StringBuilder)localObject).toString();
    }
    paramStringBuilder.append((String)localObject);
    if ((paramObject instanceof String))
    {
      paramStringBuilder.append(": \"");
      paramStringBuilder.append(zzgro.zza(zzgno.zzw((String)paramObject)));
      paramStringBuilder.append('"');
      return;
    }
    if ((paramObject instanceof zzgno))
    {
      paramStringBuilder.append(": \"");
      paramStringBuilder.append(zzgro.zza((zzgno)paramObject));
      paramStringBuilder.append('"');
      return;
    }
    if ((paramObject instanceof zzgow))
    {
      paramStringBuilder.append(" {");
      zzd((zzgow)paramObject, paramStringBuilder, paramInt + 2);
      paramStringBuilder.append("\n");
      zzc(paramInt, paramStringBuilder);
      paramStringBuilder.append("}");
      return;
    }
    if ((paramObject instanceof Map.Entry))
    {
      paramStringBuilder.append(" {");
      paramString = (Map.Entry)paramObject;
      i = paramInt + 2;
      zzb(paramStringBuilder, i, "key", paramString.getKey());
      zzb(paramStringBuilder, i, "value", paramString.getValue());
      paramStringBuilder.append("\n");
      zzc(paramInt, paramStringBuilder);
      paramStringBuilder.append("}");
      return;
    }
    paramStringBuilder.append(": ");
    paramStringBuilder.append(paramObject);
  }
  
  private static void zzc(int paramInt, StringBuilder paramStringBuilder)
  {
    while (paramInt > 0)
    {
      int i = 80;
      if (paramInt <= 80) {
        i = paramInt;
      }
      paramStringBuilder.append(zza, 0, i);
      paramInt -= i;
    }
  }
  
  private static void zzd(zzgqg paramzzgqg, StringBuilder paramStringBuilder, int paramInt)
  {
    HashSet localHashSet = new HashSet();
    HashMap localHashMap = new HashMap();
    TreeMap localTreeMap = new TreeMap();
    for (localObject2 : paramzzgqg.getClass().getDeclaredMethods()) {
      if ((!Modifier.isStatic(((Method)localObject2).getModifiers())) && (((Method)localObject2).getName().length() >= 3)) {
        if (((Method)localObject2).getName().startsWith("set")) {
          localHashSet.add(((Method)localObject2).getName());
        } else if ((Modifier.isPublic(((Method)localObject2).getModifiers())) && (((Method)localObject2).getParameterTypes().length == 0)) {
          if (((Method)localObject2).getName().startsWith("has")) {
            localHashMap.put(((Method)localObject2).getName(), localObject2);
          } else if (((Method)localObject2).getName().startsWith("get")) {
            localTreeMap.put(((Method)localObject2).getName(), localObject2);
          }
        }
      }
    }
    Object localObject2 = localTreeMap.entrySet().iterator();
    label700:
    label767:
    label776:
    while (((Iterator)localObject2).hasNext())
    {
      Object localObject3 = (Map.Entry)((Iterator)localObject2).next();
      ??? = ((String)((Map.Entry)localObject3).getKey()).substring(3);
      Object localObject4;
      if ((((String)???).endsWith("List")) && (!((String)???).endsWith("OrBuilderList")) && (!((String)???).equals("List")))
      {
        localObject4 = (Method)((Map.Entry)localObject3).getValue();
        if ((localObject4 != null) && (((Method)localObject4).getReturnType().equals(List.class)))
        {
          zzb(paramStringBuilder, paramInt, ((String)???).substring(0, ((String)???).length() - 4), zzgow.zzaQ((Method)localObject4, paramzzgqg, new Object[0]));
          break label776;
        }
      }
      if ((((String)???).endsWith("Map")) && (!((String)???).equals("Map")))
      {
        localObject4 = (Method)((Map.Entry)localObject3).getValue();
        if ((localObject4 != null) && (((Method)localObject4).getReturnType().equals(Map.class)) && (!((Method)localObject4).isAnnotationPresent(Deprecated.class)) && (Modifier.isPublic(((Method)localObject4).getModifiers())))
        {
          zzb(paramStringBuilder, paramInt, ((String)???).substring(0, ((String)???).length() - 3), zzgow.zzaQ((Method)localObject4, paramzzgqg, new Object[0]));
          break label776;
        }
      }
      if ((localHashSet.contains("set".concat(String.valueOf(???)))) && ((!((String)???).endsWith("Bytes")) || (!localTreeMap.containsKey("get".concat(String.valueOf(((String)???).substring(0, ((String)???).length() - 5)))))))
      {
        localObject4 = (Method)((Map.Entry)localObject3).getValue();
        localObject3 = (Method)localHashMap.get("has".concat(String.valueOf(???)));
        if (localObject4 != null)
        {
          localObject4 = zzgow.zzaQ((Method)localObject4, paramzzgqg, new Object[0]);
          if (localObject3 == null)
          {
            if ((localObject4 instanceof Boolean))
            {
              if (!((Boolean)localObject4).booleanValue()) {
                break label776;
              }
            }
            else if ((localObject4 instanceof Integer))
            {
              if (((Integer)localObject4).intValue() == 0) {
                break label776;
              }
            }
            else if ((localObject4 instanceof Float))
            {
              if (Float.floatToRawIntBits(((Float)localObject4).floatValue()) == 0) {
                break label776;
              }
            }
            else if ((localObject4 instanceof Double))
            {
              if (Double.doubleToRawLongBits(((Double)localObject4).doubleValue()) == 0L) {
                break label776;
              }
            }
            else
            {
              boolean bool;
              if ((localObject4 instanceof String))
              {
                bool = localObject4.equals("");
              }
              else
              {
                if (!(localObject4 instanceof zzgno)) {
                  break label700;
                }
                bool = localObject4.equals(zzgno.zzb);
              }
              if (bool) {
                break label776;
              }
              break label767;
              if ((localObject4 instanceof zzgqg)) {
                if (localObject4 == ((zzgqg)localObject4).zzbf()) {
                  break label776;
                }
              } else if ((localObject4 instanceof Enum)) {
                if (((Enum)localObject4).ordinal() == 0) {
                  break label776;
                }
              }
            }
          }
          else {
            if (!((Boolean)zzgow.zzaQ((Method)localObject3, paramzzgqg, new Object[0])).booleanValue()) {
              break label776;
            }
          }
          zzb(paramStringBuilder, paramInt, (String)???, localObject4);
        }
      }
    }
    if (!(paramzzgqg instanceof zzgot))
    {
      paramzzgqg = ((zzgow)paramzzgqg).zzc;
      if (paramzzgqg != null) {
        paramzzgqg.zzi(paramStringBuilder, paramInt);
      }
      return;
    }
    paramzzgqg = ((zzgot)paramzzgqg).zzb;
    throw null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzgqi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */