package com.google.android.gms.dynamic;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;

public final class FragmentWrapper
  extends IFragmentWrapper.Stub
{
  private Fragment zza;
  
  private FragmentWrapper(Fragment paramFragment)
  {
    this.zza = paramFragment;
  }
  
  public static FragmentWrapper wrap(Fragment paramFragment)
  {
    if (paramFragment != null) {
      return new FragmentWrapper(paramFragment);
    }
    return null;
  }
  
  public final boolean zzA()
  {
    return this.zza.isVisible();
  }
  
  public final int zzb()
  {
    return this.zza.getId();
  }
  
  public final int zzc()
  {
    return this.zza.getTargetRequestCode();
  }
  
  public final Bundle zzd()
  {
    return this.zza.getArguments();
  }
  
  public final IFragmentWrapper zze()
  {
    return wrap(this.zza.getParentFragment());
  }
  
  public final IFragmentWrapper zzf()
  {
    return wrap(this.zza.getTargetFragment());
  }
  
  public final IObjectWrapper zzg()
  {
    return ObjectWrapper.wrap(this.zza.getActivity());
  }
  
  public final IObjectWrapper zzh()
  {
    return ObjectWrapper.wrap(this.zza.getResources());
  }
  
  public final IObjectWrapper zzi()
  {
    return ObjectWrapper.wrap(this.zza.getView());
  }
  
  public final String zzj()
  {
    return this.zza.getTag();
  }
  
  public final void zzk(IObjectWrapper paramIObjectWrapper)
  {
    View localView = (View)ObjectWrapper.unwrap(paramIObjectWrapper);
    paramIObjectWrapper = this.zza;
    Preconditions.checkNotNull(localView);
    paramIObjectWrapper.registerForContextMenu(localView);
  }
  
  public final void zzl(boolean paramBoolean)
  {
    this.zza.setHasOptionsMenu(paramBoolean);
  }
  
  public final void zzm(boolean paramBoolean)
  {
    this.zza.setMenuVisibility(paramBoolean);
  }
  
  public final void zzn(boolean paramBoolean)
  {
    this.zza.setRetainInstance(paramBoolean);
  }
  
  public final void zzo(boolean paramBoolean)
  {
    this.zza.setUserVisibleHint(paramBoolean);
  }
  
  public final void zzp(Intent paramIntent)
  {
    this.zza.startActivity(paramIntent);
  }
  
  public final void zzq(Intent paramIntent, int paramInt)
  {
    this.zza.startActivityForResult(paramIntent, paramInt);
  }
  
  public final void zzr(IObjectWrapper paramIObjectWrapper)
  {
    View localView = (View)ObjectWrapper.unwrap(paramIObjectWrapper);
    paramIObjectWrapper = this.zza;
    Preconditions.checkNotNull(localView);
    paramIObjectWrapper.unregisterForContextMenu(localView);
  }
  
  public final boolean zzs()
  {
    return this.zza.getRetainInstance();
  }
  
  public final boolean zzt()
  {
    return this.zza.getUserVisibleHint();
  }
  
  public final boolean zzu()
  {
    return this.zza.isAdded();
  }
  
  public final boolean zzv()
  {
    return this.zza.isDetached();
  }
  
  public final boolean zzw()
  {
    return this.zza.isHidden();
  }
  
  public final boolean zzx()
  {
    return this.zza.isInLayout();
  }
  
  public final boolean zzy()
  {
    return this.zza.isRemoving();
  }
  
  public final boolean zzz()
  {
    return this.zza.isResumed();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\dynamic\FragmentWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */