class ConfusedPappu{

    public static void main(String[] args) {
        
        long amt = 66;

        System.out.println("\n\t Response : "+findDiff(amt));
    }
    public static long findDiff(long amount) {
        // code here
        String str = String.valueOf(amount);
        StringBuilder sb = new StringBuilder(str);
        long wrongAmt=0;

        for(int i=0; i<sb.length(); i++){

            if(sb.charAt(i)=='6'){

                sb.setCharAt(i, '9');
               
            }
            wrongAmt = Long.parseLong(String.valueOf(sb.toString()));

        }
        return wrongAmt-amount;
    }
}