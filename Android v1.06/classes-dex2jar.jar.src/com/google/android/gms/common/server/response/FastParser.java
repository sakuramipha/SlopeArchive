package com.google.android.gms.common.server.response;

import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.JsonUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class FastParser<T extends FastJsonResponse>
{
  private static final char[] zaa = { 117, 108, 108 };
  private static final char[] zab = { 114, 117, 101 };
  private static final char[] zac = { 114, 117, 101, 34 };
  private static final char[] zad = { 97, 108, 115, 101 };
  private static final char[] zae = { 97, 108, 115, 101, 34 };
  private static final char[] zaf = { '\n' };
  private static final zai<Integer> zag = new zaa();
  private static final zai<Long> zah = new zab();
  private static final zai<Float> zai = new zac();
  private static final zai<Double> zaj = new zad();
  private static final zai<Boolean> zak = new zae();
  private static final zai<String> zal = new zaf();
  private static final zai<BigInteger> zam = new zag();
  private static final zai<BigDecimal> zan = new zah();
  private final char[] zao = new char[1];
  private final char[] zap = new char[32];
  private final char[] zaq = new char['Ѐ'];
  private final StringBuilder zar = new StringBuilder(32);
  private final StringBuilder zas = new StringBuilder(1024);
  private final Stack<Integer> zat = new Stack();
  
  private static final String zaA(BufferedReader paramBufferedReader, char[] paramArrayOfChar1, StringBuilder paramStringBuilder, char[] paramArrayOfChar2)
    throws FastParser.ParseException, IOException
  {
    paramStringBuilder.setLength(0);
    paramBufferedReader.mark(paramArrayOfChar1.length);
    int k = 0;
    int i = 0;
    for (;;)
    {
      int n = paramBufferedReader.read(paramArrayOfChar1);
      if (n == -1) {
        break;
      }
      for (int j = 0; j < n; j++)
      {
        char c = paramArrayOfChar1[j];
        if (Character.isISOControl(c))
        {
          if (paramArrayOfChar2 != null) {
            for (int m = 0; m <= 0; m++) {
              if (paramArrayOfChar2[m] == c) {
                break label94;
              }
            }
          }
          throw new ParseException("Unexpected control character while reading string");
        }
        label94:
        if (c == '"')
        {
          if (i == 0)
          {
            paramStringBuilder.append(paramArrayOfChar1, 0, j);
            paramBufferedReader.reset();
            paramBufferedReader.skip(j + 1);
            if (k != 0) {
              return JsonUtils.unescapeString(paramStringBuilder.toString());
            }
            return paramStringBuilder.toString();
          }
        }
        else if (c == '\\')
        {
          i ^= 0x1;
          k = 1;
          continue;
        }
        i = 0;
      }
      paramStringBuilder.append(paramArrayOfChar1, 0, n);
      paramBufferedReader.mark(paramArrayOfChar1.length);
    }
    throw new ParseException("Unexpected EOF while parsing string");
  }
  
  private final char zai(BufferedReader paramBufferedReader)
    throws FastParser.ParseException, IOException
  {
    if (paramBufferedReader.read(this.zao) != -1)
    {
      while (Character.isWhitespace(this.zao[0])) {
        if (paramBufferedReader.read(this.zao) == -1) {
          return '\000';
        }
      }
      return this.zao[0];
    }
    return '\000';
  }
  
  private final double zaj(BufferedReader paramBufferedReader)
    throws FastParser.ParseException, IOException
  {
    int i = zam(paramBufferedReader, this.zaq);
    if (i == 0) {
      return 0.0D;
    }
    return Double.parseDouble(new String(this.zaq, 0, i));
  }
  
  private final float zak(BufferedReader paramBufferedReader)
    throws FastParser.ParseException, IOException
  {
    int i = zam(paramBufferedReader, this.zaq);
    if (i == 0) {
      return 0.0F;
    }
    return Float.parseFloat(new String(this.zaq, 0, i));
  }
  
  private final int zal(BufferedReader paramBufferedReader)
    throws FastParser.ParseException, IOException
  {
    int n = zam(paramBufferedReader, this.zaq);
    if (n == 0) {
      return 0;
    }
    paramBufferedReader = this.zaq;
    if (n > 0)
    {
      int i = paramBufferedReader[0];
      int m;
      if (i == 45) {
        m = Integer.MIN_VALUE;
      } else {
        m = -2147483647;
      }
      int j;
      if (i == 45) {
        j = 1;
      } else {
        j = 0;
      }
      int k;
      if (j < n)
      {
        k = j + 1;
        i = Character.digit(paramBufferedReader[j], 10);
        if (i >= 0) {
          i = -i;
        } else {
          throw new ParseException("Unexpected non-digit character");
        }
      }
      else
      {
        k = j;
        i = 0;
      }
      while (k < n)
      {
        int i1 = Character.digit(paramBufferedReader[k], 10);
        if (i1 >= 0)
        {
          if (i >= -214748364)
          {
            i *= 10;
            if (i >= m + i1)
            {
              i -= i1;
              k++;
            }
            else
            {
              throw new ParseException("Number too large");
            }
          }
          else
          {
            throw new ParseException("Number too large");
          }
        }
        else {
          throw new ParseException("Unexpected non-digit character");
        }
      }
      if (j != 0)
      {
        if (k <= 1) {
          throw new ParseException("No digits to parse");
        }
      }
      else {
        i = -i;
      }
      return i;
    }
    throw new ParseException("No number to parse");
  }
  
  private final int zam(BufferedReader paramBufferedReader, char[] paramArrayOfChar)
    throws FastParser.ParseException, IOException
  {
    char c = zai(paramBufferedReader);
    if (c != 0)
    {
      if (c != ',')
      {
        if (c == 'n')
        {
          zax(paramBufferedReader, zaa);
          return 0;
        }
        paramBufferedReader.mark(1024);
        int k;
        if (c == '"')
        {
          i = 0;
          int j = 0;
          for (;;)
          {
            k = i;
            if (i >= 1024) {
              break label255;
            }
            k = i;
            if (paramBufferedReader.read(paramArrayOfChar, i, 1) == -1) {
              break label255;
            }
            c = paramArrayOfChar[i];
            if (Character.isISOControl(c)) {
              break;
            }
            if (c == '"')
            {
              if (j == 0)
              {
                paramBufferedReader.reset();
                paramBufferedReader.skip(i + 1);
                return i;
              }
            }
            else if (c == '\\')
            {
              j ^= 0x1;
              break label140;
            }
            j = 0;
            label140:
            i++;
          }
          throw new ParseException("Unexpected control character while reading string");
        }
        paramArrayOfChar[0] = c;
        for (int i = 1;; i++)
        {
          k = i;
          if (i >= 1024) {
            break label255;
          }
          k = i;
          if (paramBufferedReader.read(paramArrayOfChar, i, 1) == -1) {
            break label255;
          }
          c = paramArrayOfChar[i];
          if ((c == '}') || (c == ',') || (Character.isWhitespace(c)) || (paramArrayOfChar[i] == ']')) {
            break;
          }
        }
        paramBufferedReader.reset();
        paramBufferedReader.skip(i - 1);
        paramArrayOfChar[i] = '\000';
        return i;
        label255:
        if (k == 1024) {
          throw new ParseException("Absurdly long value");
        }
        throw new ParseException("Unexpected EOF");
      }
      throw new ParseException("Missing value");
    }
    throw new ParseException("Unexpected EOF");
  }
  
  private final long zan(BufferedReader paramBufferedReader)
    throws FastParser.ParseException, IOException
  {
    int k = zam(paramBufferedReader, this.zaq);
    if (k == 0) {
      return 0L;
    }
    paramBufferedReader = this.zaq;
    if (k > 0)
    {
      int i = 0;
      int j = paramBufferedReader[0];
      long l2;
      if (j == 45) {
        l2 = Long.MIN_VALUE;
      } else {
        l2 = -9223372036854775807L;
      }
      if (j == 45) {
        i = 1;
      }
      int m;
      long l1;
      if (i < k)
      {
        j = i + 1;
        m = Character.digit(paramBufferedReader[i], 10);
        if (m >= 0) {
          l1 = -m;
        } else {
          throw new ParseException("Unexpected non-digit character");
        }
      }
      else
      {
        l1 = 0L;
        j = i;
      }
      while (j < k)
      {
        m = Character.digit(paramBufferedReader[j], 10);
        if (m >= 0)
        {
          if (l1 >= -922337203685477580L)
          {
            l1 *= 10L;
            long l3 = m;
            if (l1 >= l2 + l3)
            {
              l1 -= l3;
              j++;
            }
            else
            {
              throw new ParseException("Number too large");
            }
          }
          else
          {
            throw new ParseException("Number too large");
          }
        }
        else {
          throw new ParseException("Unexpected non-digit character");
        }
      }
      if (i != 0)
      {
        if (j <= 1) {
          throw new ParseException("No digits to parse");
        }
      }
      else {
        l1 = -l1;
      }
      return l1;
    }
    throw new ParseException("No number to parse");
  }
  
  private final String zao(BufferedReader paramBufferedReader)
    throws FastParser.ParseException, IOException
  {
    return zap(paramBufferedReader, this.zap, this.zar, null);
  }
  
  private final String zap(BufferedReader paramBufferedReader, char[] paramArrayOfChar1, StringBuilder paramStringBuilder, char[] paramArrayOfChar2)
    throws FastParser.ParseException, IOException
  {
    int i = zai(paramBufferedReader);
    if (i != 34)
    {
      if (i == 110)
      {
        zax(paramBufferedReader, zaa);
        return null;
      }
      throw new ParseException("Expected string");
    }
    return zaA(paramBufferedReader, paramArrayOfChar1, paramStringBuilder, paramArrayOfChar2);
  }
  
  private final String zaq(BufferedReader paramBufferedReader)
    throws FastParser.ParseException, IOException
  {
    this.zat.push(Integer.valueOf(2));
    char c = zai(paramBufferedReader);
    if (c != '"')
    {
      if (c != ']')
      {
        if (c == '}')
        {
          zaw(2);
          return null;
        }
        paramBufferedReader = new StringBuilder(19);
        paramBufferedReader.append("Unexpected token: ");
        paramBufferedReader.append(c);
        throw new ParseException(paramBufferedReader.toString());
      }
      zaw(2);
      zaw(1);
      zaw(5);
      return null;
    }
    this.zat.push(Integer.valueOf(3));
    String str = zaA(paramBufferedReader, this.zap, this.zar, null);
    zaw(3);
    if (zai(paramBufferedReader) == ':') {
      return str;
    }
    throw new ParseException("Expected key/value separator");
  }
  
  private final String zar(BufferedReader paramBufferedReader)
    throws FastParser.ParseException, IOException
  {
    paramBufferedReader.mark(1024);
    int j = zai(paramBufferedReader);
    int n = 1;
    int i;
    int m;
    int k;
    if (j != 34)
    {
      if (j != 44)
      {
        if (j != 91)
        {
          if (j != 123)
          {
            paramBufferedReader.reset();
            zam(paramBufferedReader, this.zaq);
          }
          else
          {
            this.zat.push(Integer.valueOf(1));
            paramBufferedReader.mark(32);
            i = zai(paramBufferedReader);
            if (i == 125)
            {
              zaw(1);
            }
            else if (i == 34)
            {
              paramBufferedReader.reset();
              zaq(paramBufferedReader);
              while (zar(paramBufferedReader) != null) {}
              zaw(1);
            }
            else
            {
              paramBufferedReader = new StringBuilder(18);
              paramBufferedReader.append("Unexpected token ");
              paramBufferedReader.append(i);
              throw new ParseException(paramBufferedReader.toString());
            }
          }
        }
        else
        {
          this.zat.push(Integer.valueOf(5));
          paramBufferedReader.mark(32);
          if (zai(paramBufferedReader) == ']')
          {
            zaw(5);
          }
          else
          {
            paramBufferedReader.reset();
            m = 0;
            int i1 = 0;
            j = n;
            for (;;)
            {
              if (j > 0)
              {
                i = zai(paramBufferedReader);
                if (i != 0)
                {
                  if (!Character.isISOControl(i))
                  {
                    k = m;
                    n = i;
                    if (i == 34)
                    {
                      k = m;
                      if (i1 == 0) {
                        k = m ^ 0x1;
                      }
                      n = 34;
                    }
                    m = j;
                    int i2 = n;
                    if (n == 91)
                    {
                      m = j;
                      if (k == 0) {
                        m = j + 1;
                      }
                      i2 = 91;
                    }
                    j = m;
                    if (i2 == 93)
                    {
                      j = m;
                      if (k == 0) {
                        j = m - 1;
                      }
                    }
                    m = k;
                    n = j;
                    if (i2 != 92) {
                      break;
                    }
                    m = k;
                    n = j;
                    if (k == 0) {
                      break;
                    }
                    i1 ^= 0x1;
                    m = k;
                    continue;
                  }
                  throw new ParseException("Unexpected control character while reading array");
                }
                throw new ParseException("Unexpected EOF while parsing array");
              }
            }
            zaw(5);
          }
        }
      }
      else {
        throw new ParseException("Missing value");
      }
    }
    else
    {
      if (paramBufferedReader.read(this.zao) == -1) {
        break label590;
      }
      m = this.zao[0];
      j = 0;
    }
    for (;;)
    {
      k = m;
      n = j;
      if (m == 34) {
        if (j != 0)
        {
          k = 34;
          n = 1;
        }
        else
        {
          i = zai(paramBufferedReader);
          if (i != 44)
          {
            if (i == 125)
            {
              zaw(2);
              return null;
            }
            paramBufferedReader = new StringBuilder(18);
            paramBufferedReader.append("Unexpected token ");
            paramBufferedReader.append(i);
            throw new ParseException(paramBufferedReader.toString());
          }
          zaw(2);
          return zaq(paramBufferedReader);
        }
      }
      if (k == 92) {
        j = n ^ 0x1;
      } else {
        j = 0;
      }
      if (paramBufferedReader.read(this.zao) == -1) {
        break label580;
      }
      i = this.zao[0];
      if (Character.isISOControl(i)) {
        break;
      }
      m = i;
    }
    throw new ParseException("Unexpected control character while reading string");
    label580:
    throw new ParseException("Unexpected EOF while parsing string");
    label590:
    throw new ParseException("Unexpected EOF while parsing string");
  }
  
  private final BigDecimal zas(BufferedReader paramBufferedReader)
    throws FastParser.ParseException, IOException
  {
    int i = zam(paramBufferedReader, this.zaq);
    if (i == 0) {
      return null;
    }
    return new BigDecimal(new String(this.zaq, 0, i));
  }
  
  private final BigInteger zat(BufferedReader paramBufferedReader)
    throws FastParser.ParseException, IOException
  {
    int i = zam(paramBufferedReader, this.zaq);
    if (i == 0) {
      return null;
    }
    return new BigInteger(new String(this.zaq, 0, i));
  }
  
  private final <O> ArrayList<O> zau(BufferedReader paramBufferedReader, zai<O> paramzai)
    throws FastParser.ParseException, IOException
  {
    int i = zai(paramBufferedReader);
    if (i == 110)
    {
      zax(paramBufferedReader, zaa);
      return null;
    }
    if (i == 91)
    {
      this.zat.push(Integer.valueOf(5));
      ArrayList localArrayList = new ArrayList();
      for (;;)
      {
        paramBufferedReader.mark(1024);
        i = zai(paramBufferedReader);
        if (i == 0) {
          break label107;
        }
        if (i != 44)
        {
          if (i == 93) {
            break;
          }
          paramBufferedReader.reset();
          localArrayList.add(paramzai.zaa(this, paramBufferedReader));
        }
      }
      zaw(5);
      return localArrayList;
      label107:
      throw new ParseException("Unexpected EOF");
    }
    throw new ParseException("Expected start of array");
  }
  
  private final <T extends FastJsonResponse> ArrayList<T> zav(BufferedReader paramBufferedReader, FastJsonResponse.Field<?, ?> paramField)
    throws FastParser.ParseException, IOException
  {
    ArrayList localArrayList = new ArrayList();
    char c = zai(paramBufferedReader);
    if (c != ']')
    {
      if (c != 'n')
      {
        if (c == '{')
        {
          this.zat.push(Integer.valueOf(1));
          try
          {
            for (;;)
            {
              FastJsonResponse localFastJsonResponse = paramField.zad();
              if (!zaz(paramBufferedReader, localFastJsonResponse)) {
                break label167;
              }
              localArrayList.add(localFastJsonResponse);
              c = zai(paramBufferedReader);
              if (c != ',')
              {
                if (c == ']')
                {
                  zaw(5);
                  return localArrayList;
                }
                paramBufferedReader = new StringBuilder(19);
                paramBufferedReader.append("Unexpected token: ");
                paramBufferedReader.append(c);
                throw new ParseException(paramBufferedReader.toString());
              }
              if (zai(paramBufferedReader) != '{') {
                break;
              }
              this.zat.push(Integer.valueOf(1));
            }
            throw new ParseException("Expected start of next object in array");
            label167:
            return localArrayList;
          }
          catch (IllegalAccessException paramBufferedReader)
          {
            throw new ParseException("Error instantiating inner object", paramBufferedReader);
          }
          catch (InstantiationException paramBufferedReader)
          {
            throw new ParseException("Error instantiating inner object", paramBufferedReader);
          }
        }
        paramBufferedReader = new StringBuilder(19);
        paramBufferedReader.append("Unexpected token: ");
        paramBufferedReader.append(c);
        throw new ParseException(paramBufferedReader.toString());
      }
      zax(paramBufferedReader, zaa);
      zaw(5);
      return null;
    }
    zaw(5);
    return localArrayList;
  }
  
  private final void zaw(int paramInt)
    throws FastParser.ParseException
  {
    if (!this.zat.isEmpty())
    {
      int i = ((Integer)this.zat.pop()).intValue();
      if (i == paramInt) {
        return;
      }
      localStringBuilder = new StringBuilder(46);
      localStringBuilder.append("Expected state ");
      localStringBuilder.append(paramInt);
      localStringBuilder.append(" but had ");
      localStringBuilder.append(i);
      throw new ParseException(localStringBuilder.toString());
    }
    StringBuilder localStringBuilder = new StringBuilder(46);
    localStringBuilder.append("Expected state ");
    localStringBuilder.append(paramInt);
    localStringBuilder.append(" but had empty stack");
    throw new ParseException(localStringBuilder.toString());
  }
  
  private final void zax(BufferedReader paramBufferedReader, char[] paramArrayOfChar)
    throws FastParser.ParseException, IOException
  {
    int i = 0;
    for (;;)
    {
      int j = paramArrayOfChar.length;
      if (i >= j) {
        return;
      }
      int k = paramBufferedReader.read(this.zap, 0, j - i);
      if (k == -1) {
        break;
      }
      j = 0;
      while (j < k) {
        if (paramArrayOfChar[(j + i)] == this.zap[j]) {
          j++;
        } else {
          throw new ParseException("Unexpected character");
        }
      }
      i += k;
    }
    throw new ParseException("Unexpected EOF");
  }
  
  private final boolean zay(BufferedReader paramBufferedReader, boolean paramBoolean)
    throws FastParser.ParseException, IOException
  {
    char c = zai(paramBufferedReader);
    if (c != '"')
    {
      char[] arrayOfChar;
      if (c != 'f')
      {
        if (c != 'n')
        {
          if (c == 't')
          {
            if (paramBoolean) {
              arrayOfChar = zac;
            } else {
              arrayOfChar = zab;
            }
            zax(paramBufferedReader, arrayOfChar);
            return true;
          }
          paramBufferedReader = new StringBuilder(19);
          paramBufferedReader.append("Unexpected token: ");
          paramBufferedReader.append(c);
          throw new ParseException(paramBufferedReader.toString());
        }
        zax(paramBufferedReader, zaa);
        return false;
      }
      if (paramBoolean) {
        arrayOfChar = zae;
      } else {
        arrayOfChar = zad;
      }
      zax(paramBufferedReader, arrayOfChar);
      return false;
    }
    if (!paramBoolean) {
      return zay(paramBufferedReader, true);
    }
    throw new ParseException("No boolean value found in string");
  }
  
  private final boolean zaz(BufferedReader paramBufferedReader, FastJsonResponse paramFastJsonResponse)
    throws FastParser.ParseException, IOException
  {
    Map localMap = paramFastJsonResponse.getFieldMappings();
    Object localObject = zaq(paramBufferedReader);
    Integer localInteger = Integer.valueOf(1);
    if (localObject != null)
    {
      while (localObject != null)
      {
        FastJsonResponse.Field localField = (FastJsonResponse.Field)localMap.get(localObject);
        if (localField == null)
        {
          localObject = zar(paramBufferedReader);
        }
        else
        {
          this.zat.push(Integer.valueOf(4));
          int i = localField.zaa;
          switch (i)
          {
          default: 
            paramBufferedReader = new StringBuilder(30);
            paramBufferedReader.append("Invalid field type ");
            paramBufferedReader.append(i);
            throw new ParseException(paramBufferedReader.toString());
          case 11: 
            if (localField.zab)
            {
              i = zai(paramBufferedReader);
              if (i == 110)
              {
                zax(paramBufferedReader, zaa);
                paramFastJsonResponse.addConcreteTypeArrayInternal(localField, localField.zae, null);
              }
              else
              {
                this.zat.push(Integer.valueOf(5));
                if (i == 91) {
                  paramFastJsonResponse.addConcreteTypeArrayInternal(localField, localField.zae, zav(paramBufferedReader, localField));
                } else {
                  throw new ParseException("Expected array start");
                }
              }
            }
            else
            {
              i = zai(paramBufferedReader);
              if (i == 110)
              {
                zax(paramBufferedReader, zaa);
                paramFastJsonResponse.addConcreteTypeInternal(localField, localField.zae, null);
              }
              else
              {
                this.zat.push(localInteger);
                if (i == 123) {
                  try
                  {
                    localObject = localField.zad();
                    zaz(paramBufferedReader, (FastJsonResponse)localObject);
                    paramFastJsonResponse.addConcreteTypeInternal(localField, localField.zae, (FastJsonResponse)localObject);
                  }
                  catch (IllegalAccessException paramBufferedReader)
                  {
                    throw new ParseException("Error instantiating inner object", paramBufferedReader);
                  }
                  catch (InstantiationException paramBufferedReader)
                  {
                    throw new ParseException("Error instantiating inner object", paramBufferedReader);
                  }
                } else {
                  throw new ParseException("Expected start of object");
                }
              }
            }
            break;
          case 10: 
            i = zai(paramBufferedReader);
            if (i == 110)
            {
              zax(paramBufferedReader, zaa);
              localObject = null;
            }
            else
            {
              if (i != 123) {
                break label714;
              }
              this.zat.push(localInteger);
              localObject = new HashMap();
            }
            for (;;)
            {
              i = zai(paramBufferedReader);
              if (i == 0) {
                break;
              }
              if (i != 34)
              {
                if (i != 125) {
                  continue;
                }
                zaw(1);
              }
              else
              {
                String str = zaA(paramBufferedReader, this.zap, this.zar, null);
                if (zai(paramBufferedReader) != ':')
                {
                  paramBufferedReader = String.valueOf(str);
                  if (paramBufferedReader.length() != 0) {
                    paramBufferedReader = "No map value found for key ".concat(paramBufferedReader);
                  } else {
                    paramBufferedReader = new String("No map value found for key ");
                  }
                  throw new ParseException(paramBufferedReader);
                }
                if (zai(paramBufferedReader) != '"')
                {
                  paramBufferedReader = String.valueOf(str);
                  if (paramBufferedReader.length() != 0) {
                    paramBufferedReader = "Expected String value for key ".concat(paramBufferedReader);
                  } else {
                    paramBufferedReader = new String("Expected String value for key ");
                  }
                  throw new ParseException(paramBufferedReader);
                }
                ((HashMap)localObject).put(str, zaA(paramBufferedReader, this.zap, this.zar, null));
                c = zai(paramBufferedReader);
                if (c == ',') {
                  break label700;
                }
                if (c != '}') {
                  break label664;
                }
                zaw(1);
              }
              paramFastJsonResponse.zaB(localField, (Map)localObject);
              break label778;
              paramBufferedReader = new StringBuilder(48);
              paramBufferedReader.append("Unexpected character while parsing string map: ");
              paramBufferedReader.append(c);
              throw new ParseException(paramBufferedReader.toString());
            }
            throw new ParseException("Unexpected EOF");
            throw new ParseException("Expected start of a map object");
          case 9: 
            paramFastJsonResponse.zal(localField, Base64Utils.decodeUrlSafe(zap(paramBufferedReader, this.zaq, this.zas, zaf)));
            break;
          case 8: 
            label664:
            label700:
            label714:
            paramFastJsonResponse.zal(localField, Base64Utils.decode(zap(paramBufferedReader, this.zaq, this.zas, zaf)));
          }
          for (;;)
          {
            label778:
            break;
            if (localField.zab)
            {
              paramFastJsonResponse.zaC(localField, zau(paramBufferedReader, zal));
            }
            else
            {
              paramFastJsonResponse.zaA(localField, zao(paramBufferedReader));
              continue;
              if (localField.zab)
              {
                paramFastJsonResponse.zaj(localField, zau(paramBufferedReader, zak));
              }
              else
              {
                paramFastJsonResponse.zai(localField, zay(paramBufferedReader, false));
                continue;
                if (localField.zab)
                {
                  paramFastJsonResponse.zac(localField, zau(paramBufferedReader, zan));
                }
                else
                {
                  paramFastJsonResponse.zaa(localField, zas(paramBufferedReader));
                  continue;
                  if (localField.zab)
                  {
                    paramFastJsonResponse.zao(localField, zau(paramBufferedReader, zaj));
                  }
                  else
                  {
                    paramFastJsonResponse.zam(localField, zaj(paramBufferedReader));
                    continue;
                    if (localField.zab)
                    {
                      paramFastJsonResponse.zas(localField, zau(paramBufferedReader, zai));
                    }
                    else
                    {
                      paramFastJsonResponse.zaq(localField, zak(paramBufferedReader));
                      continue;
                      if (localField.zab)
                      {
                        paramFastJsonResponse.zay(localField, zau(paramBufferedReader, zah));
                      }
                      else
                      {
                        paramFastJsonResponse.zax(localField, zan(paramBufferedReader));
                        continue;
                        if (localField.zab)
                        {
                          paramFastJsonResponse.zag(localField, zau(paramBufferedReader, zam));
                        }
                        else
                        {
                          paramFastJsonResponse.zae(localField, zat(paramBufferedReader));
                          continue;
                          if (localField.zab) {
                            paramFastJsonResponse.zav(localField, zau(paramBufferedReader, zag));
                          } else {
                            paramFastJsonResponse.zau(localField, zal(paramBufferedReader));
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          zaw(4);
          zaw(2);
          char c = zai(paramBufferedReader);
          if (c != ',')
          {
            if (c == '}')
            {
              localObject = null;
            }
            else
            {
              paramBufferedReader = new StringBuilder(55);
              paramBufferedReader.append("Expected end of object or field separator, but found: ");
              paramBufferedReader.append(c);
              throw new ParseException(paramBufferedReader.toString());
            }
          }
          else {
            localObject = zaq(paramBufferedReader);
          }
        }
      }
      zaw(1);
      return true;
    }
    zaw(1);
    return false;
  }
  
  /* Error */
  public void parse(java.io.InputStream paramInputStream, T paramT)
    throws FastParser.ParseException
  {
    // Byte code:
    //   0: new 135	java/io/BufferedReader
    //   3: dup
    //   4: new 511	java/io/InputStreamReader
    //   7: dup
    //   8: aload_1
    //   9: invokespecial 514	java/io/InputStreamReader:<init>	(Ljava/io/InputStream;)V
    //   12: sipush 1024
    //   15: invokespecial 517	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   18: astore_1
    //   19: aload_0
    //   20: getfield 126	com/google/android/gms/common/server/response/FastParser:zat	Ljava/util/Stack;
    //   23: iconst_0
    //   24: invokestatic 284	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   27: invokevirtual 288	java/util/Stack:push	(Ljava/lang/Object;)Ljava/lang/Object;
    //   30: pop
    //   31: aload_0
    //   32: aload_1
    //   33: invokespecial 251	com/google/android/gms/common/server/response/FastParser:zai	(Ljava/io/BufferedReader;)C
    //   36: istore_3
    //   37: iload_3
    //   38: ifeq +196 -> 234
    //   41: iload_3
    //   42: bipush 91
    //   44: if_icmpeq +74 -> 118
    //   47: iload_3
    //   48: bipush 123
    //   50: if_icmpne +25 -> 75
    //   53: aload_0
    //   54: getfield 126	com/google/android/gms/common/server/response/FastParser:zat	Ljava/util/Stack;
    //   57: iconst_1
    //   58: invokestatic 284	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   61: invokevirtual 288	java/util/Stack:push	(Ljava/lang/Object;)Ljava/lang/Object;
    //   64: pop
    //   65: aload_0
    //   66: aload_1
    //   67: aload_2
    //   68: invokespecial 351	com/google/android/gms/common/server/response/FastParser:zaz	(Ljava/io/BufferedReader;Lcom/google/android/gms/common/server/response/FastJsonResponse;)Z
    //   71: pop
    //   72: goto +127 -> 199
    //   75: new 7	com/google/android/gms/common/server/response/FastParser$ParseException
    //   78: astore_2
    //   79: new 114	java/lang/StringBuilder
    //   82: astore 4
    //   84: aload 4
    //   86: bipush 19
    //   88: invokespecial 117	java/lang/StringBuilder:<init>	(I)V
    //   91: aload 4
    //   93: ldc_w 293
    //   96: invokevirtual 296	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   99: pop
    //   100: aload 4
    //   102: iload_3
    //   103: invokevirtual 299	java/lang/StringBuilder:append	(C)Ljava/lang/StringBuilder;
    //   106: pop
    //   107: aload_2
    //   108: aload 4
    //   110: invokevirtual 168	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   113: invokespecial 153	com/google/android/gms/common/server/response/FastParser$ParseException:<init>	(Ljava/lang/String;)V
    //   116: aload_2
    //   117: athrow
    //   118: aload_0
    //   119: getfield 126	com/google/android/gms/common/server/response/FastParser:zat	Ljava/util/Stack;
    //   122: iconst_5
    //   123: invokestatic 284	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   126: invokevirtual 288	java/util/Stack:push	(Ljava/lang/Object;)Ljava/lang/Object;
    //   129: pop
    //   130: aload_2
    //   131: invokevirtual 389	com/google/android/gms/common/server/response/FastJsonResponse:getFieldMappings	()Ljava/util/Map;
    //   134: astore 4
    //   136: aload 4
    //   138: invokeinterface 520 1 0
    //   143: iconst_1
    //   144: if_icmpne +77 -> 221
    //   147: aload 4
    //   149: invokeinterface 524 1 0
    //   154: invokeinterface 530 1 0
    //   159: invokeinterface 535 1 0
    //   164: checkcast 537	java/util/Map$Entry
    //   167: invokeinterface 540 1 0
    //   172: checkcast 344	com/google/android/gms/common/server/response/FastJsonResponse$Field
    //   175: astore 4
    //   177: aload_0
    //   178: aload_1
    //   179: aload 4
    //   181: invokespecial 411	com/google/android/gms/common/server/response/FastParser:zav	(Ljava/io/BufferedReader;Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;)Ljava/util/ArrayList;
    //   184: astore 5
    //   186: aload_2
    //   187: aload 4
    //   189: aload 4
    //   191: getfield 405	com/google/android/gms/common/server/response/FastJsonResponse$Field:zae	Ljava/lang/String;
    //   194: aload 5
    //   196: invokevirtual 409	com/google/android/gms/common/server/response/FastJsonResponse:addConcreteTypeArrayInternal	(Lcom/google/android/gms/common/server/response/FastJsonResponse$Field;Ljava/lang/String;Ljava/util/ArrayList;)V
    //   199: aload_0
    //   200: iconst_0
    //   201: invokespecial 291	com/google/android/gms/common/server/response/FastParser:zaw	(I)V
    //   204: aload_1
    //   205: invokevirtual 543	java/io/BufferedReader:close	()V
    //   208: return
    //   209: astore_1
    //   210: ldc_w 545
    //   213: ldc_w 547
    //   216: invokestatic 553	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   219: pop
    //   220: return
    //   221: new 7	com/google/android/gms/common/server/response/FastParser$ParseException
    //   224: astore_2
    //   225: aload_2
    //   226: ldc_w 555
    //   229: invokespecial 153	com/google/android/gms/common/server/response/FastParser$ParseException:<init>	(Ljava/lang/String;)V
    //   232: aload_2
    //   233: athrow
    //   234: new 7	com/google/android/gms/common/server/response/FastParser$ParseException
    //   237: astore_2
    //   238: aload_2
    //   239: ldc_w 557
    //   242: invokespecial 153	com/google/android/gms/common/server/response/FastParser$ParseException:<init>	(Ljava/lang/String;)V
    //   245: aload_2
    //   246: athrow
    //   247: astore_2
    //   248: goto +17 -> 265
    //   251: astore 4
    //   253: new 7	com/google/android/gms/common/server/response/FastParser$ParseException
    //   256: astore_2
    //   257: aload_2
    //   258: aload 4
    //   260: invokespecial 560	com/google/android/gms/common/server/response/FastParser$ParseException:<init>	(Ljava/lang/Throwable;)V
    //   263: aload_2
    //   264: athrow
    //   265: aload_1
    //   266: invokevirtual 543	java/io/BufferedReader:close	()V
    //   269: goto +14 -> 283
    //   272: astore_1
    //   273: ldc_w 545
    //   276: ldc_w 547
    //   279: invokestatic 553	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   282: pop
    //   283: aload_2
    //   284: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	285	0	this	FastParser
    //   0	285	1	paramInputStream	java.io.InputStream
    //   0	285	2	paramT	T
    //   36	67	3	c	char
    //   82	108	4	localObject	Object
    //   251	8	4	localIOException	IOException
    //   184	11	5	localArrayList	ArrayList
    // Exception table:
    //   from	to	target	type
    //   204	208	209	java/io/IOException
    //   19	37	247	finally
    //   53	72	247	finally
    //   75	118	247	finally
    //   118	199	247	finally
    //   199	204	247	finally
    //   221	234	247	finally
    //   234	247	247	finally
    //   253	265	247	finally
    //   19	37	251	java/io/IOException
    //   53	72	251	java/io/IOException
    //   75	118	251	java/io/IOException
    //   118	199	251	java/io/IOException
    //   199	204	251	java/io/IOException
    //   221	234	251	java/io/IOException
    //   234	247	251	java/io/IOException
    //   265	269	272	java/io/IOException
  }
  
  public static class ParseException
    extends Exception
  {
    public ParseException(String paramString)
    {
      super();
    }
    
    public ParseException(String paramString, Throwable paramThrowable)
    {
      super(paramThrowable);
    }
    
    public ParseException(Throwable paramThrowable)
    {
      super();
    }
  }
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\server\response\FastParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */