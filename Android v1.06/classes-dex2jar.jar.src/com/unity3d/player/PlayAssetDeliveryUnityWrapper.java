package com.unity3d.player;

import android.app.Activity;
import android.content.Context;

class PlayAssetDeliveryUnityWrapper
{
  private static PlayAssetDeliveryUnityWrapper b;
  private t a;
  
  private PlayAssetDeliveryUnityWrapper(Context paramContext)
  {
    if (b == null)
    {
      try
      {
        Class.forName("com.google.android.play.core.assetpacks.AssetPackManager");
        this.a = a(paramContext);
      }
      catch (ClassNotFoundException paramContext)
      {
        this.a = null;
      }
      return;
    }
    throw new RuntimeException("PlayAssetDeliveryUnityWrapper should be created only once. Use getInstance() instead.");
  }
  
  private t a(Context paramContext)
  {
    return i.a(paramContext);
  }
  
  private void a()
  {
    if (!playCoreApiMissing()) {
      return;
    }
    throw new RuntimeException("AssetPackManager API is not available! Make sure your gradle project includes 'com.google.android.play:asset-delivery' dependency.");
  }
  
  public static PlayAssetDeliveryUnityWrapper getInstance()
  {
    try
    {
      for (;;)
      {
        PlayAssetDeliveryUnityWrapper localPlayAssetDeliveryUnityWrapper = b;
        if (localPlayAssetDeliveryUnityWrapper != null) {
          break;
        }
        try
        {
          PlayAssetDeliveryUnityWrapper.class.wait(3000L);
        }
        catch (InterruptedException localInterruptedException)
        {
          u.Log(6, localInterruptedException.getMessage());
        }
      }
      if (localInterruptedException != null) {
        return localInterruptedException;
      }
      RuntimeException localRuntimeException = new java/lang/RuntimeException;
      localRuntimeException.<init>("PlayAssetDeliveryUnityWrapper is not yet initialised.");
      throw localRuntimeException;
    }
    finally {}
  }
  
  public static PlayAssetDeliveryUnityWrapper init(Context paramContext)
  {
    try
    {
      if (b == null)
      {
        PlayAssetDeliveryUnityWrapper localPlayAssetDeliveryUnityWrapper = new com/unity3d/player/PlayAssetDeliveryUnityWrapper;
        localPlayAssetDeliveryUnityWrapper.<init>(paramContext);
        b = localPlayAssetDeliveryUnityWrapper;
        PlayAssetDeliveryUnityWrapper.class.notifyAll();
        paramContext = b;
        return paramContext;
      }
      paramContext = new java/lang/RuntimeException;
      paramContext.<init>("PlayAssetDeliveryUnityWrapper.init() should be called only once. Use getInstance() instead.");
      throw paramContext;
    }
    finally {}
  }
  
  public void cancelAssetPackDownload(String paramString)
  {
    cancelAssetPackDownloads(new String[] { paramString });
  }
  
  public void cancelAssetPackDownloads(String[] paramArrayOfString)
  {
    a();
    ((i)this.a).a(paramArrayOfString);
  }
  
  public void downloadAssetPack(String paramString, IAssetPackManagerDownloadStatusCallback paramIAssetPackManagerDownloadStatusCallback)
  {
    downloadAssetPacks(new String[] { paramString }, paramIAssetPackManagerDownloadStatusCallback);
  }
  
  public void downloadAssetPacks(String[] paramArrayOfString, IAssetPackManagerDownloadStatusCallback paramIAssetPackManagerDownloadStatusCallback)
  {
    a();
    ((i)this.a).a(paramArrayOfString, paramIAssetPackManagerDownloadStatusCallback);
  }
  
  public String getAssetPackPath(String paramString)
  {
    a();
    return ((i)this.a).a(paramString);
  }
  
  public void getAssetPackState(String paramString, IAssetPackManagerStatusQueryCallback paramIAssetPackManagerStatusQueryCallback)
  {
    getAssetPackStates(new String[] { paramString }, paramIAssetPackManagerStatusQueryCallback);
  }
  
  public void getAssetPackStates(String[] paramArrayOfString, IAssetPackManagerStatusQueryCallback paramIAssetPackManagerStatusQueryCallback)
  {
    a();
    ((i)this.a).a(paramArrayOfString, paramIAssetPackManagerStatusQueryCallback);
  }
  
  public boolean playCoreApiMissing()
  {
    boolean bool;
    if (this.a == null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public Object registerDownloadStatusListener(IAssetPackManagerDownloadStatusCallback paramIAssetPackManagerDownloadStatusCallback)
  {
    a();
    return ((i)this.a).a(paramIAssetPackManagerDownloadStatusCallback);
  }
  
  public void removeAssetPack(String paramString)
  {
    a();
    ((i)this.a).b(paramString);
  }
  
  public void requestToUseMobileData(Activity paramActivity, IAssetPackManagerMobileDataConfirmationCallback paramIAssetPackManagerMobileDataConfirmationCallback)
  {
    a();
    ((i)this.a).a(paramActivity, paramIAssetPackManagerMobileDataConfirmationCallback);
  }
  
  public void unregisterDownloadStatusListener(Object paramObject)
  {
    a();
    ((i)this.a).a(paramObject);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\co\\unity3d\player\PlayAssetDeliveryUnityWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */