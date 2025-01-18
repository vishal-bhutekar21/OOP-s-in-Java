public class SearchInstrings {
    public static void main(String[] args) {
        
        String name="vishal bhutekar";

        char target='a';

        System.out.println(search( name,target));




    }

    static boolean search (String s,char target){

        if(s.length()==0){

            return false;
        }

            for(int i=0;i<s.length();i++){

                if(target==s.charAt(i)){
                    return true;
                }


            }

            return false;
        

       

      
    }
}
