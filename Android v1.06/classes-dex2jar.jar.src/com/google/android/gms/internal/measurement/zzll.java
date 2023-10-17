package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

final class zzll
{
  static String zza(zzlj paramzzlj, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("# ");
    localStringBuilder.append(paramString);
    zzd(paramzzlj, localStringBuilder, 0);
    return localStringBuilder.toString();
  }
  
  static final void zzb(StringBuilder paramStringBuilder, int paramInt, String paramString, Object paramObject)
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
    int j = 0;
    int k = 0;
    for (int i = 0; i < paramInt; i++) {
      paramStringBuilder.append(' ');
    }
    paramStringBuilder.append(paramString);
    if ((paramObject instanceof String))
    {
      paramStringBuilder.append(": \"");
      paramStringBuilder.append(zzmj.zza(zzjb.zzm((String)paramObject)));
      paramStringBuilder.append('"');
      return;
    }
    if ((paramObject instanceof zzjb))
    {
      paramStringBuilder.append(": \"");
      paramStringBuilder.append(zzmj.zza((zzjb)paramObject));
      paramStringBuilder.append('"');
      return;
    }
    if ((paramObject instanceof zzkc))
    {
      paramStringBuilder.append(" {");
      zzd((zzkc)paramObject, paramStringBuilder, paramInt + 2);
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
      zzb(paramStringBuilder, i, "key", paramString.getKey());
      zzb(paramStringBuilder, i, "value", paramString.getValue());
      paramStringBuilder.append("\n");
      for (i = j; i < paramInt; i++) {
        paramStringBuilder.append(' ');
      }
      paramStringBuilder.append("}");
      return;
    }
    paramStringBuilder.append(": ");
    paramStringBuilder.append(paramObject);
  }
  
  private static final String zzc(String paramString)
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
  
  private static void zzd(zzlj paramzzlj, StringBuilder paramStringBuilder, int paramInt)
  {
    HashMap localHashMap1 = new HashMap();
    HashMap localHashMap2 = new HashMap();
    Object localObject3 = new TreeSet();
    Object localObject1;
    for (localObject1 : paramzzlj.getClass().getDeclaredMethods())
    {
      localHashMap2.put(((Method)localObject1).getName(), localObject1);
      if (((Method)localObject1).getParameterTypes().length == 0)
      {
        localHashMap1.put(((Method)localObject1).getName(), localObject1);
        if (((Method)localObject1).getName().startsWith("get")) {
          ((Set)localObject3).add(((Method)localObject1).getName());
        }
      }
    }
    localObject3 = ((Set)localObject3).iterator();
    while (((Iterator)localObject3).hasNext())
    {
      ??? = (String)((Iterator)localObject3).next();
      if (((String)???).startsWith("get")) {
        localObject1 = ((String)???).substring(3);
      } else {
        localObject1 = ???;
      }
      Object localObject4;
      if ((((String)localObject1).endsWith("List")) && (!((String)localObject1).endsWith("OrBuilderList")) && (!((String)localObject1).equals("List")))
      {
        localObject4 = String.valueOf(((String)localObject1).substring(0, 1).toLowerCase()).concat(String.valueOf(((String)localObject1).substring(1, ((String)localObject1).length() - 4)));
        Method localMethod = (Method)localHashMap1.get(???);
        if ((localMethod != null) && (localMethod.getReturnType().equals(List.class)))
        {
          zzb(paramStringBuilder, paramInt, zzc((String)localObject4), zzkc.zzbK(localMethod, paramzzlj, new Object[0]));
          continue;
        }
      }
      if ((((String)localObject1).endsWith("Map")) && (!((String)localObject1).equals("Map")))
      {
        localObject4 = String.valueOf(((String)localObject1).substring(0, 1).toLowerCase()).concat(String.valueOf(((String)localObject1).substring(1, ((String)localObject1).length() - 3)));
        ??? = (Method)localHashMap1.get(???);
        if ((??? != null) && (((Method)???).getReturnType().equals(Map.class)) && (!((Method)???).isAnnotationPresent(Deprecated.class)) && (Modifier.isPublic(((Method)???).getModifiers())))
        {
          zzb(paramStringBuilder, paramInt, zzc((String)localObject4), zzkc.zzbK((Method)???, paramzzlj, new Object[0]));
          continue;
        }
      }
      if (((Method)localHashMap2.get("set".concat(String.valueOf(localObject1))) != null) && ((!((String)localObject1).endsWith("Bytes")) || (!localHashMap1.containsKey("get".concat(String.valueOf(((String)localObject1).substring(0, ((String)localObject1).length() - 5)))))))
      {
        ??? = String.valueOf(((String)localObject1).substring(0, 1).toLowerCase()).concat(String.valueOf(((String)localObject1).substring(1)));
        localObject4 = (Method)localHashMap1.get("get".concat(String.valueOf(localObject1)));
        localObject1 = (Method)localHashMap1.get("has".concat(String.valueOf(localObject1)));
        if (localObject4 != null)
        {
          localObject4 = zzkc.zzbK((Method)localObject4, paramzzlj, new Object[0]);
          if (localObject1 == null)
          {
            if ((localObject4 instanceof Boolean))
            {
              if (!((Boolean)localObject4).booleanValue()) {
                continue;
              }
            }
            else if ((localObject4 instanceof Integer))
            {
              if (((Integer)localObject4).intValue() == 0) {
                continue;
              }
            }
            else if ((localObject4 instanceof Float))
            {
              if (Float.floatToRawIntBits(((Float)localObject4).floatValue()) == 0) {
                continue;
              }
            }
            else if ((localObject4 instanceof Double))
            {
              if (Double.doubleToRawLongBits(((Double)localObject4).doubleValue()) == 0L) {
                continue;
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
                if (!(localObject4 instanceof zzjb)) {
                  break label731;
                }
                bool = localObject4.equals(zzjb.zzb);
              }
              if (bool) {
                continue;
              }
              break label798;
              label731:
              if ((localObject4 instanceof zzlj)) {
                if (localObject4 == ((zzlj)localObject4).zzbR()) {
                  continue;
                }
              } else if ((localObject4 instanceof Enum)) {
                if (((Enum)localObject4).ordinal() == 0) {
                  continue;
                }
              }
            }
          }
          else {
            if (!((Boolean)zzkc.zzbK((Method)localObject1, paramzzlj, new Object[0])).booleanValue()) {
              continue;
            }
          }
          label798:
          zzb(paramStringBuilder, paramInt, zzc((String)???), localObject4);
        }
      }
    }
    if (!(paramzzlj instanceof zzjz))
    {
      paramzzlj = ((zzkc)paramzzlj).zzc;
      if (paramzzlj != null) {
        paramzzlj.zzg(paramStringBuilder, paramInt);
      }
      return;
    }
    paramzzlj = ((zzjz)paramzzlj).zza;
    throw null;
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\measurement\zzll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */