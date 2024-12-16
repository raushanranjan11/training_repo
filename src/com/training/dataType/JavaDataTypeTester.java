package com.training.dataType;

public class JavaDataTypeTester {

    int a;
    short sec ;
    long dd ;
    byte byteNumber ;
    float floatNum = 123424325346423131231356.34353624324444444546464f ;
    double doubleNum = 12.4 ;
    char k;
    boolean flag ;
    String s;


    public static void main(String[] args) {
        JavaDataTypeTester test = new JavaDataTypeTester();
        System.out.println("value :" + test.a + " "+ test.sec + " "+ test.dd+ " "+ test.byteNumber+ " "+ test.floatNum+ " "+ test.doubleNum
                + " "+ test.k+ " "+ test.flag + " "+test.s);

    /*int integer 4 bytes
      short integer 2 bytes
      long integer 8 bytes
      byte integer 1 byte
        float 4bytes 2.3456
      double 8 bytes
      char 2 bytes unicode standard
        boolean 1 bit*/

     /* int a= 2;
    short sec = 3;
    long dd = 345666L;
    byte byteNumber = 128;
    float floatNum = 2.3456f;
    double doubleNum = 2.34566;
    char k= 'S';
    boolean flag = false;*/
        byte byteNumber = 127;
        int a= (int)266666666L;

        Integer intObj = 123;
        int a1= 2;
        double doubleNumber = a1;
        System.out.println(doubleNumber);


        System.out.println(intObj);

        System.out.println(intObj.intValue());

        String numericValue = "12345";
        System.out.println(" Integer value: "+Integer.valueOf(numericValue));

        System.out.println( (int)1233453654763454545L);//1233453654763454545
        System.out.println( (int)1233L);
        System.out.println(" Integer value: "+Double.valueOf(numericValue));
        System.out.println(new A());

    /*long dd = 345666773243534L;

    Integer a1 = 123;

    byte byteValue1 = 2;
    byte byteValue2 = 4;
    byte byteResult = (byte)(byteValue1 + byteValue2);

    System.out.println(byteValue1+byteValue2);

    System.out.println("Byte: " + byteResult);

    short shortValue1 = 2;
    short shortValue2 = 4;
    short shortResult = (short)(shortValue1 + shortValue2);

    System.out.println("Short: " + shortResult);

    int intValue1 = 2;
    int intValue2 = 4;
    int intResult = intValue1 + intValue2;

    System.out.println("Int: " + intResult);

    long longValue1 = 2L;
    long longValue2 = 4L;
    long longResult = longValue1 + longValue2;

    System.out.println("Long: " + longResult);

    float floatValue1 = 2.0f;
    float floatValue2 = 4.0f;
    float floatResult = floatValue1 + floatValue2;

    System.out.println("Float: " + floatResult);

    double doubleValue1 = 2.0;
    double doubleValue2 = 4.0;
    double doubleResult = doubleValue1 + doubleValue2;

    System.out.println("Double: " + doubleResult);

    boolean booleanValue = true;

    System.out.println("Boolean: " + booleanValue);

    char charValue = 'A';

    System.out.println("Char: " + charValue);*/
    }



}
class A{

    @Override
    public String toString() {
        return "A{ Training}";
    }
}