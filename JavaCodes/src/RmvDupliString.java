class RmvDupliString {

    public static void main(String[] args) {


        String str = "programming";
        String result = "";
        String dupli = "";

        for (int i = 0; i < str.length(); i++) {
            if (result.indexOf(str.charAt(i)) == -1) {
                result += str.charAt(i);
            }else{
                dupli += str.charAt(i);
            }
        }

        System.out.println(result);
        System.out.println(dupli);
    }
}