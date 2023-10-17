package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.MurmurHash3;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
public final class zzavd
{
  public static int zza(String paramString)
  {
    try
    {
      byte[] arrayOfByte = paramString.getBytes("UTF-8");
      paramString = arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      paramString = paramString.getBytes();
    }
    return MurmurHash3.murmurhash3_x86_32(paramString, 0, paramString.length, 0);
  }
  
  public static String[] zzb(String paramString, boolean paramBoolean)
  {
    if (paramString == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    char[] arrayOfChar = paramString.toCharArray();
    int i = 0;
    int m = 0;
    int n;
    for (int j = 0; i < paramString.length(); j = n)
    {
      int k = Character.codePointAt(arrayOfChar, i);
      int i1 = Character.charCount(k);
      if (Character.isLetter(k))
      {
        Character.UnicodeBlock localUnicodeBlock = Character.UnicodeBlock.of(k);
        if ((localUnicodeBlock.equals(Character.UnicodeBlock.BOPOMOFO)) || (localUnicodeBlock.equals(Character.UnicodeBlock.BOPOMOFO_EXTENDED)) || (localUnicodeBlock.equals(Character.UnicodeBlock.CJK_COMPATIBILITY)) || (localUnicodeBlock.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS)) || (localUnicodeBlock.equals(Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT)) || (localUnicodeBlock.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS)) || (localUnicodeBlock.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A)) || (localUnicodeBlock.equals(Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B)) || (localUnicodeBlock.equals(Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS)) || (localUnicodeBlock.equals(Character.UnicodeBlock.HANGUL_JAMO)) || (localUnicodeBlock.equals(Character.UnicodeBlock.HANGUL_SYLLABLES)) || (localUnicodeBlock.equals(Character.UnicodeBlock.HIRAGANA)) || (localUnicodeBlock.equals(Character.UnicodeBlock.KATAKANA)) || (localUnicodeBlock.equals(Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS)) || ((k >= 65382) && (k <= 65437)) || ((k >= 65441) && (k <= 65500)))
        {
          if (m != 0) {
            localArrayList.add(new String(arrayOfChar, j, i - j));
          }
          localArrayList.add(new String(arrayOfChar, i, i1));
        }
      }
      for (;;)
      {
        k = 0;
        n = j;
        break label418;
        if ((Character.isLetterOrDigit(k)) || (Character.getType(k) == 6) || (Character.getType(k) == 8)) {
          break;
        }
        if ((paramBoolean) && (Character.charCount(k) == 1) && (Character.toChars(k)[0] == '\''))
        {
          if (1 == m) {
            break label412;
          }
          break label410;
        }
        k = m;
        n = j;
        if (m == 0) {
          break label418;
        }
        localArrayList.add(new String(arrayOfChar, j, i - j));
      }
      if (1 != m) {
        label410:
        j = i;
      }
      label412:
      k = 1;
      n = j;
      label418:
      i += i1;
      m = k;
    }
    if (m != 0) {
      localArrayList.add(new String(arrayOfChar, j, i - j));
    }
    return (String[])localArrayList.toArray(new String[localArrayList.size()]);
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\internal\ads\zzavd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */