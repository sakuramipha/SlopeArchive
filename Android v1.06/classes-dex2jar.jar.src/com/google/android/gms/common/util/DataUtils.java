package com.google.android.gms.common.util;

import android.database.CharArrayBuffer;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;

public final class DataUtils
{
  public static void copyStringToBuffer(String paramString, CharArrayBuffer paramCharArrayBuffer)
  {
    if (TextUtils.isEmpty(paramString))
    {
      paramCharArrayBuffer.sizeCopied = 0;
      return;
    }
    if ((paramCharArrayBuffer.data != null) && (paramCharArrayBuffer.data.length >= paramString.length())) {
      paramString.getChars(0, paramString.length(), paramCharArrayBuffer.data, 0);
    } else {
      paramCharArrayBuffer.data = paramString.toCharArray();
    }
    paramCharArrayBuffer.sizeCopied = paramString.length();
  }
  
  public static byte[] loadImageBytes(Bitmap paramBitmap)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.JPEG, 100, localByteArrayOutputStream);
    return localByteArrayOutputStream.toByteArray();
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\commo\\util\DataUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */