/* TEMPLATE GENERATED TESTCASE FILE
Filename: CWE191_Integer_Underflow__int_getCookies_Servlet_predec_52b.java
Label Definition File: CWE191_Integer_Underflow__int.label.xml
Template File: sources-sinks-52b.tmpl.java
*/
/*
 * @description
 * CWE: 191 Integer Underflow
 * BadSource: getCookies_Servlet Read data from the first cookie using getCookies()
 * GoodSource: A hardcoded non-zero, non-min, non-max, even number
 * Sinks: decrement
 *    GoodSink: Ensure there will not be an underflow before decrementing data
 *    BadSink : Decrement data, which can cause an Underflow
 * Flow Variant: 52 Data flow: data passed as an argument from one method to another to another in three different classes in the same package
 *
 * */

package testcases.CWE191_Integer_Underflow.s05;
import testcasesupport.*;

import javax.servlet.http.*;

public class CWE191_Integer_Underflow__int_getCookies_Servlet_predec_52b
{
    public void badSink(int data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE191_Integer_Underflow__int_getCookies_Servlet_predec_52c()).badSink(data , request, response);
    }

    /* goodG2B() - use goodsource and badsink */
    public void goodG2BSink(int data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE191_Integer_Underflow__int_getCookies_Servlet_predec_52c()).goodG2BSink(data , request, response);
    }

    /* goodB2G() - use badsource and goodsink */
    public void goodB2GSink(int data , HttpServletRequest request, HttpServletResponse response) throws Throwable
    {
        (new CWE191_Integer_Underflow__int_getCookies_Servlet_predec_52c()).goodB2GSink(data , request, response);
    }
}
