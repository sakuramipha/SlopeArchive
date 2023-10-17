package androidx.core.provider;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.CancellationSignal;
import androidx.core.content.res.FontResourcesParserCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class FontProvider
{
  private static final Comparator<byte[]> sByteArrayComparator = new Comparator()
  {
    public int compare(byte[] paramAnonymousArrayOfByte1, byte[] paramAnonymousArrayOfByte2)
    {
      int j;
      if (paramAnonymousArrayOfByte1.length != paramAnonymousArrayOfByte2.length)
      {
        j = paramAnonymousArrayOfByte1.length;
        i = paramAnonymousArrayOfByte2.length;
        return j - i;
      }
      for (int i = 0;; i++)
      {
        if (i >= paramAnonymousArrayOfByte1.length) {
          break label54;
        }
        if (paramAnonymousArrayOfByte1[i] != paramAnonymousArrayOfByte2[i])
        {
          j = paramAnonymousArrayOfByte1[i];
          i = paramAnonymousArrayOfByte2[i];
          break;
        }
      }
      label54:
      return 0;
    }
  };
  
  private static List<byte[]> convertToByteArrayList(Signature[] paramArrayOfSignature)
  {
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramArrayOfSignature.length; i++) {
      localArrayList.add(paramArrayOfSignature[i].toByteArray());
    }
    return localArrayList;
  }
  
  private static boolean equalsByteArrayList(List<byte[]> paramList1, List<byte[]> paramList2)
  {
    if (paramList1.size() != paramList2.size()) {
      return false;
    }
    for (int i = 0; i < paramList1.size(); i++) {
      if (!Arrays.equals((byte[])paramList1.get(i), (byte[])paramList2.get(i))) {
        return false;
      }
    }
    return true;
  }
  
  private static List<List<byte[]>> getCertificates(FontRequest paramFontRequest, Resources paramResources)
  {
    if (paramFontRequest.getCertificates() != null) {
      return paramFontRequest.getCertificates();
    }
    return FontResourcesParserCompat.readCerts(paramResources, paramFontRequest.getCertificatesArrayResId());
  }
  
  static FontsContractCompat.FontFamilyResult getFontFamilyResult(Context paramContext, FontRequest paramFontRequest, CancellationSignal paramCancellationSignal)
    throws PackageManager.NameNotFoundException
  {
    ProviderInfo localProviderInfo = getProvider(paramContext.getPackageManager(), paramFontRequest, paramContext.getResources());
    if (localProviderInfo == null) {
      return FontsContractCompat.FontFamilyResult.create(1, null);
    }
    return FontsContractCompat.FontFamilyResult.create(0, query(paramContext, paramFontRequest, localProviderInfo.authority, paramCancellationSignal));
  }
  
  static ProviderInfo getProvider(PackageManager paramPackageManager, FontRequest paramFontRequest, Resources paramResources)
    throws PackageManager.NameNotFoundException
  {
    String str = paramFontRequest.getProviderAuthority();
    int i = 0;
    ProviderInfo localProviderInfo = paramPackageManager.resolveContentProvider(str, 0);
    if (localProviderInfo != null)
    {
      if (localProviderInfo.packageName.equals(paramFontRequest.getProviderPackage()))
      {
        paramPackageManager = convertToByteArrayList(paramPackageManager.getPackageInfo(localProviderInfo.packageName, 64).signatures);
        Collections.sort(paramPackageManager, sByteArrayComparator);
        paramFontRequest = getCertificates(paramFontRequest, paramResources);
        while (i < paramFontRequest.size())
        {
          paramResources = new ArrayList((Collection)paramFontRequest.get(i));
          Collections.sort(paramResources, sByteArrayComparator);
          if (equalsByteArrayList(paramPackageManager, paramResources)) {
            return localProviderInfo;
          }
          i++;
        }
        return null;
      }
      paramPackageManager = new StringBuilder();
      paramPackageManager.append("Found content provider ");
      paramPackageManager.append(str);
      paramPackageManager.append(", but package was not ");
      paramPackageManager.append(paramFontRequest.getProviderPackage());
      throw new PackageManager.NameNotFoundException(paramPackageManager.toString());
    }
    paramPackageManager = new StringBuilder();
    paramPackageManager.append("No package found for authority: ");
    paramPackageManager.append(str);
    throw new PackageManager.NameNotFoundException(paramPackageManager.toString());
  }
  
  static FontsContractCompat.FontInfo[] query(Context paramContext, FontRequest paramFontRequest, String paramString, CancellationSignal paramCancellationSignal)
  {
    ArrayList localArrayList = new ArrayList();
    Uri localUri1 = new Uri.Builder().scheme("content").authority(paramString).build();
    Uri localUri2 = new Uri.Builder().scheme("content").authority(paramString).appendPath("file").build();
    Object localObject = null;
    paramString = (String)localObject;
    try
    {
      String[] arrayOfString = new String[7];
      arrayOfString[0] = "_id";
      arrayOfString[1] = "file_id";
      arrayOfString[2] = "font_ttc_index";
      arrayOfString[3] = "font_variation_settings";
      arrayOfString[4] = "font_weight";
      arrayOfString[5] = "font_italic";
      arrayOfString[6] = "result_code";
      paramString = (String)localObject;
      if (Build.VERSION.SDK_INT > 16)
      {
        paramString = (String)localObject;
        paramContext = paramContext.getContentResolver().query(localUri1, arrayOfString, "query = ?", new String[] { paramFontRequest.getQuery() }, null, paramCancellationSignal);
      }
      else
      {
        paramString = (String)localObject;
        paramContext = paramContext.getContentResolver().query(localUri1, arrayOfString, "query = ?", new String[] { paramFontRequest.getQuery() }, null);
      }
      paramFontRequest = localArrayList;
      if (paramContext != null)
      {
        paramFontRequest = localArrayList;
        paramString = paramContext;
        if (paramContext.getCount() > 0)
        {
          paramString = paramContext;
          int i2 = paramContext.getColumnIndex("result_code");
          paramString = paramContext;
          paramCancellationSignal = new java/util/ArrayList;
          paramString = paramContext;
          paramCancellationSignal.<init>();
          paramString = paramContext;
          int i3 = paramContext.getColumnIndex("_id");
          paramString = paramContext;
          int n = paramContext.getColumnIndex("file_id");
          paramString = paramContext;
          int m = paramContext.getColumnIndex("font_ttc_index");
          paramString = paramContext;
          int i4 = paramContext.getColumnIndex("font_weight");
          paramString = paramContext;
          int i1 = paramContext.getColumnIndex("font_italic");
          for (;;)
          {
            paramString = paramContext;
            if (!paramContext.moveToNext()) {
              break;
            }
            int i;
            if (i2 != -1)
            {
              paramString = paramContext;
              i = paramContext.getInt(i2);
            }
            else
            {
              i = 0;
            }
            int j;
            if (m != -1)
            {
              paramString = paramContext;
              j = paramContext.getInt(m);
            }
            else
            {
              j = 0;
            }
            if (n == -1)
            {
              paramString = paramContext;
              paramFontRequest = ContentUris.withAppendedId(localUri1, paramContext.getLong(i3));
            }
            else
            {
              paramString = paramContext;
              paramFontRequest = ContentUris.withAppendedId(localUri2, paramContext.getLong(n));
            }
            int k;
            if (i4 != -1)
            {
              paramString = paramContext;
              k = paramContext.getInt(i4);
            }
            else
            {
              k = 400;
            }
            if (i1 != -1)
            {
              paramString = paramContext;
              if (paramContext.getInt(i1) == 1)
              {
                bool = true;
                break label445;
              }
            }
            boolean bool = false;
            label445:
            paramString = paramContext;
            paramCancellationSignal.add(FontsContractCompat.FontInfo.create(paramFontRequest, j, k, bool, i));
          }
          paramFontRequest = paramCancellationSignal;
        }
      }
      return (FontsContractCompat.FontInfo[])paramFontRequest.toArray(new FontsContractCompat.FontInfo[0]);
    }
    finally
    {
      if (paramString != null) {
        paramString.close();
      }
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\androidx\core\provider\FontProvider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */