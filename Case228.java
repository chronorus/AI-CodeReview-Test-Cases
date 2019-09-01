/*
Case228 : Week Year ("YYYY") should not be used for date formatting
*/
package com.mycompany.mavenproject1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author john
 */
public class Case228 {
    public void doit() throws ParseException {
        Date date = new SimpleDateFormat("yyyy/MM/dd").parse("2015/12/31");
        String result = new SimpleDateFormat("YYYY/MM/dd").format(date);   //Noncompliant; yields '2016/12/31'

    }
}
