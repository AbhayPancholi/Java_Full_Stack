class CheckName {
    public static void main(String[] ar) {
        String name = ar[0];
	int counter = 0;
        char[] namearr = name.toCharArray();
        for (int i = 0; i < namearr.length; i++) {
            if (Character.isLetter(namearr[i])) {
		counter = counter + 1;
                // Do nothing for valid characters
            } else {
                System.out.println("Your name is not valid");
                break;
            }
        }
	if(counter == namearr.length){
	System.out.println("Your name is valid: "+namearr.length);}
    }
}
