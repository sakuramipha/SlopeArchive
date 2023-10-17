package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import javax.annotation.Nullable;

public final class zzfxv
{
  private final Class zza;
  private ConcurrentMap zzb;
  private final List zzc;
  private zzfxw zzd;
  private zzggx zze;
  
  private final zzfxv zze(@Nullable Object paramObject1, @Nullable Object paramObject2, zzgkg paramzzgkg, boolean paramBoolean)
    throws GeneralSecurityException
  {
    if (this.zzb != null)
    {
      if ((paramObject1 == null) && (paramObject2 == null)) {
        throw new GeneralSecurityException("at least one of the `fullPrimitive` or `primitive` must be set");
      }
      if (paramzzgkg.zzk() == 3)
      {
        Object localObject1 = Integer.valueOf(paramzzgkg.zza());
        if (paramzzgkg.zzf() == zzgla.zzd) {
          localObject1 = null;
        }
        Object localObject2 = zzgds.zzb().zza(zzgel.zza(paramzzgkg.zzc().zzg(), paramzzgkg.zzc().zzf(), paramzzgkg.zzc().zzc(), paramzzgkg.zzf(), (Integer)localObject1), zzfye.zza());
        int i = paramzzgkg.zzf().ordinal();
        if (i != 1)
        {
          if (i != 2) {
            if (i != 3)
            {
              if (i != 4) {
                throw new GeneralSecurityException("unknown output prefix type");
              }
            }
            else
            {
              localObject1 = zzfxa.zza;
              break label196;
            }
          }
          localObject1 = ByteBuffer.allocate(5).put((byte)0).putInt(paramzzgkg.zza()).array();
        }
        else
        {
          localObject1 = ByteBuffer.allocate(5).put((byte)1).putInt(paramzzgkg.zza()).array();
        }
        label196:
        paramObject2 = new zzfxw(paramObject1, paramObject2, (byte[])localObject1, paramzzgkg.zzk(), paramzzgkg.zzf(), paramzzgkg.zza(), paramzzgkg.zzc().zzg(), (zzfxb)localObject2);
        localObject1 = this.zzb;
        paramObject1 = this.zzc;
        localObject2 = new ArrayList();
        ((List)localObject2).add(paramObject2);
        paramzzgkg = new zzfxy(((zzfxw)paramObject2).zzg(), null);
        localObject2 = (List)((ConcurrentMap)localObject1).put(paramzzgkg, Collections.unmodifiableList((List)localObject2));
        if (localObject2 != null)
        {
          ArrayList localArrayList = new ArrayList();
          localArrayList.addAll((Collection)localObject2);
          localArrayList.add(paramObject2);
          ((ConcurrentMap)localObject1).put(paramzzgkg, Collections.unmodifiableList(localArrayList));
        }
        ((List)paramObject1).add(paramObject2);
        if (paramBoolean) {
          if (this.zzd == null) {
            this.zzd = ((zzfxw)paramObject2);
          } else {
            throw new IllegalStateException("you cannot set two primary primitives");
          }
        }
        return this;
      }
      throw new GeneralSecurityException("only ENABLED key is allowed");
    }
    throw new IllegalStateException("addPrimitive cannot be called after build");
  }
  
  public final zzfxv zza(@Nullable Object paramObject1, @Nullable Object paramObject2, zzgkg paramzzgkg)
    throws GeneralSecurityException
  {
    zze(paramObject1, paramObject2, paramzzgkg, false);
    return this;
  }
  
  public final zzfxv zzb(@Nullable Object paramObject1, @Nullable Object paramObject2, zzgkg paramzzgkg)
    throws GeneralSecurityException
  {
    zze(paramObject1, paramObject2, paramzzgkg, true);
    return this;
  }
  
  public final zzfxv zzc(zzggx paramzzggx)
  {
    if (this.zzb != null)
    {
      this.zze = paramzzggx;
      return this;
    }
    throw new IllegalStateException("setAnnotations cannot be called after build");
  }
  
  public final zzfya zzd()
    throws GeneralSecurityException
  {
    Object localObject = this.zzb;
    if (localObject != null)
    {
      localObject = new zzfya((ConcurrentMap)localObject, this.zzc, this.zzd, this.zze, this.zza, null);
      this.zzb = null;
      return (zzfya)localObject;
    }
    throw new IllegalStateException("build cannot be called twice");
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzfxv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */