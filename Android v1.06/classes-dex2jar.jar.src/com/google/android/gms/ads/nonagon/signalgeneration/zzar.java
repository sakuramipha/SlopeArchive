package com.google.android.gms.ads.nonagon.signalgeneration;

import android.webkit.WebView;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbzt;
import org.json.JSONException;
import org.json.JSONObject;

final class zzar
  extends QueryInfoGenerationCallback
{
  final TaggingLibraryJsInterface zzb;
  
  zzar(TaggingLibraryJsInterface paramTaggingLibraryJsInterface, String paramString) {}
  
  public final void onFailure(String paramString)
  {
    zzbzt.zzj("Failed to generate query info for the tagging library, error: ".concat(String.valueOf(paramString)));
    paramString = String.format("window.postMessage({'paw_id': '%1$s', 'error': '%2$s'}, '*');", new Object[] { this.zza, paramString });
    TaggingLibraryJsInterface.zza(this.zzb).evaluateJavascript(paramString, null);
  }
  
  public final void onSuccess(QueryInfo paramQueryInfo)
  {
    String str = paramQueryInfo.getQuery();
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      localJSONObject.put("paw_id", this.zza);
      localJSONObject.put("signal", str);
      str = String.format("window.postMessage(%1$s, '*');", new Object[] { localJSONObject });
      paramQueryInfo = str;
    }
    catch (JSONException localJSONException)
    {
      paramQueryInfo = String.format("window.postMessage({'paw_id': '%1$s', 'signal': '%2$s'}, '*');", new Object[] { this.zza, paramQueryInfo.getQuery() });
    }
    TaggingLibraryJsInterface.zza(this.zzb).evaluateJavascript(paramQueryInfo, null);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\ads\nonagon\signalgeneration\zzar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */