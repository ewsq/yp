package com.wzy.design.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OSUtil {
	public static String getClientOS(String userAgent)
    {
        String cos = "unknow os";
       
        Pattern p = Pattern.compile(".*(Windows NT 6\\.1).*");
        Matcher m = p.matcher(userAgent);
        if(m.find())
        {
            cos = "Win 7";
            return cos;
        }
       
        p = Pattern.compile(".*(Windows NT 5\\.1|Windows XP).*");
        m = p.matcher(userAgent);
        if(m.find())
        {
            cos = "WinXP";
            return cos;
        }
       
        p = Pattern.compile(".*(Windows NT 5\\.2).*");
        m = p.matcher(userAgent);
        if(m.find())
        {
            cos = "Win2003";
            return cos;
        }
       
        p = Pattern.compile(".*(Win2000|Windows 2000|Windows NT 5\\.0).*");
        m = p.matcher(userAgent);
        if(m.find())
        {
            cos = "Win2000";
            return cos;
        }
       
        p = Pattern.compile(".*(Mac|apple|MacOS8).*");
        m = p.matcher(userAgent);
        if(m.find())
        {
            cos = "MAC";
            return cos;
        }
       
        p = Pattern.compile(".*(WinNT|Windows NT).*");
        m = p.matcher(userAgent);
        if(m.find())
        {
            cos = "WinNT";
            return cos;
        }
       
        p = Pattern.compile(".*Linux.*");
        m = p.matcher(userAgent);
        if(m.find())
        {
            cos = "Linux";
            return cos;
        }
       
        p = Pattern.compile(".*(68k|68000).*");
        m = p.matcher(userAgent);
        if(m.find())
        {
            cos = "Mac68k";
            return cos;
        }
       
        p = Pattern.compile(".*(9x 4.90|Win9(5|8)|Windows 9(5|8)|95/NT|Win32|32bit).*");
        m = p.matcher(userAgent);
        if(m.find())
        {
            cos = "Win9x";
            return cos;
        }
       
        return cos;
    }
}
