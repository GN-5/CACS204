class StringDemo {
    public static void main(String args[]) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = s2;
        String strHello = new String("Hello");

        System.out.println("s1 refers to : " + s1);
        System.out.println("s2 refers to : " + s2);
        System.out.println("s3 refers to : " + s3);
        System.out.println("strHello refers to : " + strHello);

        s1 = "Java";
        s2.concat("World");
        String newStr = s3.concat("java world");

        System.out.println("s1 refers to : " + s1);
        System.out.println("s2 refers to : " + s2);
        System.out.println("s3 refers to : " + s3);
        System.out.println("strHello refers to : " + strHello);
        System.out.println("newStr refers to : " + newStr);

        System.out.println(strHello.equals("Hello"));
        System.out.println(strHello == "Hello");
        System.out.println(s1.compareTo("Hello World"));

        System.out.println(s1.toString());
        System.out.println(newStr.strip());
        System.out.println(newStr.isEmpty());

    }
}