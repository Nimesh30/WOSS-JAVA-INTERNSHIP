class RmvDupliString {

    public static void main(String[] args) {


        String str = "programming";
        StringBuilder result = new StringBuilder();
        StringBuilder dupli = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (result.toString().indexOf(str.charAt(i)) == -1) {
                result.append(str.charAt(i));
            }else{
                dupli.append(str.charAt(i));
            }
        }

        System.out.println(result);
        System.out.println(dupli);
    }
}