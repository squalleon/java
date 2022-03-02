package com.spiri.my;

public class Base62Util {
    static final char[] BASE62 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".toCharArray();

    public static String encoding(int value) {
        final StringBuilder sb = new StringBuilder();
        do {
            int i = value % 62;
            sb.append(BASE62[i]);
            value /= 62;
        } while (value > 0);
        return sb.toString();
    }

    public static int decoding(String value) {
        int result=0;
        int power=1;
        for (int i = 0; i < value.length(); i++) {
            int digit = new String(BASE62).indexOf(value.charAt(i));
            result += digit * power;
            power *= 62;
        }
        return result;
    }

    public static void main(String[] args) {
        //https://dict.naver.com/
        String url = "search.dict?dicQuery=spring&query=spring&target=dic&ie=utf8&query_utf=&isOnlyViewEE=";

        String enc = encoding(100000000);//Integer.valueOf(url));
        System.out.println("enc=" + enc);
//        String dec = decoding(enc);
//        System.out.println("dec=" + dec);

    }
}
