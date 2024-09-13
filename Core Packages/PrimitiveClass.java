class PrimitiveClass {
    public static void main(String[] args){
        Integer intobj = Integer.valueOf(20);
        Float floatobj = Float.valueOf("20.05");
        Double doubleobj = Double.valueOf("30.000050");

        int i = intobj.intValue();
        float f = floatobj.floatValue();
        double d = doubleobj.doubleValue();

        System.out.println(i + f + d);
    }
}