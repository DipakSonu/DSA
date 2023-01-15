class ReplaceAllZero {

    public static void main(String[] args) {
        
        int num=10068;
        int response=convertfive(num);
        System.out.println("\n\t Resonse "+response);

    }

    public static int convertfive(int num) {
        // Your code here
        String intStr=String.valueOf(num);
        String replaceZero=intStr.replace("0", "5");
        //System.out.println("\n\t IntStr : "+intStr+" After replacing : "+replaceZero);
        return Integer.parseInt(replaceZero);
    }
}