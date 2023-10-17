package com.google.android.gms.common.server.response;

import java.io.BufferedReader;
import java.io.IOException;

abstract interface zai<O>
{
  public abstract O zaa(FastParser paramFastParser, BufferedReader paramBufferedReader)
    throws FastParser.ParseException, IOException;
}


/* Location:              C:\Users\Ria\Documents\slope apk\dex-tools-v2.4\classes-dex2jar.jar!\com\google\android\gms\common\server\response\zai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */