class Conditional {

    public static void main(String[] ar) {
        int a = Integer.parseInt(ar[0]);
        int b = Integer.parseInt(ar[1]);

        if (a > b) {
            System.out.println(a+" is greater than "+b);
        } else if (b > a) {
            System.out.println(b+" is larger than "+a);
        } else {
            System.out.println("Both numbers are equal");
        }
    }
}


